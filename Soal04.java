import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		String[] pisah = input.nextLine().split(" ");
		String kodeKerja = pisah[0];
		int jamKerja = Integer.parseInt(pisah[1]);

		input.close();
	}
	private static double gaji(String kodeKerja, int jamKerja) {
		String kodekerja;
		int honor= 30000;
		double gaji = jamKerja * honor;

		switch (kodekerja) {
			case "DES":
				gaji = gaji + 600000;
			case "PRG":
				jamKerja =  jamKerja * honor + 1200000;
				gaji = gaji + 1200000;
			case "WRT":
				jamKerja =  jamKerja * honor + 400000;
				gaji = gaji + 400000;
			case "MKT":
				jamKerja =  jamKerja * honor + 500000;
				gaji = gaji + 500000;
		}
		if (jam kerja == 160) 
	}
}
