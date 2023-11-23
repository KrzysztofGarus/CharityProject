package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Institution;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<List<Category>> findAllByOrderByName();

    default List<Category> findAllCategoriesOrEmptyList() {
        return findAllByOrderByName().orElse(Collections.emptyList());
    }
 }
