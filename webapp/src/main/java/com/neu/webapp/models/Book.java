package com.neu.webapp.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id", columnDefinition = "BINARY(16)")
    private UUID id;

    private String title;
    private String author;
    private String isbn;

    private Integer quantity ;


    public Book( String title, String isbn,String author , Integer quantity) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }



    public Book() {
    }




}

