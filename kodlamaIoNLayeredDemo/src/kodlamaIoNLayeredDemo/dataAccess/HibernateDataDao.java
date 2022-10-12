package kodlamaIoNLayeredDemo.dataAccess;

import kodlamaIoNLayeredDemo.entities.Category;
import kodlamaIoNLayeredDemo.entities.Course;
import kodlamaIoNLayeredDemo.entities.User;

public class HibernateDataDao implements DataDao {

	@Override
	public void add(User user) {
		System.out.println("User added database with Hibernate" + user.getPeronalityType());
	}

	@Override
	public void add(Category category) {
		System.out.println("Category added database with Hibernate" + category.getName());

	}

	@Override
	public void add(Course course) {
		System.out.println("Course added database with Hibernate" + course.getName());
	}

}
