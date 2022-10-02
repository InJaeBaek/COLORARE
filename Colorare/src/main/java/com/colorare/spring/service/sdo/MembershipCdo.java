package com.colorare.spring.service.sdo;


import com.colorare.spring.aggregate.cafe.vo.RoleInCafe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MembershipCdo {
    //
    private String roleId;
    private String memberId;
    private RoleInCafe role;
}
