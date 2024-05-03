package com.myFamily.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myFamily.entities.Member;
import com.myFamily.model.MemberModel;
import com.myFamily.services.MemberService;

/*
 * Name: Rajkumar Saad
 * Date: 03/05/2024
 */

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/add")
	public ResponseEntity<MemberModel> addMember(@RequestBody MemberModel memberModel) {
		MemberModel membere = memberService.addMember(memberModel);
		return ResponseEntity.ok(membere);
	}

	@GetMapping("/getMembers")
	public List<MemberModel> getMember() {

		return memberService.getMembers();
	}
}
