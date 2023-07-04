package com.lmsProject.LMS.DTO;

import com.lmsProject.LMS.Enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IssueBookResponseDto {
    private String transanctionId;

    private String bookName;

    private TransactionStatus transactionStatus;
}
