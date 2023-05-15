package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.model.Teacher;


@Mapper
public interface TeacherMapper {

	@Select("SELECT * FROM teacher")
	List<Teacher> selectAll();
	
	Teacher findById(Long id);
}
