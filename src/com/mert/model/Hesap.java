package com.mert.model;

public class Hesap {

    private Long id;
    private String hesapNo;
    private double hesap_bakiye;


    public Hesap(String hesapNo, double hesap_bakiye) {
        this.hesapNo = hesapNo;
        this.hesap_bakiye = hesap_bakiye;
    }

    public Hesap(Long id, String hesapNo, double hesap_bakiye) {
        this.id = id;
        this.hesapNo = hesapNo;
        this.hesap_bakiye = hesap_bakiye;
    }

    public Hesap() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getHesap_bakiye() {
        return hesap_bakiye;
    }

    public void setHesap_bakiye(double hesap_bakiye) {
        this.hesap_bakiye = hesap_bakiye;
    }

 public void bakiyeHesapla(double tutar){
        this.hesap_bakiye+=tutar;
 }
    @Override
    public String toString() {
        return "Hesap{" +
                "id=" + id +
                ", hesapNo='" + hesapNo + '\'' +
                ", hesap_bakiye=" + hesap_bakiye +
                '}';
    }
}
