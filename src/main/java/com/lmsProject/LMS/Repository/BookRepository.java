package com.lmsProject.LMS.Repository;

import com.lmsProject.LMS.Entity.Book;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
