package bin_io;

import static utilss.IoUtils.storeProductDetails;
import static utilss.ShopUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

public class StoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Enter file name");
			storeProductDetails(productMap, sc.nextLine());
			System.out.println("stored products....");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
