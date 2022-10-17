package homework3.business;

import homework3.dataAccess.Database;
import homework3.dataAccess.instructorDao.BaseInstructorDao;
import homework3.entities.Instructor;

public class InstructorManager {
    BaseInstructorDao baseInstructorDao;
    public InstructorManager(BaseInstructorDao baseInstructorDao){
        this.baseInstructorDao = baseInstructorDao;
    }
    Validator validator;
    public void add(Instructor instructor){
        validator = new Validator();
        if (validator.isValidInstructor(instructor)){
            baseInstructorDao.add(instructor);
        }else {
            System.out.println("Eğitmen veri tabanına eklenemedi!");
        }
    }
}
