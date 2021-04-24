package com.example.aplikasifragment.model;

import java.util.ArrayList;

public class DataPyro {
    private static String[] namaKarakter = {
            "Amber",
            "Bennet",
            "Diluc",
            "Hu Tao",
            "Klee",
            "Xiangling",
            "Xinyan"
    };

    private static String[] rarityKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Icon_5_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Icon_4_Stars.png"
    };

    private static String[] iconWeapon = {
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Bow.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Icon_Sword.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Icon_Claymore.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Icon_Polearm.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Icon_Catalyst.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Icon_Polearm.png",
            "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Icon_Claymore.png",
    };

    private static String[] tipeWeapon = {
            "Panah",
            "Pedang",
            "Claymore",
            "Tombak",
            "Katalis",
            "Tombak",
            "Claymore"
    };

    private static String[] fotoKarakter = {
            "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Character_Amber_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/7f/Character_Bennett_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/4/45/Character_Diluc_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/2/22/Character_Hu_Tao_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/7/78/Character_Klee_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/f/f1/Character_Xiangling_Card.jpg",
            "https://static.wikia.nocookie.net/gensin-impact/images/4/4c/Character_Xinyan_Card.jpeg"
    };

    private static String[] detailKarakter = {
            "Amber adalah satu-satunya Outrider dari Knights of Favonius yang tersisa. Dia selalu siap membantu warga Mondstadt — entah itu sesuatu yang sederhana atau mungkin tugas yang lebih menantang.",
            "Seorang yatim piatu yang ditemukan oleh seorang petualang tua saat masih bayi, Bennett dibesarkan di Guild Petualang Mondstadt. Dia adalah satu-satunya anggota \"Benny's Adventure Team,\" karena semua orang meninggalkan tim setelah mengalami kemalangan terus-menerus yang mengikutinya.",
            "Terlahir dalam Keluarga Ragnvindr yang makmur, Diluc adalah pemilik Dawn Winery saat ini dan seorang bangsawan yang sangat dihormati di masyarakat Mondstadt. Sementara insiden masa lalu menyebabkan dia berpisah dengan Ksatria Favonius, dia terus melindungi Mondstadt dengan caranya sendiri.",
            "Sekilas, Hu Tao tampak seperti gadis yang nyentrik dan ceria. Tidak ada yang akan berpikir bahwa dia sebenarnya adalah direktur terkenal dari Rumah Duka Wangsheng kecuali dia memberi tahu mereka atau mereka bekerja dengannya.",
            "Putri dari petualang pemberani - dan destruktif - Alice, Klee mengambil setelah ibunya dalam banyak hal, banyak yang membuat takut para Ksatria Favonius yang telah dipercayakan kepadanya.",
            "Dia adalah Kepala Koki di Restoran Wanmin dan menjalankannya bersama ayahnya, Chef Mao. Sebagai seorang chef, Xiangling tidak takut untuk mencoba berbagai resep atau bahan-bahan yang \"eksotis\". Membuat masakannya terkadang cukup unik.",
            "Rock 'n' roll adalah gaya musik yang relatif tidak populer di Liyue, yang baru-baru ini dibawa dari Fontaine. Xinyan, bagaimanapun, menyukai suaranya - dan dia perlahan tapi pasti mengumpulkan basis penggemarnya sendiri saat dia tampil di seluruh Pelabuhan Liyue."
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
