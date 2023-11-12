package com.datamodelmaptool.DatamodelMappingTool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datamodelmaptool.DatamodelMappingTool.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
