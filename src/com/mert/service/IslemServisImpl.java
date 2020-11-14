package com.mert.service;

import com.mert.model.Kisi;

public class IslemServisImpl implements IslemServis {

    KisiServis kisiServis = new KisiServisImpl();

     public IslemServisImpl(KisiServis kisiServis)
     {
         this.kisiServis=kisiServis;
     }

    public IslemServisImpl() {
    }

    @Override
    public void paraYatir(double girilen_tutar, Long id) {


           if(kisiServis.getKisi(id)!=null){
               kisiServis.getKisi(id).getHesap().bakiyeHesapla(girilen_tutar);
            System.out.println("islem basarılı.. mevcut tutar=" + kisiServis.getKisi(id).getHesap().getHesap_bakiye());
        }
    }

    @Override
    public void paraCek(double cekilen_tutar, Long id) {
       Kisi kisi=kisiServis.getKisi(id);
       if(kisi!=null)
       {
           if(kisi.getHesap().getHesap_bakiye()<cekilen_tutar){
               System.out.println( "yetersiz bakiye");
           }
           else{
               kisi.getHesap().setHesap_bakiye(kisi.getHesap().getHesap_bakiye()-cekilen_tutar);
               System.out.println("para cekildi...mevcut tuatar="+kisi.getHesap().getHesap_bakiye());
           }

         }

    }
}
