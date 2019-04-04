package com.spring.ssm.service;

import java.util.List;

import com.spring.ssm.entity.Banji;
import com.spring.ssm.entity.Student;

public interface IBanjiService {

	List<Banji> findAll();

	void add(Student student);

}
