package com.laolang.party.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.laolang.party.domain.Tuan;
import com.laolang.party.util.DButil;

public class TuanDaoImpl implements TuanDao {

	@Override
	public void add(Tuan tuan) {

		Connection conn = DButil.getConn();
		PreparedStatement ps = null;
		
		String sql = "insert into tuan(student_id,application_time,group_id) values (?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, tuan.getStudent_id());
			ps.setDate(2, new Date(System.currentTimeMillis())); 
			ps.setString(3, tuan.getGroup_id());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DButil.close(conn, ps, null);
		}
			
	}

	@Override
	public Tuan select(String student_id) {
		Connection conn = DButil.getConn();
		PreparedStatement ps = null;
		Result rs = null;
		return null;
	}

	@Override
	public List<Tuan> selectAll() {
		Connection conn = DButil.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		List<Tuan> tuanlist = new ArrayList<Tuan>();
		
		String sql = "select student_id,group_id,approval_time from tuan";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ){
				Tuan tuan = new Tuan();
				
				tuan.setStudent_id(rs.getString("student_id"));
				tuan.setGroup_id(rs.getString("group_id"));
				tuan.setApprival_time(rs.getDate("approval_time"));
				
				tuanlist.add(tuan);
			}
			
			return tuanlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DButil.close(conn, ps, rs);
		}
		
		return null;
	}
	
	

}
