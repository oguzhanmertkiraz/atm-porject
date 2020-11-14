package com.company;

import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);
    static double bakiye = 1000;

    public static int secim() {


        System.out.print("yapılacak islemi seciniz");
        int secim = scanner.nextInt();
        return secim;
    }

    public static void menu() {
        int sec = secim();
        switch (sec) {

            case 1:
                paraYatir();
                menu();
                break;

            case 2:
                paraCek();
                menu();
                break;

            case 3:
                bakiyeSorgula();
                menu();
                break;
            case 4:
                System.out.println("Çıkış yaptınız");
                break;
            default:
                System.out.println("yanlış bir secım yaptınız");
                break;

        }

    }



    private static void paraCek() {
        System.out.print("giriecek tutarı giriniz");
        double cekilen_tutar=scanner.nextDouble();

        bakiye-=cekilen_tutar;
        System.out.print("Başarılı...");



    }

    public static void bakiyeSorgula() {
       System.out.print("bakiyeniz\n:"+bakiye);

    }

    public static void paraYatir() {
          System.out.print("yatırılacak tutarı giriniz ");
          double girilen_tutar=scanner.nextDouble();
          bakiye+=girilen_tutar;
          System.out.print("Basarılı....");


    }

    public static void main(String[] args) {

        menu();

    }
}
