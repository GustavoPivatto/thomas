package com.pivas.thomas.Repository;

import com.pivas.thomas.Entity.*;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
  
  }