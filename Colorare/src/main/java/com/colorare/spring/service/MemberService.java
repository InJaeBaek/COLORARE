package com.colorare.spring.service;

import java.util.List;

import com.colorare.spring.aggregate.cafe.ColorareMember;
import com.colorare.spring.service.sdo.MemberCdo;
import com.colorare.spring.shared.NameValueList;


public interface MemberService {
	//
	String registerMember(MemberCdo member);
	ColorareMember findMemberById(String memberId);
	ColorareMember findMemberByEmail(String memberEmail);
	List<ColorareMember> findMembersByName(String name);
	void modifyMember(String memberId, NameValueList member);
	void removeMember(String memberId);
}
