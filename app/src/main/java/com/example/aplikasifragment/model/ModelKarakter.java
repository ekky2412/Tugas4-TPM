package com.example.aplikasifragment.model;

public class ModelKarakter {
    public String namaKarakter, detailKarakter,tipeWeapon,gambarKarakter,iconWeapon,gambarRarity;

    public String getNamaKarakter() {
        return namaKarakter;
    }

    public void setNamaKarakter(String namaKarakter) {
        this.namaKarakter = namaKarakter;
    }

    public String getDetailKarakter() {
        return detailKarakter;
    }

    public void setDetailKarakter(String detailKarakter) {
        this.detailKarakter = detailKarakter;
    }

    public String getTipeWeapon() {
        return tipeWeapon;
    }

    public void setTipeWeapon(String tipeWeapon) {
        this.tipeWeapon = tipeWeapon;
    }

    public String getGambarKarakter() {return gambarKarakter;}

    public void setGambarKarakter(String gambarKarakter) {this.gambarKarakter = gambarKarakter;}

    public String getIconWeapon() {return iconWeapon; }

    public void setIconWeapon(String iconWeapon) {this.iconWeapon = iconWeapon; }

    public String getGambarRarity() {return gambarRarity; }

    public void setGambarRarity(String gambarRarity) {this.gambarRarity = gambarRarity; }

    public ModelKarakter(String namaKarakter, String detailKarakter, String tipeWeapon, String gambarKarakter, String iconWeapon, String gambarRarity) {
        this.namaKarakter = namaKarakter;
        this.detailKarakter = detailKarakter;
        this.tipeWeapon = tipeWeapon;
        this.gambarKarakter = gambarKarakter;
        this.iconWeapon = iconWeapon;
        this.gambarRarity = gambarRarity;
    }
}
