package com.korshl10.chap20.project.member;

public class UserService {
    private final String userName;                  // 유저 이름
    private final String userId;                    // 유저 아이디
    private final String userPwd;                   // 유저 비밀번호
    private final int useraccount;                  // 유저 계좌
    private final int userMIN_AGE = 20;             // 회원가입 최소 나이
    public String userGrade;                        // 유저 등급

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }







}
