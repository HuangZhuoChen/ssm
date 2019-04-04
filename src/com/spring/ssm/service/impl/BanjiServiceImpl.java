package com.spring.ssm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.ssm.entity.Banji;
import com.spring.ssm.entity.Student;
import com.spring.ssm.mapper.BanjiMapper;
import com.spring.ssm.service.IBanjiService;
import com.spring.ssm.util.MyBatisUtil;

public class BanjiServiceImpl implements IBanjiService {
	private BanjiMapper banjiMapper;
	
	public BanjiServiceImpl() {
		SqlSession session = MyBatisUtil.getSqlSession();
		banjiMapper = session.getMapper(BanjiMapper.class);
	}

	@Override
	public List<Banji> findAll() {
		return banjiMapper.findAll();
	}

	@Override
	public void add(Student student) {};
}
