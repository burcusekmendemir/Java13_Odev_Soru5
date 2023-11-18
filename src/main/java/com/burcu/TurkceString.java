package com.burcu;

import java.util.Scanner;

public class TurkceString {
    public static void main(String[] args) {


        String ifade = "https://www.linkedin.com/in/burcusekmen/ burcu sekmen demir'in linkedin adresidir." +
                "burcu aktif olarak linkedin hesabını kullanmaktadır.";


        System.out.println(karakterAl(ifade,6));
        System.out.println(indexBul(ifade,"burcu"));
        System.out.println(altIfade(ifade,0,40));

    }


    /**
     * Verilen bir ifadede istenilen indexteki karakterin metin içinde kaç kere yer aldığını veren method.
     * @param ifade
     * @param index
     * @return
     */
    public static char karakterAl(String ifade, int index){
        int sayac=0;
        char karakter=ifade.charAt(index);

        for (int i = 0; i <ifade.length() ; i++) {
            if (ifade.charAt(i)==karakter){
                sayac++;
            }
        }
        System.out.println(sayac + " tane " + karakter + " vardır.");
        System.out.println("Aranılan karakter: ");
        return karakter;


    }


    /**
     * Verilen bir ifadede istenilen bir karakterin tüm konumlarını veren ve son konumunu bize döndüren method.
     * @param ifade
     * @param karakter
     * @return
     */
    public static int indexBul(String ifade, String karakter){
        int index1=0, sayac=0;
        int index2=ifade.lastIndexOf(karakter);

       do {
           index1=ifade.indexOf(karakter, sayac+=1);
           System.out.println("İfade içinde aranan kelimenin konumu: " + index1);
           sayac=index1;
       }while (index1!=index2);
        System.out.println("Kelimenin son indexi ise; "); return sayac;
    }


    /**
     * Verilen bir ifadede, dışarıdan alınan başlangıç ve bitiş indexleri eğer method içinde verilen koşula uyuyorsa
     * ifadeyi verilen indexlere göre keselim uymuyorsa ifadeyi hiçbir değişiklik olmadan yazdıralım.
     * @param ifade
     * @param baslangic
     * @param bitis
     * @return
     */
    public static String  altIfade(String ifade, int baslangic, int bitis){

        int sonkonum=ifade.lastIndexOf('/')+1;

        if (baslangic==0 && bitis==sonkonum){
            ifade=ifade.substring(baslangic,bitis);
        }
        return ifade;
    }

}
