package com.example.sample.entryrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.entryentity.eentity;
@Repository
public interface erepo extends JpaRepository<eentity,Integer>  {

}
