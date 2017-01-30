#!/bin/bash
cd ~/workspace
for f in Adrians_Jelisejevs Aleksandr_Larev Aleksandrs_Kantajevs Aleksandrs_Saromovs Arthur_Staseljun Artjoms_Livenskis Daniel_Zharov Deniss_Prohorenko Dmitry_Anashko Edgars_Lisenkovs Eduards_Morozovs Gatis_Spats Imants_Ostass Jevgenijs_Travcenko Oleg_Krjukov Oleksandr_Pustovyi Oskars_Zalcmanis Uldis_Lipskis Vjaceslavs_Cizovs Yury_Eizhvertinsh
do
  echo $f
  rm -fr $f
  git clone ssh://student@bcserver/home/git/$f
done
