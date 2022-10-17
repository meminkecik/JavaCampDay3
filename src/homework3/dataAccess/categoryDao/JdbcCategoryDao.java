package homework3.dataAccess.categoryDao;

import homework3.dataAccess.Database;
import homework3.entities.Category;

public class JdbcCategoryDao implements BaseCategoryDao{
    @Override
    public void add(Category category) {
        Database.categories.add(category);
        System.out.println("JDBC ile veritabanına eklendi: " +category.getName());
    }

    @Override
    public void remove(Category category) {
        Database.categories.remove(category);
        System.out.println("JDBC ile veritabanından silindi: " +category.getName());

    }
}
