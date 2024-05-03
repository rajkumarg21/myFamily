package com.myFamily.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myFamily.entities.MemberAddress;


@Repository
public interface AddressRepository extends JpaRepository<MemberAddress, Long>{

}
