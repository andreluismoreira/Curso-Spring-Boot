package programWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import programWebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
