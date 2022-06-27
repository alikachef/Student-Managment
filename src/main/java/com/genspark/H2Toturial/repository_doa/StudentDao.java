package com.genspark.H2Toturial.repository_doa;

import com.genspark.H2Toturial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {
}
