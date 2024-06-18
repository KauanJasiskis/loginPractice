package com.example.loginproject.repositories;

import com.example.loginproject.domain.book.Book;
import com.example.loginproject.domain.book.BookResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

public interface BookRepository extends JpaRepository<Book,String> {


}
