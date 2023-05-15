package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.TeacherMapper;
import com.example.model.Teacher;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TeacherController {

	
	private final TeacherMapper mapper;
	
	@GetMapping("/teachers")
	public List<Teacher> getAllTeachers() {
		
		List<Teacher> list = mapper.selectAll();
		
		return list;
	}
	
	@GetMapping("/teachers/{id}")
	public Teacher findById(@PathVariable long id) {
		
		Teacher teacher = mapper.findById(id);
		
		return teacher;
	}
}
