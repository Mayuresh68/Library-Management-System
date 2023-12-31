package com.lmsProject.LMS.Entity;

import com.lmsProject.LMS.Enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
//import org.springframework.transaction.TransactionStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String transactionNumber;


    @Enumerated(EnumType.STRING)
    TransactionStatus transactionStatus;

    @CreationTimestamp
    private Date transactionDate;

    private boolean isIssueOperation;

    private String message;

   @ManyToOne
    @JoinColumn
    Book book;

    @ManyToOne
    @JoinColumn
    LibraryCard card;

}
