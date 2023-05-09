package spring.basic;

import spring.basic.member.Grade;
import spring.basic.member.Member;
import spring.basic.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        // 기존에 직접 구현체를 생성한 MemberService
        // MemberService memberService = new MemberServiceImpl();
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member name : " + member.getName());
        System.out.println("findMember name : " + findMember.getName());
    }
}
