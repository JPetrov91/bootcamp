#!/bin/bash
cd ~/workspace
for f in Aigars_Gridjusko Andris_Silajs Arturs_Solomencevs Davids_Miezaks Dmitry_Degtiariov Dmitrijs_Bessmertnijs Edgars_Rumkovskis Ella_Zaiceva Elvita_Zurkevica Ernests_Subhankulovs Gustavs_Brigmanis Iaroslav_Morozov Ilmars_Lacplesis Janis_Pelss Jurijs_Petrovs Kaspars_Fisers Maris_Salenieks Reinis_Dzenis Roman_Samarskyi Romans_Alohins Romans_Zelonkins Shokhruz_Sattarov Svetlana_Kovtun Valts_Klibikis Viktorija_Belina Viktorija_Geseltina Vladislavs_Voice
do
  echo $f
  rm -fr $f
  svn co http://bcserver/svn/bootcamp/$f
done
