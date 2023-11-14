package com.example.demo.repositories;

import com.example.demo.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    @Override
    Optional<BookEntity> findById(Integer integer);
}
