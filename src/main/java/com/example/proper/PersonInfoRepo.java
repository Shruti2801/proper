package com.example.proper;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInfoRepo extends JpaRepository<PersonInfo, String> {
}
