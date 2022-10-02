package com.colorare.spring.store;

/** 
 *  꼴로라레 회원혜택, 직원혜택
 */

import java.util.List;

import com.colorare.spring.aggregate.cafe.Membership;


public interface MembershipStore {
    String create(Membership membership);
    Membership retrieve(String membershipId);
    Membership retrieveByRoleIdAndMemberId(String roleId, String memberId);
    List<Membership> retrieveByRoleId(String roleId);
    List<Membership> retrieveByMemberId(String memberId);
    void update(Membership membership);
    void delete(String membershipId);

    boolean exists(String membershipId);
}
