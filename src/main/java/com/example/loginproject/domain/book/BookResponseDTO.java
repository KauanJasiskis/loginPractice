package com.example.loginproject.domain.book;

public record BookResponseDTO(String id,String name,Double rating) {
    public BookResponseDTO(Book book){
        this(book.getId(),book.getName(),book.getRating());
    }
}
