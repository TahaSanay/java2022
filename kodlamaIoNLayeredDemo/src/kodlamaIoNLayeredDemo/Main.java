package kodlamaIoNLayeredDemo;

import java.util.ArrayList;
import java.util.List;
import kodlamaIoNLayeredDemo.core.logging.DataBaseLogger;
import kodlamaIoNLayeredDemo.core.logging.FileLogger;
import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.core.logging.MailLogger;
import kodlamaIoNLayeredDemo.dataAccess.DataDao;
import kodlamaIoNLayeredDemo.dataAccess.HibernateDataDao;
import kodlamaIoNLayeredDemo.dataAccess.JdbcDataDao;
import kodlamaIoNLayeredDemo.entities.Category;
import kodlamaIoNLayeredDemo.entities.Course;
import kodlamaIoNLayeredDemo.entities.InstructorUser;
import kodlamaIoNLayeredDemo.entities.User;
import kodlamaIoNLayeredDemo.logic.CategoryManager;
import kodlamaIoNLayeredDemo.logic.CourseManager;
import kodlamaIoNLayeredDemo.logic.UserManager;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Logger[] loggers = {new DataBaseLogger(), new FileLogger(), new MailLogger()};
		
		
		Course course = new Course(1, "Yazilim Gelistirici Yetistirme Kampi", "Java", "Engin Demirog", 0);
		Course course1 = new Course(2, "Senior Yazilim Gelistirici Yetistirme Kampi", ".NET", "Engin Demirog", 0);
		Course course2 = new Course(3, "Yazilim Gelistirici Yetistirme Kampi", "Javascript", "Engin Demirog", 0);
		
		
		List<Course> courseDb = new ArrayList<>();
		
		CourseManager courseManager = new CourseManager(courseDb, new JdbcDataDao(), loggers);
		courseManager.add(course);
		
		System.out.println("");
		
		courseManager.add(course1);
		

		
		System.out.println("");
		
		Category category = new Category(1, "Java", "Yazılımcı gelistirme kampi");
		Category category1 = new Category(2, ".NET", "Senior yazılımcı gelistirme kampı");
		
		List<Category> categoryDb = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDataDao(), loggers, categoryDb);
		categoryManager.add(category);
		
		System.out.println("");
		
		User user = new User(1, "Instructor", "Ankara", "Turkey", "4545466", "06000", "engindemirog@gmail.com");
		UserManager UserManager = new UserManager(new HibernateDataDao(),loggers);
		UserManager.add(user);
					
	}
}