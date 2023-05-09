package spring.basic.discount;

import spring.basic.member.Member;

public interface DiscountPolicy {
    /**
     * 할인 대상 금액
     */
    int discount(Member member, int discount);
}
