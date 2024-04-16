package com.join_member.api.member.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinMemberService {

    @Autowired
    private JoinMemberRepository joinMemberRepository;

    public void saveMemberStatus (JoinMemberVO vo) {
        joinMemberRepository.save(vo);
    }

}
