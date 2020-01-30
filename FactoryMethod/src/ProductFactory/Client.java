package ProductFactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		ProductFactory factory = new ProductFactory();

		while (1 == 1) {

			System.out.print("1.sinif mi 2.sinif mi?");
			Scanner scan = new Scanner(System.in);

			int x = scan.nextInt();
			if (x == 1) {

				Product product = factory.getProduct("one");
				System.out.println(product.getProductName() + " " + product.getProductSerialNumber() + " "
						+ product.getProductDate());
			} else if (x == 2) {

				Product product1 = factory.getProduct("two");
				System.out.println(product1.getProductName() + " " + product1.getProductSerialNumber() + " "
						+ product1.getProductDate());

			}

		}

	}

}
