import java.text.DecimalFormat;
import java.util.Scanner;

public class tugasDua {

    public static void main(String[] args) {
        Scanner inputGolongan = new Scanner(System.in);
        System.out.println("Masukkan jenis golongan (A/B/C) : ");
        String golongan = inputGolongan.nextLine().toUpperCase();

        Scanner inputLembur = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam lembur : ");
        int lembur = inputLembur.nextInt();

        double gajiGolongan = 0;
        double gajiLembur = 0;

        // Array persentase lembur
        double[] lemburArray = {0.30, 0.32, 0.34, 0.36, 0.38};

        // menentukan gaji golongan
        if (golongan.equals("A")) {
            gajiGolongan = 5000000;
        } else if (golongan.equals("B")) {
            gajiGolongan = 6500000;
        } else if (golongan.equals("C")) {
            gajiGolongan = 9500000;
        } else {
            System.out.println("Golongan tidak terdaftar");
        }

        // menghitung jumlah gaji lembur
        if (lembur >= 1 && lembur <= 4) {
            gajiLembur = gajiGolongan * lemburArray[lembur - 1];
        } else if (lembur >= 5) {
            gajiLembur = gajiGolongan * lemburArray[4];
        } else {
            System.out.println("ERROR");
        }

        DecimalFormat df = new DecimalFormat("#,###");
        // menghitung total gaji
        System.out.println("Gaji Golongan : " + df.format(gajiGolongan));
        System.out.println("Gaji Lembur   : " + df.format(gajiLembur));
        System.out.println("Total Gaji    : " + df.format(gajiGolongan + gajiLembur));

        inputGolongan.close();
        inputLembur.close();
    }
}