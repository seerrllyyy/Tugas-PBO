/* Deskripsi :		*/
/* Program ini berisi contoh sederhana untuk mendefinisikan */
/* variabel-variabel bilangan bulat (short int, int, long int), */
/* karakter, bilangan rill, */

public class oop_kode3 {
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		/* KAMUS */
		short ks = 1;
		int ki = 1;
		long kl = 10000;
		char c = 65;		/*inisialisasi karakter dengan integer*/
		char cl = 'z';	/*inisialisasi karakter dengan karakter*/
		double x = 50.2f;
		float y = 50.2f;
		/* Algoritma */

		/* penulisan karakter sebagai karakter*/
		System.out.println ("Karakter = "+ c);
		System.out.println ("Karakter = "+ cl);

		/* penulisan karakter sebagai integer*/
		System.out.println ("Karakter = "+ c);
		System.out.println ("Karakter = "+ cl);

		System.out.println ("Bilangan integer (short) = "+ ks);
		System.out.println ("\t(int) = "+ ki);
		System.out.println ("\t(long) = "+ kl);
		System.out.println ("Bilangan Real x = "+ x);
		System.out.println ("Bilangan Real y = "+ y);


	}	
}