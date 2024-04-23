package bin_io;

import static utils.IOUtils.restoreProductDetails;

import java.util.Scanner;

public class RestoreProducts {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			Object details = restoreProductDetails(sc.nextLine());
			System.out.println(details.getClass());
			System.out.println(details);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
