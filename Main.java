package oopIntro;

public class Main {
	
	public static void main(String[] args) {
	
		Product product1 = new Product(5,"Lenovo V14", 15000, "8GB Ram"); // �rnek olu�turma, referans olu�turma, intance
		
		Product product2 = new Product(5, "Lenovo V15", 15000, "16GB Ram"); // �rnek olu�turma, referans olu�turma, intance
		
		Product product3 = new Product(5, "HP 5", 15000, "8GB Ram"); // �rnek olu�turma, referans olu�turma, intance
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		// System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/Bah�e";
		
		Category[] categories = {category1, category2};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}
	
}
