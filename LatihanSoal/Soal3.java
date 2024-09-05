package LatihanSoal;


import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.println("Masukkan operator (+, -, *, %, /): ");
        char operator = input.next().charAt(0);

        System.out.println("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasilOperasi = 0;

        if (operator == '+'){
            hasilOperasi = angka1 + angka2;
        }else if (operator == '-'){
            hasilOperasi = angka1 - angka2;
        }else if (operator == '*') {
            hasilOperasi = angka1 * angka2;
        }else if (operator == '%') {
            hasilOperasi = angka1 % angka2;
        }else if (operator == '/') {
            if (angka2 != 0){
                hasilOperasi = angka1 / angka2;
            }else{
                System.out.println("TIDAK DIPERBOLEHKAN PEMBAGIAN DENGAN ANGKA NOL");
                return;
            }
        }else{
            System.out.println("OPERATOR TIDAK VALID");
        }
        System.out.println("Hasil: " + (int) hasilOperasi);
    }
}
