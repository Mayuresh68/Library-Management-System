package com.lmsProject.LMS.Controller;

import com.lmsProject.LMS.Entity.Author;
import com.lmsProject.LMS.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    // change to DTO
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Author added successfully";
    }

    @GetMapping("/get_Authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }
}
