package com.join_member.api.member.join;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     Class Name : MemberJoinController.java
 *     Created Date : 2024.04.17
 *     Writer : Jisung Kim
 * </pre>
 */
@RestController
@RequestMapping("/api")
public class JoinMemberController {
    @PostMapping("/user/join")
    public ResponseEntity<Void> saveJoinMemberStatus(JoinMemberVO vo) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
