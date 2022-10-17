package homework3.business;

import homework3.dataAccess.courseDao.BaseCourseDao;
import homework3.entities.Course;
import homework3.logger.Logger;


public class CourseManager {
    Validator validator;
    private BaseCourseDao baseCourseDao;
    private Logger[] loggers;
    public CourseManager(BaseCourseDao baseCourseDao, Logger[] loggers){
        this.baseCourseDao = baseCourseDao;
        this.loggers = loggers;
    }
    public void add(Course course){
        validator = new Validator();
        for (Logger logger:loggers){
            logger.log(course.getName());
        }
        if (validator.isValidCourse(course)){
            baseCourseDao.add(course);
        }else {
            System.out.println("Veri tabanına eklenemedi!");
        }


    }
}
