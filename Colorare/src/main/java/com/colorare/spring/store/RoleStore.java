package com.colorare.spring.store;

import java.util.List;

import com.colorare.spring.aggregate.cafe.CafeRole;


public interface RoleStore {
	String create(CafeRole role);
	CafeRole retrieve(String roleId);
	List<CafeRole> retrieveByName(String name);
	void update(CafeRole role);
	void delete(String roleId);

	boolean exists(String roleId);
}
