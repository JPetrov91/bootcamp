#!/bin/bash
set -x
cdir="/home/valdis/code/JTM_teacher"
if [ ! -d "/home/valdis/code/JTM" ]; then
  echo "Target dir doesn't exist!" 
  exit 1
fi
cd "${cdir}/../JTM"
# Delete old git repo
rm -fr .git 2>/dev/null
# and create new one
git init
cp ${cdir}/.gitignore .gitignore
git add -A
git commit -a -m "Updated at $(date +'%F %R')"
# Synchronize created git repo with remote server
cd .git
rsync -e "ssh -p 22" -avzr --delete-after "." "valdis@odo.lv:/home/git/JTM"
