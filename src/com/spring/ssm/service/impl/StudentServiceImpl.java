package com.spring.ssm.service.impl;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import com.spring.ssm.entity.Student;
import com.spring.ssm.mapper.StudentMapper;
import com.spring.ssm.service.IStudentService;
import com.spring.ssm.util.MyBatisUtil;

public class StudentServiceImpl implements IStudentService {
	private StudentMapper studentMapper;
	private SqlSession session;
	
	public StudentServiceImpl() {
		session = MyBatisUtil.getSqlSession();
		studentMapper = session.getMapper(StudentMapper.class);
	}
	
	@Override
	public void add(Student student) {
		studentMapper.add(student);
		session.commit();
	}

}
