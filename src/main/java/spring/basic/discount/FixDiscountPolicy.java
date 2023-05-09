package spring.basic.discount;

import spring.basic.member.Grade;
import spring.basic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (Grade.VIP == member.getGrade()) {
            return discountFixAmount;
        }
        return 0;
    }
}
