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
public class ParaCek {
     float paraCekmeIslemi(float a,float bakiye){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesabinizdan cekmek istediginiz tutari giriniz : ");
        a=scanner.nextFloat();
        bakiye=bakiye-a;
        System.out.println("Yeni bakiyeniz : "+bakiye);
        System.out.println("hesabinizdan cekilen tutar : "+a);
        return bakiye;
    }
}
