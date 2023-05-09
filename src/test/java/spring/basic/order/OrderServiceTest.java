package spring.basic.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.basic.AppConfig;
import spring.basic.member.Grade;
import spring.basic.member.Member;
import spring.basic.member.MemberService;

public class OrderServiceTest {
    private MemberService memberService;
    private OrderService orderService;

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }
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
