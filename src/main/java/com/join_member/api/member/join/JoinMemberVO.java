package com.join_member.api.member.join;

public class JoinMemberVO {

    private String member_id;                   /*회원ID*/
    private String member_pwd;                  /*비밀번호*/
    private String member_nickname;             /*닉네임*/
    private String member_name;                 /*이름*/
    private String member_phone;                /*전화번호*/
    private String member_email;                /*이메일주소*/


    public String getMember_id() {
        return member_id;
    }
    public String getMember_pwd() {
        return member_pwd;
    }
    public String getMember_nickname() {
        return member_nickname;
    }
    public String getMember_name() {
        return member_name;
    }
    public String getMember_phone() {
        return member_phone;
    }
    public String getMember_email() {
        return member_email;
    }
}
