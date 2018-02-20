package com.exam.learnToEarn.repository;

import org.springframework.data.repository.CrudRepository;

import com.exam.learnToEarn.entity.StudentEntity;

public interface StudentRepository  extends CrudRepository<StudentEntity, Long> {

}
