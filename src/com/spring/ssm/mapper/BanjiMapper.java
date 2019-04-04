package com.spring.ssm.mapper;

import java.util.List;

import com.spring.ssm.entity.Banji;
import com.spring.ssm.entity.Student;

public interface BanjiMapper {
	public Banji findBanjiInfoById(Integer id);
	
	public List<Student> findStudentsByName(String banjiName);
	
	public Banji findClassCourseInfoByName(String banjiName);

	public List<Banji> findAll();
}
