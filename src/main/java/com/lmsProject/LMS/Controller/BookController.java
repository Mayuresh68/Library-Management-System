package com.lmsProject.LMS.Controller;

import com.lmsProject.LMS.DTO.BookRequestDto;
import com.lmsProject.LMS.DTO.BookResponseDto;
import com.lmsProject.LMS.Entity.Book;
import com.lmsProject.LMS.Repository.BookRepository;
import com.lmsProject.LMS.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public BookResponseDto addBook(@RequestBody BookRequestDto bookRequestDto) throws Exception {
       return bookService.addBook(bookRequestDto);
    }
}
