package homework3.dataAccess.courseDao;
import homework3.dataAccess.Database;
import homework3.dataAccess.courseDao.BaseCourseDao;
import homework3.entities.Course;



public class JdbcCourseDao implements BaseCourseDao {

    public void add(Course course){

        Database.courses.add(course);
        System.out.println("JDBC ile veritabanına eklendi: " +course.getName());

    }

    @Override
    public void remove(Course course) {
        Database.courses.remove(course);
        System.out.println("JDBC ile veritabanından silindi: " +course.getName());
    }


}
