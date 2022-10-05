package oopWithNLayerApp.business;

import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
	}


	public void add (Product product) throws Exception { //response request pattern
		
		//business rules
		
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		
		//ProductDao productDao = new JdbcProductDao(); - Kötü Kod!
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
		
	}
}
