package com.task.eta.repository;

import com.task.eta.entity.TransactionEntity;
import com.task.eta.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    @Query("select u.id from UserEntity u where u.email=:email")
    public Integer checkUser(String email);
    @Query("select u from UserEntity u where u.email=:email")
    public UserEntity loginUser(String email);

    Optional<UserEntity> findById(Integer integer);
}
