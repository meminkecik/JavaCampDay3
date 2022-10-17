package homework3.dataAccess.categoryDao;

import homework3.dataAccess.Database;
import homework3.dataAccess.courseDao.BaseCourseDao;
import homework3.entities.Category;
import homework3.entities.Course;

public class HibernateCategoryDao implements BaseCategoryDao {

    @Override
    public void add(Category category) {
        Database.categories.add(category);
        System.out.println("Hibernate ile veritabanına eklendi: " +category.getName());
    }

    @Override
    public void remove(Category category) {
        Database.categories.remove(category);
        System.out.println("Hibernate ile veritabanından silindi: " +category.getName());

    }
}
