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
public class KrediSwitch {
    String deger;
    private void kredi(){
        System.out.println("Kredi Turunuzu Seciniz");
        System.out.println("1-Tarim Kredisi");
        System.out.println("2-Tasit Kredisi");
        System.out.println("3-Konut Kredisi");
        System.out.println("4-Ihtiyac Kredisi");
    }

    void krediSwitch(float bakiye){
        Scanner s = new Scanner(System.in);
        int secim=s.nextInt();
                switch (secim) {
                    case 1 :
                        TarimKrediManager tarimKrediManager = new TarimKrediManager();
                        tarimKrediManager.hesapla(5);
                        break;
                    case 2 :
                        TasitKrediManager tasitKrediManager = new TasitKrediManager();
                        tasitKrediManager.hesapla(2);
                        break;
                    case 3 :
                        KonutKrediManager konutKrediManager = new KonutKrediManager();
                        konutKrediManager.hesapla(3);
                        break;
                    case 4 :
                        IhtıyacKrediManager ihtiyacKrediManager = new IhtıyacKrediManager();
                        ihtiyacKrediManager.hesapla(4);
                        break;
                    default :
                            kredi();
                        break;
                
            }
}
}