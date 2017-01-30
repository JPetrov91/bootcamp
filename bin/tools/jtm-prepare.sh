#!/bin/bash
# Uncomment next line to trace script execution
set -x
# Set target dir
target="JTM"
# Get source dir, considering script can be executed from different places
cdir=$(dirname "$0")
cd $cdir/..
srcd=$(pwd)
echo "srcd=$srcd"
tard="$srcd/../$target"
echo "tard=$tard"
# Create target dir, if necessary
if [ ! -d "$tard" ]; then
  mkdir $tard
fi
cd $tard
if [ $? -ne 0 ]; then
  echo "Error: could not change dir to $tard" >&2
  exit 1
fi
# A: Remove everything from target dir,
# also need to remove version control files
# because we don't need history for JTM project
rmlist=$(ls -a1|grep -vE "^\.$|^\.\.$")
# B: don't remove .git when testing JTM project:
# rmlist=$(ls -a1|grep -vE "^\.$|^\.\.$|^\.git")
rm -fr $rmlist
cd $srcd
# Copy all files except unnecessary to target project
cplist=$(ls -a1|grep -vE "^\.$|^\.\.$|^\.settings$|^\.git|^additional$|^tools$")
cp -r $cplist $tard
# create new jar with test classes
mvn clean test-compile
jar cf tools/JTM.jar -C target/test-classes org
if [ $? -ne 0 ]; then
  echo "Error: jar file was not recreated"
  exit 1
fi
# copy target project files
cp $srcd/tools/JTM.jar $tard/lib/
cp $srcd/tools/pom.xml $tard/pom.xml
cp $srcd/tools/log4j.properties $tard/src/main/resources/log4j.properties
cp $srcd/tools/project $tard/.project

cd $tard

# remove implementations from the activity classes
list="$(find -name "*.java"|grep -v Test|sort) ./src/main/java/org/testSuite/AllTests.java"
for item in $list; do
  sed -i 's/\/\/ RMCOMM\s*//g' $item
  sed -i 's/\/\/ RMLINE.*//g' $item
  sed -i '/\/\/ START/,/\/\/ END/ d' $item
done
# Delete compiled classes
cd $tard/target/classes
rm -fr *
cd $tard
# Delete test implementation
rm -fr src/test
# Delete Knowledge Checks
rm -fr "doc/en/tests"
rm -fr "doc/lv/tests"
# Delete logs
rm logs/test.log 2>/dev/null
# Delete jacoco file
rm jacoco.exec 2>/dev/null

# Delete *.java files for activity02
cd src/main/java/org/activity02
rm Hello.java
cd $tard

# Delete some files for activity07
cd src/main/java/org/activity07
rm Martian.java
rm Human.java
cd $tard

# Delete some files for activity08
cd src/main/java/org/activity08
rm SimpleCalcException.java
cd $tard

# Delete *.java files for activity15
cd src/main/java/org/activity15
rm Activity15.ucls Animal.java Bird.java Dog.java Hawk.java Mammal.java Animals.grn Animals.png
cd $tard

# Delete *.java files for activity17
cd src/main/java/org/activity17
rm CrocodileGreedy.java CrocodileSimple.java MoveSimple.java MoveGreedy.java BoardTest1.java CrocodileGame.grn  
cd $tard

# Delete DatabaseUnitTest1.java for activity18
cd src/main/java/org/activity18
rm DatabaseUnitTest1.java
cd $tard

# Delete entire target directory
rm -fr ./target

# Regenerate Eclipse settings
mvn eclipse:eclipse

# Prepare zip file
cd $srcd/..
zip -qr --exclude=*.git* $target.zip $target
mv $target.zip $tard
echo "Zip file=$tard/$target.zip"
echo "OK"
exit 0
