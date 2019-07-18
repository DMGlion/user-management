package com.david.serverusermanagement.repository;

import com.david.serverusermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByUsername(Long aLong);

    @Query("SELECT u.name from User u where u.id in (:pIdList)")
    List<String> findUserIdList(@Param("pIdList") List<Long> idList);
}
