package programWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import programWebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
