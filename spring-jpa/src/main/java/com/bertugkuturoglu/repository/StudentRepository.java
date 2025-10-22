package com.bertugkuturoglu.repository;

import com.bertugkuturoglu.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer> {

    //HQL : sinifin ismi ve degisken islemleri kukllanilarak sorgular yazilir
    //SQL: Tablo ismi ve tablo icerisindeki kolon isimleri ile sorgular yazilir
    @Query(value = "from Student " , nativeQuery = false)
    List<Student> findAllStudent();


    @Query(value = "from Student s where s.id = :studentId")
    Student findStudentById(String studentId);





}
