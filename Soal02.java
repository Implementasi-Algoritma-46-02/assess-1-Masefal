import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {

		Scanner input = new Scanner(System.in);
		String[] pisah1 = input.nextLine().split(" ");
		String[] pisah2 = input.nextLine().split(" ");

		double tahun = Double.parseDouble(pisah1[0]);
		double ipk = Double.parseDouble(pisah1[1]);

		int eprt = Integer.parseInt(pisah2[0]);
		String hki = pisah2[1];
		String lomba = pisah2[2];

		System.out.println(kelulusan(tahun, ipk, eprt, hki, lomba));
		input.close();
	}

	private static String kelulusan(double tahun, double ipk, int eprt, String hki, String lomba) {
		String cumlaude;
		
			if (tahun >= 3.0 && ipk >= 3.5 && eprt >= 450 && hki == "ada" && lomba == "ada") {
				cumlaude = "Cumlaude";
			} else {
				cumlaude = "Tidak cumlaude";
			}
		return cumlaude;
	}	
}

