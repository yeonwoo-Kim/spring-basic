package spring.basic;

import spring.basic.member.Grade;
import spring.basic.member.Member;
import spring.basic.member.MemberService;
import spring.basic.order.Order;
import spring.basic.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memebrId = 1L;
        Member member = new Member(memebrId, "memberA", Grade.VIP);
        memberService.join(member);

        Order newOrder = orderService.createOrder(memebrId, "apple", 5000);

        System.out.println("member: " + member.toString());
        System.out.println("order by member : " + newOrder.toString());

    }
}
