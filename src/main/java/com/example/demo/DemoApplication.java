package com.example.demo;

import com.example.demo.entities.AuthorEntity;
import com.example.demo.entities.BookEntity;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {
	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	void setup() {
		AuthorEntity author = authorRepository.save(AuthorEntity.builder()
				.name("Oscar Wilde")
				.build());

		BookEntity bookEntity = BookEntity.builder()
				.name("Pe aripile vantului")
				.author(author)
				.build();
		bookRepository.save(bookEntity);
	}
}
