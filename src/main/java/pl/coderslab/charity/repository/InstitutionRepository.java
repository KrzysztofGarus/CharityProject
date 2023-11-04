package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.model.Institution;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    Optional<List<Institution>> findAllByOrderByName();

    default List<Institution> findAllInstitutionsOrEmptyList() {
        return findAllByOrderByName().orElse(Collections.emptyList());
    }
}
