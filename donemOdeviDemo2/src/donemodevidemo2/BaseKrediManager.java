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
public class BaseKrediManager {
     void hesapla (double oran){
        Scanner scanner = new Scanner(System.in);
        //double orn=oran;
        double odencek,alınan;
        int gun;
        System.out.println("Istediginiz Kredi Tutarini Giriniz");
        int tutar = scanner.nextInt();
        double faizTutari=oran*tutar;
        double toplamTutar= tutar+faizTutari;
        System.out.println("Faiz tutariniz : "+faizTutari);
        System.out.println("Bankaya odenecek faizli tutar : "+toplamTutar);

    }
}
