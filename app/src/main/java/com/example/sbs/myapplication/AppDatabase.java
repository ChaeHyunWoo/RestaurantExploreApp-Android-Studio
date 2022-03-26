package com.example.sbs.myapplication;

import java.util.ArrayList;
import java.util.List;

public class AppDatabase {
    private static List<Member> memberList;

    static {
        memberList = new ArrayList<>();

        Member member = null;

        member = new Member(1, "user1", "user1", "홍길동");
        memberList.add(member);

        member = new Member(2, "user2", "user2", "홍길순");
        memberList.add(member);

        member = new Member(3, "user3", "user3", "임꺽정");
        memberList.add(member);
    }

    public static Member findMember(String loginId) {
        for (Member member : memberList) {
            if (member.getLoginId().equals(loginId)) {
                return member;
            }
        }

        return null;
    }

    public static Member findMember(int id) {
        for (Member member : memberList) {
            if (member.getId() == id) {
                return member;
            }
        }

        return null;
    }

    public static void join(String loginId, String loginPasswd, String name) {
        int id = memberList.get(memberList.size() - 1).getId() + 1;
        Member member = new Member(id, loginId, loginPasswd, name);
        memberList.add(member);
    }
}