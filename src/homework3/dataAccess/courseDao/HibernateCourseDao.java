package homework3.dataAccess.courseDao;

import homework3.dataAccess.Database;
import homework3.entities.Course;

public class HibernateCourseDao implements BaseCourseDao{
    @Override
    public void add(Course course) {
        Database.courses.add(course);
        System.out.println("Hibernate ile veritabanına eklendi: " +course.getName());
    }

    @Override
    public void remove(Course course) {
        Database.courses.remove(course);
        System.out.println("Hibernate ile veritabanından silindi: " +course.getName());

    }
}
