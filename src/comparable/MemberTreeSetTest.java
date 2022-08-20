package comparable;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member member2 = new Member(2, "라마바");
        Member member = new Member(1, "가나다");
        Member member3 = new Member(3, "사아자");

        memberTreeSet.addMember(member);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);

        /**
         * Comparable 이 구현되어있지 않다
         */
        memberTreeSet.showAllMember();
    }
}
