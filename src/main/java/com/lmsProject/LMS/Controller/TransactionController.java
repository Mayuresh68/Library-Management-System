package com.lmsProject.LMS.Controller;

import com.lmsProject.LMS.DTO.IssueBookRequestDto;
import com.lmsProject.LMS.DTO.IssueBookResponseDto;
import com.lmsProject.LMS.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/issue")
    public ResponseEntity issueBook(@RequestBody IssueBookRequestDto issueBookRequestDto){

        IssueBookResponseDto issueBookResponseDto;
        try{
            issueBookResponseDto = transactionService.issueBook(issueBookRequestDto);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        }

        return new ResponseEntity(issueBookResponseDto,HttpStatus.ACCEPTED);
    }

    @GetMapping("/get")
    public String getAllTxns(@RequestParam("cardId") int cardId){
        return transactionService.getAllTxns(cardId);
    }
}
