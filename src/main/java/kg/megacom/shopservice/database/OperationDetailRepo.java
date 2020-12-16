package kg.megacom.shopservice.database;

import kg.megacom.shopservice.models.entity.OperationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationDetailRepo extends JpaRepository<OperationDetail, Long> {
    List<OperationDetail> findAllById (Long id);
}
