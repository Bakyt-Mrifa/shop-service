package kg.megacom.shopservice.database;

import kg.megacom.shopservice.models.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepo extends JpaRepository<Goods, Long> {
    List<Goods> findAllByActive(boolean active);
}
