package spring.basic.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring.basic.member.Grade;
import spring.basic.member.Member;
import spring.basic.member.MemberService;
import spring.basic.member.MemberServiceImpl;

public class OrderServiceTest {
    private MemberService memberService = new MemberServiceImpl();
    private OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memebrId = 1L;
        Member member = new Member(memebrId, "memberA", Grade.VIP);
        memberService.join(member);

        Order newOrder = orderService.createOrder(memebrId, "apple", 5000);
        Assertions.assertThat(newOrder.getDiscountPrice()).isEqualTo(1000);
        Assertions.assertThat(newOrder.calculatePrice()).isEqualTo(4000);
    }
}
