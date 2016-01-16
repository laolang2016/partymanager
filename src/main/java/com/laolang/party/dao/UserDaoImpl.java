package com.laolang.party.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.laolang.party.domain.User;
import com.laolang.party.util.DButil;

public class UserDaoImpl implements UserDao {

	@Override
	public User select(String user_id) {
		Connection conn = DButil.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		String sql = "select user_id,user_pwd,user_class from user where user_id = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			rs = ps.executeQuery();
			user = new User();
//			rs.next();
			while (rs.next()){
				user.setName(rs.getString("user_id"));
				user.setPwd(rs.getString("user_pwd"));
				user.setLevel(Integer.parseInt(rs.getString("user_class")));
				
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
