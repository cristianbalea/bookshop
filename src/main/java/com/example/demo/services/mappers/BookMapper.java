package com.example.demo.services.mappers;

import com.example.demo.entities.BookDto;
import com.example.demo.entities.BookEntity;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookDto toDto(BookEntity bookEntity) {
        return BookDto.builder()
                .name(bookEntity.getName())
                .authorName(bookEntity.getAuthor().getName())
                .build();
    }
}
