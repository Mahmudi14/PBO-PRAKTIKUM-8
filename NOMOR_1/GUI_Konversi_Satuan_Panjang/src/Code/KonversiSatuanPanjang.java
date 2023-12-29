package Code;

import java.util.Scanner;


public class KonversiSatuanPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1].KiloMeter");
        System.out.println("[2].HektoMeter");
        System.out.println("[3].DekaMeter");
        System.out.println("[4].Meter");
        System.out.println("[5].DesiMeter");
        System.out.println("[6].CentiMeter");
        System.out.println("[7].MiliMeter");
        System.out.print("Masukkan Jenis Inputan : ");
        int typeMasukan = sc.nextInt();
        System.out.print("Masukkan Panjang : ");
        double panjang = sc.nextDouble();
        switch (typeMasukan) {
            case 1 :
            panjang/=1;
            break;
            case 2 :
            panjang/=10;
            break;
            case 3 :
            panjang/=100;
            break;
            case 4 :
            panjang/=1000;
            break;
            case 5 :
            panjang/=10000;
            break;
            case 6 :
            panjang/=10000;
            break;
            case 7 :
            panjang/=10000;
            break;
        }
        System.out.println("[1].KiloMeter");
        System.out.println("[2].HektoMeter");
        System.out.println("[3].DekaMeter");
        System.out.println("[4].Meter");
        System.out.println("[5].DesiMeter");
        System.out.println("[6].CentiMeter");
        System.out.println("[7].MiliMeter");
        System.out.print("Masukkan Jenis Keluaran : ");
        int typekeluaran = sc.nextInt();
        switch (typekeluaran) {
            case 1 :
            panjang*=1;
            break;
            case 2 :
            panjang*=10;
            break;
            case 3 :
            panjang*=100;
            break;
            case 4 :
            panjang*=1000;
            break;
            case 5 :
            panjang*=10000;
            break;
            case 6 :
            panjang*=10000;
            break;
            case 7 :
            panjang*=10000;
            break;
        }
        System.out.println(panjang);
    }
}
