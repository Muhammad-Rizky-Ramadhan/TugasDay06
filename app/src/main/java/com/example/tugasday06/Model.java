package com.example.tugasday06;

public class Model {
    private String namaWaifu, tvJudul, tvSkor, tvGender, tvSeiyuu, tvDesk;
    private int gambar;

    public Model(String namaWaifu, String tvJudul, String tvSkor, String tvGender, String tvSeiyuu, String tvDesk, int gambar) {
        this.namaWaifu = namaWaifu;
        this.tvJudul = tvJudul;
        this.tvSkor = tvSkor;
        this.tvGender = tvGender;
        this.tvSeiyuu = tvSeiyuu;
        this.tvDesk = tvDesk;
        this.gambar = gambar;
    }

    public String getNamaWaifu() {
        return namaWaifu;
    }

    public void setNamaWaifu(String namaWaifu) {
        this.namaWaifu = namaWaifu;
    }

    public String getTvJudul() {
        return tvJudul;
    }

    public void setTvJudul(String tvJudul) {
        this.tvJudul = tvJudul;
    }

    public String getTvSkor() {
        return tvSkor;
    }

    public void setTvSkor(String tvSkor) {
        this.tvSkor = tvSkor;
    }

    public String getTvGender() {
        return tvGender;
    }

    public void setTvGender(String tvGender) {
        this.tvGender = tvGender;
    }

    public String getTvSeiyuu() {
        return tvSeiyuu;
    }

    public void setTvSeiyuu(String tvSeiyuu) {
        this.tvSeiyuu = tvSeiyuu;
    }

    public String getTvDesk() {
        return tvDesk;
    }

    public void setTvDesk(String tvDesk) {
        this.tvDesk = tvDesk;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
