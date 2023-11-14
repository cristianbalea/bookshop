package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "BOOK")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", unique = true, nullable = false)
    private int id;

    @Column(name = "book_name")
    private String name;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private AuthorEntity author;
}
