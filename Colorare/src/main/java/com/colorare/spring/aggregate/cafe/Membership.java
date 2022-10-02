package com.colorare.spring.aggregate.cafe;

import com.colorare.spring.aggregate.Entity;
import com.colorare.spring.aggregate.cafe.vo.RoleInCafe;
import com.colorare.spring.shared.NameValue;
import com.colorare.spring.shared.NameValueList;
import com.colorare.spring.util.helper.DateUtil;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Membership extends Entity {
	//
	private String roleId;
	private String memberId;
	private RoleInCafe role;
	private String joinDate;

	public Membership(String id) {
		
		super(id);
		
	}

	public Membership(String roleId, String memberId) {
		
		this.roleId = roleId; 
		this.memberId = memberId;
		this.role = RoleInCafe.Member;
		this.joinDate = DateUtil.today();
		
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();

		builder.append("role Id:").append(roleId);
		builder.append(", member Id:").append(memberId);
		builder.append(", role:").append(role.name());
		builder.append(", join date:").append(joinDate);

		return builder.toString();
		
	}

	public void modifyValues(NameValueList nameValueList) {
		
		for (NameValue nameValue : nameValueList.getNameValues()) {
			String value = nameValue.getValue();
			switch (nameValue.getName()) {
				case "role":
					this.role = RoleInCafe.valueOf(value);
					break;
			}
		}
		
	}

	public static Membership sample() {
		
		return new Membership(
				CafeRole.sample().getId(),
				ColorareMember.sample().getId()
		);
		
	}

	public static void main(String[] args) {
		
		System.out.println(sample().toString());
		
	}
}
