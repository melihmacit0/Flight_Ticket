import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yas, yolculukTipi;
        double normalTutar, yasIndirimi, indirimliTutar, gdbIndirimi, toplamTutar,mesafe;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek yön , 2 => Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();
        input.close();
        normalTutar = mesafe * 0.10;
        if (yolculukTipi == 1 || yolculukTipi == 2) {
            switch (yolculukTipi) {
                case 1:
                    if (yas <= 12) {
                        yasIndirimi = normalTutar * 0.5;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam Tutar = " + indirimliTutar);
                    } else if (yas <= 24) {
                        yasIndirimi = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam Tutar = " + indirimliTutar);
                    } else if (yas >= 65) {
                        yasIndirimi = normalTutar * 0.3;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam Tutar = " + indirimliTutar);
                    }
                    break;
                case 2:
                    if (yas <= 12) {
                        yasIndirimi = normalTutar * 0.5;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gdbIndirimi = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - gdbIndirimi) * 2;
                        System.out.println("Toplam Tutar = " + toplamTutar);
                    } else if (yas <= 24) {
                        yasIndirimi = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gdbIndirimi = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - gdbIndirimi) * 2;
                        System.out.println("Toplam Tutar = " + toplamTutar);
                    } else if (yas >= 65) {
                        yasIndirimi = normalTutar * 0.3;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gdbIndirimi = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - gdbIndirimi) * 2;
                        System.out.println("Toplam Tutar = " + toplamTutar);
                    }
                    break;


            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");

        }


    }
}
