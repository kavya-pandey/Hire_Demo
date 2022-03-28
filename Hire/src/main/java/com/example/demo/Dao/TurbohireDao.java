package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.TurbohireDummy;



public interface TurbohireDao extends JpaRepository<TurbohireDummy,Integer>{

}
