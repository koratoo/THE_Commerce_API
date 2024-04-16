package com.join_member.api.member.join;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinMemberDTO {

    private String member_id;                   /*회원ID*/
    private String member_pwd;                  /*비밀번호*/
    private String member_nickname;             /*닉네임*/
    private String member_name;                 /*이름*/
    private String member_phone;                /*전화번호*/
    private String member_email;                /*이메일주소*/
}
