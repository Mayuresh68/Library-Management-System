package com.lmsProject.LMS.Controller;

import com.lmsProject.LMS.DTO.StudentRequestDto;
import com.lmsProject.LMS.DTO.StudentResponseDto;
import com.lmsProject.LMS.DTO.StudentUpdateEmailRequestDto;
import com.lmsProject.LMS.Entity.Student;
import com.lmsProject.LMS.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentService.addStudent(studentRequestDto);
        return "Student has been added";
    }

    @GetMapping("/find_by_email")
    public String findStudentByEmail(@RequestParam("email") String email){
        return studentService.findByEmail(email);
    }

    // get students of particular age
//    @GetMapping("/find_by_age")
//    public List<Student> findStudentByAge(@RequestParam("age") int age){
//        return studentService.findByAge(age);
//    }

    // try for some other attribute also

    @PutMapping("/update_email")
    public StudentResponseDto updateEmail(@RequestBody StudentUpdateEmailRequestDto studentUpdateEmailRequestDto){
        return studentService.updateEmail(studentUpdateEmailRequestDto);
    }

}
