package com.colorare.spring.store;

import java.util.List;

import com.colorare.spring.aggregate.cafe.ColorareMember;


public interface MemberStore {
	String create(ColorareMember member);
	ColorareMember retrieve(String memberId);
	ColorareMember retrieveByEmail(String email);
	List<ColorareMember> retrieveByName(String name);
	void update(ColorareMember member);
	void delete(String email);
	
	boolean exists(String memberId);
}
