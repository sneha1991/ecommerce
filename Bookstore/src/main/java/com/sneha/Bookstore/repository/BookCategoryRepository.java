package com.sneha.Bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sneha.Bookstore.entity.BookCategory;
//customize rest url pathREST ENDPOINTS
@RepositoryRestResource(collectionResourceRel="bookCategory",path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
  