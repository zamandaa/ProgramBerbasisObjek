
package programberbasisobjek;

public class ZahraAmanda {
    public static void main(String[] args) {
        // TODO code application logic here
        double Nilai1;
       double Nilai2;
       double hasil;
 
       Scanner keyboard = new Scanner(System.in);
 
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 =keyboard.nextInt();
//
      // penjumlahan
       hasil = Nilai1 + Nilai2;
       System.out.println("Hasil = " + hasil);
//
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
//
      // pengurangan
       hasil = Nilai1 - Nilai2;
       System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
    // perkalian
       hasil = Nilai1 * Nilai2;
       System.out.println("Hasil = " + hasil);
//
     System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
//
//        // Pembagian
       hasil = Nilai1 / Nilai2;
       System.out.println("Hasil = " + hasil);
//
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
 
       // Sisa Bagi
       hasil = Nilai1 % Nilai2;
       System.out.println("Hasil = " + hasil);
       
       // Perbandingan dengan operator perbandingan
        boolean samaDengan = angka1 == angka2;
        boolean tidakSamaDengan = angka1 != angka2;
        boolean kurangDari = angka1 < angka2;
        boolean lebihDari = angka1 > angka2;
        boolean kurangAtauSamaDengan = angka1 <= angka2;
        boolean lebihAtauSamaDengan = angka1 >= angka2;

        System.out.println("Apakah angka1 sama dengan angka2? "
                + samaDengan);
        System.out.println("Apakah angka1 tidak sama dengan angka2? " 
                + tidakSamaDengan);
        System.out.println("Apakah angka1 kurang dari angka2? " 
                + kurangDari);
        System.out.println("Apakah angka1 lebih dari angka2? "
                + lebihDari);
        System.out.println("Apakah angka1 kurang dari atau sama dengan angka2? "
                + kurangAtauSamaDengan);
        System.out.println("Apakah angka1 lebih dari atau sama dengan angka2? " 
                + lebihAtauSamaDengan);
        
        // Bitwise AND (&)
        int angka1 = 5;// Representasi biner: 0101
        int angka2 = 3;// Representasi biner: 0011
        
int hasil = angka1 & angka2; // Hasil dari angka1 & angka2
System.out.println("Hasil AND: " + hasil); // Output: 1 (Representasi biner: 0001)

    }
}
