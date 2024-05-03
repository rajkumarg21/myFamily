package com.myFamily.servicesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myFamily.convertar.ModelConvertar;
import com.myFamily.entities.Member;
import com.myFamily.entities.MemberAddress;
import com.myFamily.model.MemberModel;
import com.myFamily.repositories.MemberRepository;
import com.myFamily.services.MemberService;

/*
 * Name: Rajkumar Saad
 * Date: 03/05/2024
 */

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;

	@Override
	public List<MemberModel> getMembers() {
		List<Member> members = memberRepository.findAll();
		return members.stream().map(ModelConvertar::EntityToModel).collect(Collectors.toList());

	}

	@Override
	public MemberModel addMember(MemberModel memberModel) {

		Member member = ModelConvertar.ModelToEntity(memberModel);

		List<MemberAddress> addresses = member.getAddresses();
		for (MemberAddress address : addresses) {
			address.setMember(member);
		}
		Member savedMember = memberRepository.save(member);

		MemberModel shavedMembermodel = ModelConvertar.EntityToModel(savedMember);

		return shavedMembermodel;
	}

}
