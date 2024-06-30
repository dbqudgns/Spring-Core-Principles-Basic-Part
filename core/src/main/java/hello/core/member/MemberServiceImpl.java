package hello.core.member;

// 회원 서비스 구현체
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 가입
    public void join(Member member) {
        memberRepository.save(member);
    }

    // 회원 조회
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
