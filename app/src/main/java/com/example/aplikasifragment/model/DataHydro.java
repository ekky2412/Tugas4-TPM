package com.example.aplikasifragment.model;

import java.util.ArrayList;

public class DataHydro {
    private static String[] namaKarakter = {
            "Barbara",
            "Mona",
            "Tartaglia",
            "Xingqiu"
    };

    private static String[] rarityKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png"
    };

    private static String[] iconWeapon = {
            "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Icon_Catalyst.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Icon_Catalyst.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Bow.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Sword.png"
    };

    private static String[] tipeWeapon = {
            "Katalis",
            "Katalis",
            "Panah",
            "Pedang"
    };

    private static String[] fotoKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/9/93/Character_Barbara_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/69/Character_Mona_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/4/4c/Character_Tartaglia_Card.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Character_Xingqiu_Card.jpg"
    };

    private static String[] detailKarakter = {
            "Barbara adalah putri dari Frederica Gunnhildr dan Seamus Pegg, dan adik perempuan Jean. Barbara adalah diakones dari Gereja Favonius dan memproklamirkan diri sebagai \"idola\" setelah mengetahui tentang mereka dari petualang pemberani Alice.",
            "Seorang ahli astrologi dengan keterampilan hebat dan kebanggaan yang sama besarnya, Mona telah tinggal di Mondstadt untuk menghindari kemarahan tuannya setelah tanpa disadari membaca buku harian yang terakhir.",
            "Tartaglia atau Childe adalah No 11 dari Sebelas Harbingers of the Fatui. Mengikuti bahaya kemanapun dia pergi, Childe selalu bersemangat menghadapi tantangan karena dia dianggap sebagai salah satu anggota Harbingers yang lebih berbahaya.",
            "Xingqiu adalah putra kedua dari Manajer Persekutuan Persekutuan Dagang Feiyun, sebuah kelompok berpengaruh di Liyue, dan juga memproklamirkan diri sebagai praktisi seni Klan Guhua."
    };

    public static ArrayList<ModelKarakter> getKarakter(){
        ModelKarakter modelKarakter = null;
        ArrayList<ModelKarakter> karakterList = new ArrayList<>();

        for(int i = 0; i < namaKarakter.length; i++ ){
            modelKarakter = new ModelKarakter(namaKarakter[i],detailKarakter[i],tipeWeapon[i],fotoKarakter[i],iconWeapon[i],rarityKarakter[i]);
            karakterList.add(modelKarakter);
        }
        return karakterList;
    }
}
