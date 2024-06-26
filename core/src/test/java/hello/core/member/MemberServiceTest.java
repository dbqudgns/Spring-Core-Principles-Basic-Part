package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// 회원 가입 테스트
class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {

        //given : 주어질 때
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when : ~할 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then : ~이 된다.
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}

