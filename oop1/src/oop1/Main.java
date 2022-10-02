package oop1;

public class Main {

	public static void main(String[] args) {

		// set value
		Product product1 = new Product();
		/*product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne.jpg";*/
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne.jpg");

		// get
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		/*product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "bilmemne2.jpg";*/
		
		product2.setName("Delonghi Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bilmemne.jpg");

		// get
		//System.out.println(product2.name);
		
		Product product3 = new Product();
		/*product3.name = "Kitchen Aid Kahve Makinesi";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "bilmemne3.jpg";*/
		
		product3.setName("Delonghi Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		product3.setImageUrl("bilmemne.jpg");

		// get
		//System.out.println(product3.name);

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05391111111");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Taha");
		individualCustomer.setLastName("Sanay");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("02121111111");
		corporateCustomer.setTaxNumber("1234567");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};		
		
	}

}
