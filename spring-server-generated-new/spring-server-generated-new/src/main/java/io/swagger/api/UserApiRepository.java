package io.swagger.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.User;

@Repository
public interface UserApiRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
