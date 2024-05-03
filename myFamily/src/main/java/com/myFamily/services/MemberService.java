package com.myFamily.services;

import java.util.List;



import com.myFamily.entities.Member;
import com.myFamily.model.MemberModel;


public interface MemberService {
	
	public MemberModel addMember(MemberModel member);
	public List<MemberModel> getMembers();
//	public Member getMemberById(Long memberId);
//	public Member updateBook(Member member);
//	public void deleteMember(Long memberId);
	
	
}
