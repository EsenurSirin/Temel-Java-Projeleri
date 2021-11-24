package hesapmakinasi;

import java.util.Scanner;

public class HesapMakinasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        int sayi1 = 0;
        int sayi2 = 0;
        int sonuc = 0;

        System.out.println("1-Toplama\n2-Çarpma\n3-Çıkarma\n4-Bölme\n5-Çıkış\n");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        secim = input.nextInt();

        if (secim != 5) {
            System.out.println("Sayı giriniz: ");
            sayi1 = input.nextInt();
            sayi2 = input.nextInt();

            if (secim == 1) {
                sonuc = sayi1 + sayi2;
            } else if (secim == 2) {
                sonuc = sayi1 - sayi2;
            }
            System.out.println("İşleminizin sonucu: " + sonuc);
            while (secim != 5) ;

        }
    }
}
