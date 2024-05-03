package com.myFamily.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myFamily.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,  Long>{

}
