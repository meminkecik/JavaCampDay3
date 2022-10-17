package homework3.business;

import homework3.dataAccess.Database;
import homework3.dataAccess.categoryDao.BaseCategoryDao;
import homework3.entities.Category;

public class CategoryManager {
    Validator validator;

    Database database;
    BaseCategoryDao baseCategoryDao;
    public CategoryManager(BaseCategoryDao baseCategoryDao){
        this.baseCategoryDao=baseCategoryDao;
    }
    public void add(Category category){
        validator = new Validator();
        if (validator.isValidCategory(category)){
            baseCategoryDao.add(category);
        }
    }
}
