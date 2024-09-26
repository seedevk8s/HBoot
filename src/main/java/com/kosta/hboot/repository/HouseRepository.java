package com.kosta.hboot.repository;

import com.kosta.hboot.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<Member,Long> {
}
