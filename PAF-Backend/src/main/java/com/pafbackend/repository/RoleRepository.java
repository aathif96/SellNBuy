package com.pafbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pafbackend.model.Role;
import com.pafbackend.model.User;

@Repository
public interface RoleRepository extends JpaRepository<User, Integer> {

	Role findByRoles( String roles);
}
