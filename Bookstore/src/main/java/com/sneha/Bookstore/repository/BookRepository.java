package com.sneha.Bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneha.Bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {//entity name and primary key type

}
