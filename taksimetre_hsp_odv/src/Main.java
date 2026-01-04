/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/

import java.util.Scanner;

class Taksimetre {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km;
        double toplamTutar;
        double kmUcreti = 2.20;
        double acilisUcreti = 10.0;

        System.out.print("Gidilen mesafeyi (KM) giriniz: ");
        km = input.nextDouble();

        toplamTutar = acilisUcreti + (km * kmUcreti);

        if (toplamTutar < 20) {
            toplamTutar = 20;
        }

        System.out.println("Ödenecek Tutar: " + toplamTutar + " TL");

        input.close();
    }
}




