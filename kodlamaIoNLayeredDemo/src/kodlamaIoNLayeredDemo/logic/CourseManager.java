package kodlamaIoNLayeredDemo.logic;

import java.util.List;

import kodlamaIoNLayeredDemo.core.logging.Logger;
import kodlamaIoNLayeredDemo.dataAccess.DataDao;
import kodlamaIoNLayeredDemo.entities.Course;

public class CourseManager {
	private List<Course> courses;
	private DataDao dataDao;
	private Logger[] loggers;
	
	public CourseManager(List<Course> courses, DataDao dataDao, Logger[] loggers) {
		super();
		this.courses = courses;
		this.dataDao = dataDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception ("Price cannot be less than 0");
		}
		

		for(Course courses : courses) {
			if(courses.getName().equals(course.getName())) {
				throw new Exception("The course's name cannot same with another course");
			}
		}
		
		dataDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}		
	
	}

}
