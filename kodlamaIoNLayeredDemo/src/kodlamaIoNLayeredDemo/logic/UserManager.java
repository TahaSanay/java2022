package kodlamaIoNLayeredDemo.logic;

import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.dataAccess.DataDao;
import kodlamaIoNLayeredDemo.entities.User;

public class UserManager {
	private DataDao dataDao;
	private Logger[] loggers;
	
	
		public UserManager(DataDao dataDao, Logger[] loggers) {
		super();
		this.dataDao = dataDao;
		this.loggers = loggers;
	}


		public void add(User user) {
		dataDao.add(user);
		
		for (Logger loggers : loggers) {
			loggers.log(user.getPeronalityType());
		}
	}
	
	
}
