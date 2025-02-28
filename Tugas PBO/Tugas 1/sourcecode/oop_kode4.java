import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
public class oop_kode4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukan;
		/* Program*/
		System.out.print ("Contoh membaca dan menulis, ketik niai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* Coba ketik : masukan.nextInt(); ; Apa akibatnya?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}