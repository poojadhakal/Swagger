package com.springSwagger2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springSwagger2.Model.Employment;
@Repository
public interface EmploymentDao extends JpaRepository<Employment, Long> {

}
