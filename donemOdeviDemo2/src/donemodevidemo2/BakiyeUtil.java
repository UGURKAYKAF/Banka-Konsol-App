/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donemodevidemo2;

import java.util.Scanner;

/**
 *
 * @author pwo00
 */
public class BakiyeUtil {
    
    String deger;
    private void kredi(){
        System.out.println("Kredi Turunuzu Seciniz");
        System.out.println("1-Tarim Kredisi");
        System.out.println("2-Tasit Kredisi");
        System.out.println("3-Konut Kredisi");
        System.out.println("4-Ihtiyac Kredisi");
    }

    void ok (int secim, float bakiye) {
        Secim secim1 =new Secim();
        float i=0;
        switch (secim){
            case 1:
                //Scanner scanner2=new Scanner(System.in);
                ParaCek paraCek = new ParaCek();
                float sonBakiye = paraCek.paraCekmeIslemi(i, bakiye);
                System.out.println("Menu'ye donmek icin (A)'ya basiniz");
                Scanner scanner1=new Scanner(System.in);
                this.deger=scanner1.nextLine();
                if (deger.equals("A")){
                    secim1.secim(sonBakiye);
                }else{
                    System.out.println("Hatalş islem.");
                }
                break;
            case 2:
                Parayatır paraYatır = new Parayatır();
                float sonBakiye1 = paraYatır.paraYatirmaIslemi(i, bakiye);
                System.out.println("Menu'ye donmek icin (A)'ya basiniz");
                Scanner scanner2=new Scanner(System.in);
                this.deger=scanner2.nextLine();
                if (deger.equals("A")){
                    secim1.secim(sonBakiye1);
                }else{
                    System.out.println("Hatalş islem.");
                }
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                kredi();
                KrediSwitch krediSwitch  = new KrediSwitch();
                krediSwitch.krediSwitch(bakiye);
                System.out.println("Ana menu'ye donmek icin (A)'ya basiniz.");
                System.out.println("Kredi menusune donmek icin (B)'ye basiniz.");
                Scanner scanner4=new Scanner(System.in);
                this.deger=scanner4.nextLine();
                if (deger.equals("A")){
                    
                    secim1.secim(bakiye);
                }
                if (deger.equals("B")){
                    BakiyeUtil bakiyeUtil = new BakiyeUtil();
                    bakiyeUtil.ok(secim, bakiye);
                }
                else{
                    System.out.println("Hatalş islem.");
                }
                break;
            case 4 :
                Faiz faiz = new Faiz();
                faiz.hesapla(19.5);
                break;
            default :
                System.out.println("Hatali islem yaptiniz");
                ok(secim,bakiye);
                break;
        }

    }

    /*private void kredi(){
        System.out.println("Kredi Turunuzu Seciniz");
        System.out.println("1-Tarim Kredisi");
        System.out.println("2-Tasit Kredisi");
        System.out.println("3-Konut Kredisi");
        System.out.println("4-Ihtiyac Kredisi");
    }*/
}

    
