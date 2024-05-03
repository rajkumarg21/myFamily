package com.myFamily.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myFamily.entities.MemberLogin;

@Repository
public interface LoginRepository extends JpaRepository<MemberLogin,Long> {

}
