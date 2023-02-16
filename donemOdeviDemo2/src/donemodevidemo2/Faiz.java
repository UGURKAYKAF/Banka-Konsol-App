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
public class Faiz {
     void hesapla(double oran){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Faiz'e yatirilacak ana parayi girinzi");
        int anapara=scanner.nextInt();
        System.out.println("Faiz kac gunluk olsun");
        int gun=scanner1.nextInt();
        double ıslem1= anapara*oran;
        double ıslem2=ıslem1*gun;
        double ıslem3=ıslem2/36500;
        System.out.println("Faiz'den gelen para : "+ıslem3);
    }
}
