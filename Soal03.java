import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int M = input.nextInt();
		int V = input.nextInt();
		
		System.out.println(jam(H, M, V));
		input.close();
	}
	private static String jam(int H, int M, int V) {

		int jumlahWaktu = M + V ;

		if (jumlahWaktu >+ 60) {
			jumlahWaktu %= 60;
			H++;
		}
		return H + ":" + jumlahWaktu + "\n(karena " + H + ":" + M + " ditambah " + V + " menit = " + H + ":" + jumlahWaktu +")";
	}
}
