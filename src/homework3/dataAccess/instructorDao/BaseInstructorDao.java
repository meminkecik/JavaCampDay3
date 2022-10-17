package homework3.dataAccess.instructorDao;

import homework3.entities.Instructor;

public interface BaseInstructorDao {
    void add(Instructor instructor);
    void remove(Instructor instructor);
}
