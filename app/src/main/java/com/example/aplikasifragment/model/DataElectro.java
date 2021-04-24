package com.example.aplikasifragment.model;

import java.util.ArrayList;

public class DataElectro {
    private static String[] namaKarakter = {
            "Beidou",
            "Fischl",
            "Keqing",
            "Lisa",
            "Razor"
    };

    private static String[] rarityKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png"
    };

    private static String[] iconWeapon = {
            "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Icon_Claymore.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Bow.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Sword.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Icon_Catalyst.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Icon_Claymore.png"
    };

    private static String[] tipeWeapon = {
            "Claymore",
            "Panah",
            "Pedang",
            "Katalis",
            "Claymore"
    };

    private static String[] fotoKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/8/84/Character_Beidou_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Character_Fischl_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/f/f4/Character_Keqing_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/d/dc/Character_Lisa_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/68/Character_Razor_Card.jpg"
    };

    private static String[] detailKarakter = {
            "Dia adalah kapten The Crux, kru terkenal di Liyue. Selain kemampuannya sebagai kapten armada dan kekuatannya yang luar biasa, banyak orang di Liyue mengenalnya karena kurangnya rasa takutnya terhadap Tianquan dari Liyue Qixing, Ningguang - suatu sifat yang dihargai oleh wanita lain, namun menjadi jengkel.",
            "Fischl adalah penyelidik untuk Persekutuan Petualang Mondstadt, ditemani oleh burung gagak malam Oz. Fischl mengaku berasal dari dunia di luar Teyvat. Dia adalah petualang pemberani dengan teori yang tampaknya aneh yang ternyata benar.",
            "Keqing adalah Yuheng dari Liyue Qixing. Dia adalah seseorang yang mencari jawabannya sendiri alih-alih membiarkan kekacauan mengamuk di Liyue. Keqing memilih jalannya sendiri dengan kekuatan dan kemampuannya sendiri, alih-alih membiarkan para dewa menentukan nasibnya.",
            "Setelah seorang grand mage diakui sebagai lulusan Sumeru Academia yang paling terkemuka dalam 200 tahun, Lisa telah kembali ke Mondstadt untuk menjadi Pustakawan Ksatria Favonius yang rendah hati.",
            "Ditinggalkan saat masih bayi, Razor dibawa oleh Serigala Utara, Andrius, dan dibesarkan oleh kawanan serigala di Wolvendom. Setelah kebetulan bertemu dengan Varka, Grand Master dari Ksatria Favonius dan Ksatria Boreas saat ini, dia perlahan mulai berintegrasi dengan manusia lagi."
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
