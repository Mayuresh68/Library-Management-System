package com.lmsProject.LMS.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremented
    int id;

    private String name;

    private int age;

    private String mobNo;

    private String email;

    //cardinality relation btwn Author-Book
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL) //All-It will Also update in child
    List<Book> books = new ArrayList<>();


}
