#!/bin/bash
# set -x
cd ~/workspace
for i in $(ls -d *|grep -vE "^Test|^Valdis_Vitolins"); do
  echo $i
  # go to sample project
  cd Valdis_Vitolins
  # copy files from sample project to other
  cp --parents lib/JTM.jar ../$i/
  cp --parents src/main/resources/log4j.properties ../$i/
  cp --parents src/main/java/org/testSuite/AllTests.java ../$i/
  cp --parents .classpath ../$i/
  cd ..
done
