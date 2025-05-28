package com.san.schedulemanager.repository;

import com.san.schedulemanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // 로그인용으로 활용 가능
}

