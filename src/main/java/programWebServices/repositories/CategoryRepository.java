package programWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import programWebServices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
