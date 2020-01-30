package Factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		SekilFactory factory = new SekilFactory();

		String kare = "kare";
		String dikdortgen = "dikdortgen";
		String cember = "cember";

		while (1 == 1) {

			System.out.print("cizmek istediginiz sekli icin seciniz:");
			Scanner scan = new Scanner(System.in);
			String secenek = scan.nextLine();
			if (secenek.contentEquals(kare)) {
				Sekil sekil2 = factory.getSekil(Sekiltur.kare);
				sekil2.ciz();
			} else if (secenek.contentEquals(cember)) {
				Sekil sekil1 = factory.getSekil(Sekiltur.cember);
				sekil1.ciz();
			} else if (secenek.contentEquals(dikdortgen)) {

				Sekil sekil3 = factory.getSekil(Sekiltur.dikdortgen);
				sekil3.ciz();
			} else {
				System.out.println("sisteme kayitli boyle bir sekil bulunmamaktadir.");
			}

		}
	}

}
