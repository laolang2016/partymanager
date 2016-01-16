package com.laolang.party.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.laolang.party.domain.User;

public class UserDaoTest {

	@Before
	public void setUp(){
		dao = new UserDaoImpl();
	}
	
	@Test
	public void testSelect(){
		User user = dao.select("1406980101");
		System.out.println(user);
		Assert.assertEquals(1, 1);
	}
	
	
	private UserDao dao;
	
}
