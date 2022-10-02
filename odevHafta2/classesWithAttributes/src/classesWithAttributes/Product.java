package classesWithAttributes;
public class Product {
	
	public Product() {
		System.out.println("Yapýcý Blok Çalýþtý");
	}
	
	public Product(int id, String name, String description, int price, int stockAmount, String renk) {
		System.out.println("Yapýcý Blok Çalýþtý");

		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;	
	}
	
	private double price;
	private int stockAmount;
	private int id;
	private String name;
	private String description;
	private String renk;
	private String kod;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {  //kodu kullanýcýnýn yazmasýna engel olundu
		return this.name.substring(0, 1) + id;
	}


	
}
