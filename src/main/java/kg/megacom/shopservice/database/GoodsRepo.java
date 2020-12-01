package kg.megacom.shopservice.database;

import kg.megacom.shopservice.models.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepo extends JpaRepository<Goods, Long> {

}
