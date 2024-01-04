package com.online.booking.repo;

import com.online.booking.enums.UserRole;
import com.online.booking.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {
    Optional<UserModel> findByIdAndRole(int userID, UserRole role);
    // SELECT * from users where userID=10 AND role="Driver";
}
