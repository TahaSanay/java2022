package kodlamaIoNLayeredDemo.dataAccess;

import kodlamaIoNLayeredDemo.entities.Category;
import kodlamaIoNLayeredDemo.entities.Course;
import kodlamaIoNLayeredDemo.entities.User;

public interface DataDao {
	void add(User user);
	void add(Category category);
	void add(Course course);
	
}
