package spring.basic;

import spring.basic.discount.FixDiscountPolicy;
import spring.basic.member.MemberService;
import spring.basic.member.MemberServiceImpl;
import spring.basic.member.MemoryMemberRepository;
import spring.basic.order.OrderService;
import spring.basic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private static FixDiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

    private static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
