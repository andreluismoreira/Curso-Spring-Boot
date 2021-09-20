package programWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import programWebServices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
