#!/bin/bash
cd ~/workspace
for f in `ls -d */|grep -vE "^Valdis|^Test"|tr -d "/"` 
do
  echo "*** $f ***"
  cd $f
  git reset --hard HEAD --
  git clean -f -d
  git pull origin master
  cd ..
done
