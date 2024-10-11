// import java.util.Scanner;
public class App {

    static double PHI = 3.14;
    
    // nomor 1a
    static void gasal(int x) {
        int i;
        for(i = 0; i <= x; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // nomor 1b
    // checking prime 
    static boolean prime(int x){
        if (x <= 1) return false;
        for (int i = 2; i < x; i++){
            if(x % i == 0) return false;
        }
        return true;
    }

    // 5a
    static double volumeLimas(double p, double l, double t){
        return (1/3*(p * l) * t);
    }

    // 5b
    static double volumeTabung(double r, double t) {
        return (PHI * r*r * t);
    }

    static double luasTabung(double r, double t) {
        return (2 * PHI * r * (r + t));
    }


    public static void tampilkanPrima(int start, int end) {
        System.out.println("Bilangan prima antara " + start + " dan " + end + " adalah:");
        for (int i = start; i <= end; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Baris baru setelah semua bilangan prima ditampilkan
    }


    public static void main(String[] args) throws Exception {
        gasal(5);
        tampilkanPrima(1, 20);

        // nomor 2a
        // Scanner masuk = new Scanner(System.in);  //ga kepake jir
        int bil = 1;
        // while(bil <= 15){
        //     System.out.println(bil);
        //     bil++;
        // }

        System.out.println();

        // nomor 2b jadi do while
        do{
            System.out.println(bil);
            bil++;
        } while (bil <= 15);

        int[][] duaD = {
        {50,20,70,30},
        {80,70,60,20},
        {70,80,90,40},
        {75,86,98,60},
        {100,80,80,50}
    };

    // loop luar ke dalem, dalem diselesain dulu. // no 3a
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(duaD[i][j]);
                if(j < 4) System.out.print(" ");
            }
            System.out.println();
        }

        // output
        // 50 20 70 30, 80 70 60 20, dst... dalam bentuk matriks
    
        // 3b
        int[] satuD = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i< satuD.length; i++){
            System.out.print(satuD[i]);
        }

        // 4
        int i = 3;
        switch (i) {
            case 1: System.out.println("Pilihan pertama PBO");
                    break;
            case 2: System.out.println("Pilihan pertama RPL");
                    break;
            case 3: System.out.println("Pilihan pertama FISIKA");
                    break;
            case 4: System.out.println("Pilihan pertama AI");
                    break;
            case 5: System.out.println("Pilihan pertama SBD");
                    break;
            case 6: System.out.println("Pilihan pertama MTK");
                    break;
            case 7: System.out.println("Pilihan pertama Pengolahan Citra");
                    break;
        }

    }
}
