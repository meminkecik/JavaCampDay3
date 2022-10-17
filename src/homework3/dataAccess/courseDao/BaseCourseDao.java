package homework3.dataAccess.courseDao;

import homework3.entities.Course;

public interface BaseCourseDao {
    void add(Course course);
    void remove(Course course);
}
