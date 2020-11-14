package com.mert.service;

import com.mert.model.Hesap;
import com.mert.model.Kisi;

import java.util.ArrayList;
import java.util.List;

public class KisiServisImpl implements KisiServis {
    Kisi kisi=new Kisi();
    private List<Kisi> kisiList = new ArrayList<>();
    private List<Hesap> hesapList = new ArrayList<>();

    public KisiServisImpl(){
        Hesap hesap1 = new Hesap(1L, "12345", 10000);
        hesapList.add(hesap1);
        kisiList.add(new Kisi(1L, "Ercan", "Karakaya", "ercan", "123", hesap1));

        Hesap   hesap2 = new Hesap(2L, "3210", 22250);
        hesapList.add(hesap2);
        kisiList.add(new Kisi(2L, "Mert", "Kiraz", "mert", "12345", hesap2));

        Hesap  hesap3 = new Hesap(3L, "98765", 25064);
        hesapList.add(hesap3);
        kisiList.add(new Kisi(3L, "Enes", "Özdeniz", "enes", "123", hesap3));

    }
    @Override
    public Kisi getKisi(Long id) {

        for(Kisi k:kisiList()){
            if(id==k.getId()){
                kisi=k;
            }
        }
        return kisi;
    }



    @Override
    public List<Kisi> kisiList() {
        List<Kisi> kisiler =this.kisiList;
        return kisiler;
    }
}
