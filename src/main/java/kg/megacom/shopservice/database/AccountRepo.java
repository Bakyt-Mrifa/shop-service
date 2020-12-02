package kg.megacom.shopservice.database;

import kg.megacom.shopservice.models.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

    List<Account> getAccountsByActive(boolean active);
}
