package kg.megacom.shopservice.database;

import kg.megacom.shopservice.models.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepo extends JpaRepository<Operation, Long> {
}
