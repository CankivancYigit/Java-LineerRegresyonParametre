//Cankivanc Yigit N17136358 ;
package lineerregresyonparametre;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LineerRegresyonParametre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Double> sayilarx = new LinkedList<Double>();
        LinkedList<Double> sayilary = new LinkedList<Double>();

        System.out.println("Lineer Regresyon Parametrelerini Bulma Programina Hosgeldiniz.");

        System.out.println("X ve Y degerlerini birer bosluk birakarak giriniz(Cikmak icin -1 girin.)");
        double sayi = scanner.nextDouble();

        while (sayi != -1) {

            sayilarx.add(sayi);
            sayi = scanner.nextDouble();
            sayilary.add(sayi);

            System.out.println("X degerleri :" + sayilarx);
            System.out.println("Y degerleri :" + sayilary);

            sayi = scanner.nextDouble();

        }

        int size = sayilarx.size();
        double Xort = OrtalamaHesapla(sayilarx);
        double Yort = OrtalamaHesapla(sayilary);

        double b1 = (XiYiCarpimToplamı(sayilarx, sayilary) - (size * Xort * Yort)) / (XiKareToplami(sayilarx) - (size * Xort * Xort));
        double b0 = Yort - (b1 * Xort);

        System.out.println("b0 : " + b0);
        System.out.println("b1 : " + b1);
    }

    public static double OrtalamaHesapla(LinkedList<Double> sayilar) {

        ListIterator<Double> iterator = sayilar.listIterator();
        double toplam = 0;
        while (iterator.hasNext()) {

            Double next = iterator.next();
            toplam += next;

        }

        return toplam / sayilar.size(); 
    }

    public static double XiYiCarpimToplamı(LinkedList<Double> sayilarx, LinkedList<Double> sayilary) {

        double CarpimToplami = 0;

        for (int i = 0; i < sayilarx.size(); i++) {

            CarpimToplami += (sayilarx.get(i) * sayilary.get(i));

        }

        return CarpimToplami;
    }

    public static double XiKareToplami(LinkedList<Double> sayilar) {

        double KareToplami = 0;

        for (int i = 0; i < sayilar.size(); i++) {

            KareToplami += Math.pow(sayilar.get(i), 2);
        }

        return KareToplami;
    }

}





