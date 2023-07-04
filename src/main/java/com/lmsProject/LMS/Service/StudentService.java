package com.lmsProject.LMS.Service;

import com.lmsProject.LMS.DTO.StudentRequestDto;
import com.lmsProject.LMS.DTO.StudentResponseDto;
import com.lmsProject.LMS.DTO.StudentUpdateEmailRequestDto;
import com.lmsProject.LMS.Entity.LibraryCard;
import com.lmsProject.LMS.Entity.Student;
import com.lmsProject.LMS.Enums.CardStatus;
import com.lmsProject.LMS.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(StudentRequestDto studentRequestDto) {
        //if new student is added, automatically card should be generated at the same time

        //create a student object
       Student student = new Student();
       student.setAge(studentRequestDto.getAge());
       student.setName(studentRequestDto.getName());
       student.setDepartment(studentRequestDto.getDepartment());
       student.setEmail(studentRequestDto.getEmail());

       //create card object
        LibraryCard card = new LibraryCard();
        card.setStatus(CardStatus.ACTIVATED);
        card.setStudent(student);

        //set card in student]
        student.setCard(card);

        studentRepository.save(student);
    }

    public String findByEmail(String email) {
        Student student = studentRepository.findByEmail(email);
        return student.getName();
    }




//    public List<Student> findByAge(int age) { //not woring thia APi
//        List<Student> studentList = studentRepository.findByAge(age);
//        return studentList;
//    }


    public StudentResponseDto updateEmail(StudentUpdateEmailRequestDto studentUpdateEmailRequestDto) {
        Student student = studentRepository.findById(studentUpdateEmailRequestDto.getId()).get();
        student.setEmail(studentUpdateEmailRequestDto.getEmail());

        //update step
        Student updatedStudent = studentRepository.save(student);

        //convert updated student to response DTO
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(updatedStudent.getId());
        studentResponseDto.setName(updatedStudent.getName());
        studentResponseDto.setEmail(updatedStudent.getEmail());

        return studentResponseDto;
    }
}
