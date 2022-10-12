package kodlamaIoNLayeredDemo.logic;

import java.util.List;

import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.dataAccess.DataDao;
import kodlamaIoNLayeredDemo.entities.Category;

public class CategoryManager {
	private List<Category> categories;
	private DataDao dataDao;
	private Logger[] loggers;
	
	public CategoryManager(DataDao dataDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categories = categories;
		this.dataDao = dataDao;
		this.loggers = loggers;
	}
	
public void add(Category category) throws Exception {
		
		
		for(Category category1 : categories)  {
			if(category1.getName().equals(category1.getName())) {
				throw new Exception("The category's name cannot same with another category");
			}
		}		
		
		dataDao.add(category);
		categories.add(category);
	
    for (Logger logger : loggers) {
    	logger.log(category.getName());
    }  
}
	
}
