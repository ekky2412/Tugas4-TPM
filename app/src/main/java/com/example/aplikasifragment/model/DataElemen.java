package com.example.aplikasifragment.model;

import java.util.ArrayList;

public class DataElemen {
    private static String[] namaElemen = {
            "Anemo",
            "Pyro",
            "Electro",
            "Hydro",
            "Cryo",
            "Geo"
    };

    private static String[] deskripsiElemen = {
            "Archon dari Elemen Anemo adalah Barbatos, yang berdomisili di Mondstat",
            "Archon dari Elemen Pyro adalah Murata, yang berdomisili di Natlan",
            "Archon dari Elemen Electro adalah Baal, yang berdomisili di Inazuma",
            "Domisili dari Elemen Hydro adalah Fontaine",
            "Archon dari Elemen Cryo adalah Tsaritsa, yang berdomisili di Snezhnaya",
            "Archon dari Elemen Geo adalah Morax, yang berdomisili di Liyue"
    };

    private static String[] gambarElemen = {
            "https://static.wikia.nocookie.net/gensin-impact/images/a/a4/Element_Anemo.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/e/e8/Element_Pyro.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/73/Element_Electro.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/3/35/Element_Hydro.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Element_Cryo.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/4/4a/Element_Geo.png"
    };

    public static ArrayList<ModelElemen> getGroup(){
        ModelElemen modelElemen = null;
        ArrayList<ModelElemen> elemenList = new ArrayList<>();
        for(int i=0; i<namaElemen.length; i++ ){
            modelElemen = new ModelElemen();
            modelElemen.setNamaElemen(namaElemen[i]);
            modelElemen.setDeskripsiElemen(deskripsiElemen[i]);
            modelElemen.setGambarElemen(gambarElemen[i]);

            elemenList.add(modelElemen);
        }

        return elemenList;
    }

}
