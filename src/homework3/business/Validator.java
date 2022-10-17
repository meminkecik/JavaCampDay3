package homework3.business;

import homework3.dataAccess.Database;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Instructor;

public class Validator {
    Database database;
    public boolean isValidCourse(Course course){
        for(Course c:Database.courses){
            if (course.getName() == c.getName()){
                System.out.println("Kurs eklenemedi. Aynı isimde başka bir kurs var.");
                return false;
            }
        }
        if (course.getPrice()<0){
            return false;
        }else {
            return true;
        }
    }
    public boolean isValidCategory(Category category){
        for (Category c:Database.categories){
            if (c.getName()==category.getName()){
                System.out.println("Aynı isimde bir kategori bulunmaktadır.");
                return false;
            }
        }
        return true;
    }
    public boolean isValidInstructor(Instructor instructor){
        for (Instructor i:Database.instructors){
            if (i.getName()==instructor.getName()){
                System.out.println("Aynı isimde bir eğitmen bulunmaktadır.");
                return false;
            }
        }
        return true;
    }
}
