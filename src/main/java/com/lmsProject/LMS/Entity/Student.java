package com.lmsProject.LMS.Entity;

import com.lmsProject.LMS.Enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
   //@Column(name="Student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generated no.
    private int id;

    private String name;
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;

    @Column(unique = true)
    private String email;


    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard card;


}
