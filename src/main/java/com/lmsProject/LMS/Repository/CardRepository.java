package com.lmsProject.LMS.Repository;

import com.lmsProject.LMS.Entity.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {
}
