package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.model.Donation;

import java.util.Optional;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query("SELECT SUM(d.quantity) FROM Donation d")
    Optional<Long> sumAllBags();

    default Long sumAllBagsOrReturnZero() {
        return sumAllBags().orElse(0L);
    }
    @Query("SELECT COUNT(d) FROM Donation d")
    Optional<Long> countAllDonations();

    default Long countAllDonationsOrReturnZero(){
        return countAllDonations().orElse(0L);
    }
}
