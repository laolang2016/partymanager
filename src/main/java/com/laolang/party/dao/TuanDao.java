package com.laolang.party.dao;

import java.util.List;

import com.laolang.party.domain.Tuan;



public interface TuanDao {

	public void add(Tuan tuan );
	
	public Tuan select( String student_id );
	
	public List<Tuan> selectAll();
	
}
