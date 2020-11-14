package com.mert.main;

import com.mert.model.Kisi;
import com.mert.service.IslemServisImpl;
import com.mert.service.KisiServis;
import com.mert.service.KisiServisImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AtmApp {
    static Scanner scanner = new Scanner(System.in);
    static Kisi kisi = new Kisi();
    static KisiServis kisiServis = new KisiServisImpl();
    static IslemServisImpl islemServis = new IslemServisImpl(kisiServis);


    public static void login() {
        int error_count = 0;

        System.out.println("giris");
        System.out.print("kullanıcı adı:");
        String username = scanner.next();
        System.out.print("sifre:");
        String password = scanner.next();
        for (Kisi the_kisi : kisiList()) {
            if (the_kisi.getUsername().equals(username) && the_kisi.getPassword().equals(password)) {
                kisi = the_kisi;
                secim();

            } else {
                error_count++;


            }
        }
        if (error_count == kisiList().size()) {

            System.out.println("yanlıs giris");
            login();
        }

    }

    public static int menu() {

        System.out.println("------------MENU----------");
        System.out.println("1-Para Yatırma");
        System.out.println("2-Para Cek");
        System.out.println("3-Bakiye Sorgulama");
        System.out.println("4-Kisileri listele");
        System.out.println("5-Cıkıs yap");
        System.out.print("yapılacak islemi seciniz:");
        int secim = scanner.nextInt();
        return secim;
    }

    public static void secim() {
        int sec = menu();
        switch (sec) {

            case 1:
                System.out.println("yatırılacak tutarı giriniz:");
                double girilen_tutar = scanner.nextDouble();
                islemServis.paraYatir(girilen_tutar, kisi.getId());

                secim();
                break;

            case 2:
                System.out.print("cekilecek tutarı giriniz:");
                double cekilen_tutar = scanner.nextDouble();
                islemServis.paraCek(cekilen_tutar, kisi.getId());
                secim();


                break;

            case 3:
                System.out.println("Bakiyeniz:" + kisi.getHesap().getHesap_bakiye());

                secim();
                break;
            case 4:
                System.out.println("Kişiler:");
                Iterator<Kisi> iterator = kisiList().iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                secim();
                break;


            case 5:
                System.out.println("Çıkış yaptınız");
                break;
            default:
                System.out.println("yanlış bir secım yaptınız");
                break;

        }

    }




    private static List<Kisi> kisiList() {
        //  Iterable<kisi> iterable=
     /*   for (kisi kisi : kisi.getKisiList()) {
            System.out.println(kisi.toString());
        }
        */
        return kisiServis.kisiList();
    }

    public static void main(String[] args) {
        login();

    }
}
