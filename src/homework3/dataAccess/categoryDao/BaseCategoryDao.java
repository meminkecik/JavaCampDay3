package homework3.dataAccess.categoryDao;

import homework3.entities.Category;

public interface BaseCategoryDao {
    void add(Category category);
    void remove(Category category);
}
