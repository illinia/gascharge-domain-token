package com.gascharge.taemin.domain.repository.token;

import com.gascharge.taemin.domain.entity.token.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {

    @Query("select t from Token t where t.name = :name")
    Optional<Token> findByName(@Param(value = "name") String name);
}
