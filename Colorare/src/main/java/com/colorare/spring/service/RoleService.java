package com.colorare.spring.service;

import com.colorare.spring.service.sdo.CafeRoleCdo;
import com.colorare.spring.shared.NameValueList;
import com.colorare.spring.aggregate.cafe.CafeRole;

import java.util.List;

public interface RoleService {
	String registerRole(CafeRoleCdo role);
	CafeRole findRoleById(String id);
	List<CafeRole> findRolesByName(String name);
	void modify(String roleId, NameValueList nameValues);
	void remove(String roleId);
}
