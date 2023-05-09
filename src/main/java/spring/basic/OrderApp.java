package spring.basic;

import spring.basic.member.Grade;
import spring.basic.member.Member;
import spring.basic.member.MemberService;
import spring.basic.member.MemberServiceImpl;
import spring.basic.order.OrderService;
import spring.basic.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memebrId = 1L;
        Member member = new Member(memebrId, "memberA", Grade.VIP);
        memberService.join(member);

        orderService.createOrder(memebrId, "apple", 5000);
    }
}
