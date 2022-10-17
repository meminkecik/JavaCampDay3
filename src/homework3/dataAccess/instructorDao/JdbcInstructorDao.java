package homework3.dataAccess.instructorDao;

import homework3.dataAccess.Database;
import homework3.entities.Instructor;

public class JdbcInstructorDao implements BaseInstructorDao{
    @Override
    public void add(Instructor instructor) {
        Database.instructors.add(instructor);
        System.out.println("JDBC ile veritabanına eklendi: " +instructor.getName());
    }

    @Override
    public void remove(Instructor instructor) {
        Database.instructors.remove(instructor);
        System.out.println("JDBC ile veritabanından silindi: " +instructor.getName());

    }
}
