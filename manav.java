package ManavProgrami;


//Manav Kasa Programı
//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

//Meyveler ve KG Fiyatları

//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL
//Örnek Çıktı;

//Armut Kaç Kilo ? :0
//Elma Kaç Kilo ? :1
//Domates Kaç Kilo ? :1
//Muz Kaç Kilo ? :2
//Patlıcan Kaç Kilo ? :3
//Toplam Tutar : 21.68 TL

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {

        Scanner manav = new Scanner(System.in);
        
        int armut,elma,domates,muz,patlican;
        double total,armutPerKg,elmaPerKg,domatesPerKg,muzPerKg,patlicanPerKg;
        armutPerKg = 2.14; 
        elmaPerKg = 3.67;
        domatesPerKg = 1.11;
        muzPerKg = 0.95;
        patlicanPerKg = 5.00;
        

        

        System.out.print("Armut Miktarını kg Cinsinden Giriniz:");
        armut = manav.nextInt();
        System.out.print("Elma Miktarını kg Cinsinden Giriniz:");
        elma = manav.nextInt();
        System.out.print("Domates Miktarını kg Cinsinden Giriniz:");
        domates = manav.nextInt();
        System.out.print("Muz Miktarını kg Cinsinden Giriniz:");
        muz = manav.nextInt();
        System.out.print("Patlıcan Miktarını kg Cinsinden Giriniz:");
        patlican = manav.nextInt();
        
        total = (armut*armutPerKg)+(elma*elmaPerKg)+(domates*domatesPerKg)+(muz*muzPerKg)+(patlican*patlicanPerKg);

        System.out.println("Toplam fiyat:" + total + "TL");


    }
    
}
