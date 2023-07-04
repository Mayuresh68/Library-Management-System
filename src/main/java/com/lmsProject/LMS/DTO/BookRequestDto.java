package com.lmsProject.LMS.DTO;

import com.lmsProject.LMS.Entity.Author;
import com.lmsProject.LMS.Enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookRequestDto {

    private String title;

    private int price;

    private Genre genre;

    private int authorId;

    //,.,.
}
