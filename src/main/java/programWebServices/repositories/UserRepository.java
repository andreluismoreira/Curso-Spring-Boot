package programWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import programWebServices.entities.User;


public interface UserRepository extends JpaRepository<User,Long>{

}
