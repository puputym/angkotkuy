package com.uas.tubes;

import java.io.Serializable;

public class Angkot implements Serializable
{
    public String judul;
    public String deskripsi;

    public Angkot(String judul, String deskripsi)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
    }
}
