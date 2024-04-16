package com.join_member.api.member.join;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JoinMemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String member_id;                   /*회원ID*/

    @JsonIgnore
    @Column(nullable = false)
    private String member_pwd;                  /*비밀번호*/
    private String member_nickname;             /*닉네임*/

    @Column(nullable = false, unique = true)
    private String member_name;                 /*이름*/
    private String member_phone;                /*전화번호*/
    private String member_email;                /*이메일주소*/

}
