import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		// soal 1
		Scanner input = new Scanner(System.in);
		String[] Split = input.nextLine().split(" ");
		int bil1 = Integer.parseInt(Split [0]);
		int bil2 = Integer.parseInt(Split[1]);
		int bil3 = Integer.parseInt(Split[2]);
		int bil4 = Integer.parseInt(Split[3]);
		int bil5 = Integer.parseInt(Split[4]);

		System.out.println(bil1 + " " + validasi(bil1));
		System.out.println(bil2 + " " + validasi(bil2));
		System.out.println(bil3 + " " + validasi(bil3));
		System.out.println(bil4 + " " + validasi(bil4));
		System.out.println(bil5 + " " + validasi(bil5));
		input.close();
	}
	private static String validasi(int bilangan) {

		int ratusan = bilangan / 100;
		int puluhan = (bilangan % 100) /10;
		int satuan = bilangan % 10;

		String nilai;

		if (ratusan < puluhan && satuan % 2 != 0) {
			nilai = "valid";
		} else {
			nilai = "tidak valid ";
		}
		return nilai;
	}
}
