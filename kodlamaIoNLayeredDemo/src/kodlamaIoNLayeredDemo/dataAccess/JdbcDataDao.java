package kodlamaIoNLayeredDemo.dataAccess;

import kodlamaIoNLayeredDemo.entities.Category;
import kodlamaIoNLayeredDemo.entities.Course;
import kodlamaIoNLayeredDemo.entities.User;

public class JdbcDataDao implements DataDao {

	@Override
	public void add(User user) {
		System.out.println("User added database with JDBC");
	}

	@Override
	public void add(Category category) {
		System.out.println("User added database with JDBC");

	}

	@Override
	public void add(Course course) {
		System.out.println("Course added database with JDBC");

	}

}
