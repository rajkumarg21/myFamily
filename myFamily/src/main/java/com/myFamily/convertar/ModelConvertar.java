package com.myFamily.convertar;

import com.myFamily.entities.Member;
import com.myFamily.model.MemberModel;

/*
 * Name: Rajkumar Saad
 * Date: 03/05/2024
 */

public class ModelConvertar {
	public static Member ModelToEntity(MemberModel memberModel) {
		Member member = new Member(null, memberModel.getFirstName(), memberModel.getLastName(), memberModel.getGender(),
				memberModel.getAge(), memberModel.getDob(), memberModel.getEmail(), memberModel.getPhoneNumber(),
				memberModel.getProfession(), memberModel.getAddresses()

		);
		return member;
	}

	// convert entity to DTO/model dao
	public static MemberModel EntityToModel(Member member) {
		MemberModel memberModel = new MemberModel(member.getFirstName(), member.getLastName(), member.getGender(),
				member.getAge(), member.getDob(), member.getEmail(), member.getPhoneNumber(), member.getProfession(),
				member.getAddresses());

		return memberModel;
	}
}
