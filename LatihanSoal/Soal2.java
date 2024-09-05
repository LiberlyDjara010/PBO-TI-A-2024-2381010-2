package LatihanSoal;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        System.out.println("Masukkan bilangan ketiga: ");
        int bilangan3 = input.nextInt();

        int maksimum;

        if(bilangan1 >= bilangan2 && bilangan1 >= bilangan3){
            maksimum = bilangan1;
        } else if (bilangan2 >= bilangan1 && bilangan2 >= bilangan3){
            maksimum = bilangan2;
        } else {
            maksimum = bilangan3;
        }
        System.out.println("Nilai maksimum adalah: " + maksimum);
    }
}
