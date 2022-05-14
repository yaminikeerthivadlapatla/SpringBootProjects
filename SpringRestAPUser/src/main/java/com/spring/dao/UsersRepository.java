package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.main.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}