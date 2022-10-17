package homework3;

import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.business.InstructorManager;
import homework3.dataAccess.categoryDao.HibernateCategoryDao;
import homework3.dataAccess.courseDao.JdbcCourseDao;
import homework3.dataAccess.instructorDao.JdbcInstructorDao;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Instructor;
import homework3.logger.Logger;
import homework3.logger.EmailLogger;

public class Main {
    public static void main(String[] args) {


        Category category1 = new Category("Programlama");
        Category category2 = new Category("Siber Güvenlik");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
        categoryManager.add(category1);
        categoryManager.add(category2);
        Instructor instructor1 = new Instructor(1,"Engin","Demiroğ","111111111111");
        Instructor instructor2 = new Instructor(2,"Atıl","Samancıoğlu","222222222222");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        Course course1 = new Course();
        course1.setId(1);
        course1.setName("Java ile Programlamaya Giriş");
        course1.setInstructor(instructor1);
        course1.setCategory(category1);
        course1.setPrice(100);
        Logger[] loggers = new Logger[]{new EmailLogger()};
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course1);
        Course course2 = new Course(2,"Java İleri Seviye",50,category1,instructor1);
        courseManager.add(course2);



    }
}
