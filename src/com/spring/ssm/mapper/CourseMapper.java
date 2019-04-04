package com.spring.ssm.mapper;

import java.util.List;

import com.spring.ssm.entity.Banji;
import com.spring.ssm.entity.Student;

public interface CourseMapper {
	public Banji findBanjiInfoById(Integer id);
	
	public List<Student> findStudentsByName(String banjiName);
}
