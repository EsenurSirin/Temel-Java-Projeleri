package kdvhesaplama;

import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {

        double tutar;
        double kdvliFiyat;
        double kdv = 1.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Ürün tutarını giriniz: ");

        tutar = input.nextDouble();

        kdvliFiyat = (tutar * kdv);
        System.out.println("Ürünün KDV'li fiyatı " + kdvliFiyat + "'dir.");
    }
}
