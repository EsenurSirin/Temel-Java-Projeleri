package atmornegi;

import java.util.Scanner;

public class AtmOrnegi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;
        System.out.println("Bakiyeniz: " + bakiye);
        System.out.println("\nİşlemler\n");
        System.out.println("1. Para Çekme");
        System.out.println("2 .Para Yatırma");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Kart İade");

        System.out.println("\n Gerçekleştirmek istediğiniz işlemi seçiniz: ");
        int islem = scan.nextInt();

        switch (islem) {

            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.println("Çekmek İstediğiniz tutarı giriniz: ");
                int tutar = scan.nextInt();

                if (tutar > bakiye) {
                    System.out.println("Yetersiz Bakiye. Yeniden deneyiniz: ");
                    tutar = scan.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
                break;

            case 2:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = scan.nextInt();
                bakiye += tutar;
                System.out.println("Yeni Bakiyeniz = " + bakiye);
                break;

            case 3:
                System.out.println("Bakiyeniz = " + bakiye);
                break;

            case 4:
                System.out.println(" Kartınızı almayı unutmayınız.");
        }
    }
}
