package LatihanSoal;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        int maksimum;
        if (bilangan1 > bilangan2){
            maksimum = bilangan1;
        } else {
            maksimum = bilangan2;
        }
        System.out.println("nilai maksimum: " + maksimum);
    }
}
