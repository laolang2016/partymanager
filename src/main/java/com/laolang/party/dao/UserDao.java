package com.laolang.party.dao;

import com.laolang.party.domain.User;

public interface UserDao {

	public User select( String user_id );
}
