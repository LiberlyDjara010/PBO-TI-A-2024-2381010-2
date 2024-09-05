package Aritmatika;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Sama dengan
        boolean hasilSamaDengan  = (a == b);
        System.out.println("a == b" + hasilSamaDengan);

        //Tidak sama dengan
        boolean hasilTidakSamaDengan  = (a != b);
        System.out.println("a != b" + hasilTidakSamaDengan);

        //Lebih Besar Dari
        boolean hasilLebihBesarDari  = (a > b);
        System.out.println("a > b" + hasilLebihBesarDari);

        //Lebih Kecil Dari
        boolean hasilLebihKecilDari  = (a < b);
        System.out.println("a < b" + hasilLebihKecilDari);

        // Lebih besar atau sama dengan
        boolean hasilLebihBesarSamaDengan  = (a >= b);
        System.out.println("a >= b" + hasilLebihBesarSamaDengan);

        //Lebih kecil atau sama dengan
        boolean hasilLebihKecilSamaDengan  = (a <= b);
        System.out.println("a <= b" + hasilLebihKecilSamaDengan);
    }
}
