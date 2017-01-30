#!/bin/bash
cd ~/workspace
for i in $(ls -d */); do 
  echo "*** ${i} ****"
  cd "$i"
  svn revert -R .
  svn up 
  cd ..
done
