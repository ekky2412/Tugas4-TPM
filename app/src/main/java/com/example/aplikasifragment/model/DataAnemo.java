package com.example.aplikasifragment.model;

import com.example.aplikasifragment.R;

import java.util.ArrayList;

public class DataAnemo {

    private static String[] namaKarakter = {
            "Jean",
            "Sucrose",
            "Venti",
            "Xiao"
    };

    private static String[] rarityKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png"
    };

    private static String[] iconWeapon = {
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Sword.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Icon_Catalyst.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Bow.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Icon_Polearm.png"
    };

    private static String[] tipeWeapon = {
            "Pedang",
            "Katalis",
            "Panah",
            "Tombak"
    };

    private static String[] fotoKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/0/0e/Character_Jean_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/22/Character_Sucrose_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/76/Character_Venti_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Character_Xiao_Card.jpg"
    };

    private static String[] detailKarakter = {
            "Jean Gunnhildr adalah karakter Anemo yang dapat dimainkan di Genshin Impact. Dia adalah putri dari Frederica Gunnhildr dan Seamus Pegg, dan kakak dari Barbara.",
            "Sucrose adalah seorang alkemis yang berspesialisasi dalam bio-alkimia, dia juga menjabat sebagai asisten Albedo, kepala alkemis dari Knights of Favonius.",
            "Venti adalah penyair berjiwa bebas, pecinta anggur di Mondstadt dan tempat menjelmanya Barbatos saat ini, Anemo Archon.",
            "Xiao, nama Yaksha Alatus, adalah seorang ahli dan satu-satunya anggota yang tersisa dari Lima Yaksha yang dikirim oleh Morax untuk menaklukkan roh-roh jahat yang mengganggu Liyue. Dia saat ini tinggal di Wangshu Inn, di mana dia mengasingkan diri dari keramaian dan interaksi manusia."
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
