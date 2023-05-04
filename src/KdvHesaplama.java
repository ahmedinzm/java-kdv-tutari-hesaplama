import java.util.Scanner;
public class KdvHesaplama {

    public static void main(String[] args) {
        double  kdv = 0.18, normal, kdvli, toplam;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tutarı giriniz");
        normal = scanner.nextDouble();

        if (!(normal >= 0) || !(normal <= 1000)) {
            kdv = 0.08;
        }
        toplam = normal * kdv;
        kdvli = normal + toplam;


        System.out.println("KDV oranı: %" + (kdv * 100));
        System.out.println("KDV tutarı: " + kdvli);
        System.out.print("Kdv'siz Fiyat = "+normal);

        scanner.close();



    }





}
