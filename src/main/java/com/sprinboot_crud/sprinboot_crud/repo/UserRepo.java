package com.sprinboot_crud.sprinboot_crud.repo;

import com.sprinboot_crud.sprinboot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "select * from user where id=?1", nativeQuery = true)
    User getUserById(Integer userId);
}
