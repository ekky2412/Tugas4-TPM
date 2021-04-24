package com.example.aplikasifragment.model;

import java.util.ArrayList;

public class DataGeo {
    private static String[] namaKarakter = {
            "Albedo",
            "Ningguang",
            "Noelle",
            "Zhongli"
    };

    private static String[] rarityKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png"
    };

    private static String[] iconWeapon = {
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Sword.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Icon_Catalyst.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Icon_Claymore.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Icon_Polearm.png"
    };

    private static String[] tipeWeapon = {
            "Pedang",
            "Katalis",
            "Claymore",
            "Tombak"
    };

    private static String[] fotoKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Character_Albedo_Card.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/3/3e/Character_Ningguang_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/9/92/Character_Noelle_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Character_Zhongli_Card.png"
    };

    private static String[] detailKarakter = {
            "Albedo sang misterius adalah Kepala Alkemis dan Kapten Tim Investigasi Ksatria Favonius, dengan Sukrosa sebagai asistennya. Dia memiliki keinginan yang tak terbatas untuk mempelajari dunia Teyvat, mempelajari setiap objek di sekitarnya dengan cermat.",
            "Ningguang adalah Tianquan dari Liyue Qixing. Dia memegang posisi kekayaan melebihi banyak orang lain di Teyvat. Posisi dan kemampuan Ningguang telah memungkinkannya untuk membangun pencapaian terbesarnya, Ruang Giok mengambang yang mengawasi semua Liyue.",
            "Meskipun belum menjadi seorang ksatria, dia berusaha untuk suatu hari bergabung dengan Ksatria Favonius dengan terlebih dahulu melayani sebagai pelayan yang berbakti.",
            "Dia kemudian diturunkan menjadi jelmaan Geo Archon saat ini, Morax, yang telah memutuskan untuk mengalami dunia dari sudut pandang manusia. Setelah melepaskan Gnosisnya, dia pensiun dari posisinya sebagai Archon dan kembali ke identitas sebelumnya sebagai Adeptus. Dia saat ini bekerja sebagai konsultan di Rumah Duka Wangsheng."
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
