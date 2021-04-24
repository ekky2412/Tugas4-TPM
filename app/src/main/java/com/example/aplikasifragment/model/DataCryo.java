package com.example.aplikasifragment.model;

import java.util.ArrayList;

public class DataCryo {
    private static String[] namaKarakter = {
            "Chongyun",
            "Diona",
            "Ganyu",
            "Kaeya",
            "Qiqi",
            "Rosaria"
    };

    private static String[] rarityKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png"
    };

    private static String[] iconWeapon = {
            "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Icon_Claymore.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Bow.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Bow.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Sword.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Sword.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Icon_Polearm.png"
    };

    private static String[] tipeWeapon = {
            "Claymore",
            "Panah",
            "Panah",
            "Pedang",
            "Pedang",
            "Tombak"
    };

    private static String[] fotoKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/f/fa/Character_Chongyun_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/0/08/Character_Diona_Card.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Character_Ganyu_Card.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/64/Character_Kaeya_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Qiqi_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/6d/Character_Rosaria_Card.png"
    };

    private static String[] detailKarakter = {
            "Seorang pengusir setan dari Liyue, Chongyun dilahirkan dengan energi Yang (positif) yang berlebihan, yang terbukti menjadi bantuan dan penghalang. Itu membuatnya menjadi pengusir setan yang sangat efektif, tetapi itu juga berarti dia belum pernah melihat roh untuk dirinya sendiri - mereka melarikan diri bahkan sebelum dia bisa melihat mereka. Itu juga membuatnya sangat rentan terhadap segala jenis panas atau emosi yang kuat, yang mengarah pada beberapa ... hasil yang tidak terduga.",
            "Meskipun menjadi bartender di Cat's Tail, dia sebenarnya membenci alkohol dan tidak menginginkan apa pun selain menghancurkan industri anggur Mondstadt — suatu prestasi yang lebih mudah diucapkan daripada dilakukan ketika pelanggannya benar-benar menyukai minumannya.",
            "Ganyu adalah sebagai utusan dan sekretaris Liyue Qixing.",
            "Kaeya adalah Kapten Kavaleri di Knights of Favonius. Dia sangat dihormati oleh orang-orang Mondstadt — bahkan dengan semua keanehan dan rahasianya.",
            "Dibangkitkan sebagai zombie oleh adepti, dia dirawat oleh Baizhu dan sekarang bekerja di Bubu Pharmacy di Pelabuhan Liyue.",
            "Rosaria adalah anggota Gereja Favonius di Mondstadt."
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
