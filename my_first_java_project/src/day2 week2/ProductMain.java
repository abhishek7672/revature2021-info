package mytasks3Aug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {
	public static void main(String[] args) {

		List<Product> ProductList = new ArrayList<>();
		ProductList.add(new Product(100, "Laptop", 120000.22, 2.3f, 3));
		ProductList.add(new Product(101, "Apple Watch", 110000.22, 2.4f, 5));
		ProductList.add(new Product(190, "Reebok shoes", 1100.22, 2.3f, 2));
		ProductList.add(new Product(200, "Denver Deo", 1000.22, 4.3f, 7));
		ProductList.add(new Product(104, "Air Conditioner", 33400.22, 4.3f, 1));
		ProductList.add(new Product(111, "Inverter", 14000.22, 4.3f, 1));

		printProductList(ProductList);

		Collections.sort(ProductList);

		System.out.println("\nPrinting Buses sorted based on id");
		printProductList(ProductList);

		Collections.sort(ProductList, new ProductNameComparator());
		System.out.println("\nPrinting Product sorted based on product name(Z-A)");
		printProductList(ProductList);

		Collections.sort(ProductList, ( p1,  p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting Products sorted based on cost");
		printProductList(ProductList);
		
		Collections.sort(ProductList, ( p1, p2) -> {
			Float f1=p1.getRating();
			Float f2=p2.getRating();
			int x=f2.compareTo(f1);
			if(x==0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x=d1.compareTo(d2);
			}
			return x;
		});
		
		System.out.println("\nPrinting Products sorted based on highest rating and if 2 or more have same rating then by lowest cost");
		printProductList(ProductList);
	}

	public static void printProductList(List<Product> ProductList) {
		for (Product p : ProductList) {
			System.out.println(p);
		}
	}

}


