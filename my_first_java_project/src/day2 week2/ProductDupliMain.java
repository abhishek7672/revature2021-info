package mytasks3Aug;

import java.util.HashSet;
import java.util.Set;

public class ProductDupliMain {
	public static void main(String[] args) {

		Set<ProductDupli> ProductList = new HashSet<>();
		ProductList.add(new ProductDupli(100, "Laptop", 12000.22, 2.3f, 2));
		ProductList.add(new ProductDupli(101, "Inverter", 10100.22, 2.4f,1));
		ProductList.add(new ProductDupli(190, "Reebok shoes", 1100.22, 2.3f,2));
		ProductList.add(new ProductDupli(200, "Denver Deo", 1000.22, 4.3f,7));
		ProductList.add(new ProductDupli(100, "Laptop", 12000.22, 2.3f, 2));
		ProductList.add(new ProductDupli(100, "Laptop", 12000.22, 2.3f, 2));
		ProductList.add(new ProductDupli(190, "Reebok shoes", 1100.22, 2.3f,2));
		ProductList.add(new ProductDupli(190, "Reebok shoes", 1100.22, 2.3f,2));
		ProductList.add(new ProductDupli(200, "Denver Deo", 1000.22, 4.3f,7));
		ProductList.add(new ProductDupli(200, "Denver Deo", 1000.22, 4.3f,7));
		
		
		printProductList(ProductList);
		
	
	}

	public static void printProductList(Set<ProductDupli> ProductList) {
		for (ProductDupli p : ProductList) {
			System.out.println(p);
		}
	}

}


