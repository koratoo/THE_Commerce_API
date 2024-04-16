package com.join_member.api.member.join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinMemberRepository extends JpaRepository <String, Object> {
    void save(JoinMemberVO vo);
}
