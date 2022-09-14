package com.user.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.Model.UserReg;

@Repository

public interface UserRepo extends JpaRepository<UserReg, String> {
	List<UserReg> findByFirstName(String firstName);

	List<UserReg> findByEmail(String email);

}
