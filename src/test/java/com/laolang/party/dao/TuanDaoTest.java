package com.laolang.party.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.laolang.party.domain.Tuan;

public class TuanDaoTest {

	@Before
	public void setUp(){
		dao = new TuanDaoImpl();
	}
	
	@Test
	public void testSelectAll(){
		List<Tuan> tuanlist = dao.selectAll();
		int i = 0;
		for ( i = 0; i < tuanlist.size(); i++ ){
			System.out.println(tuanlist.get(i));
		}
		
		Assert.assertEquals(1, 1);
	}
	
	private TuanDao dao ;
}
