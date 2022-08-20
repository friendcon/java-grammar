package comparable;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    /**
     * 오름차순 정렬
     * @param비교 대상 객체
     */
    /*@Override
    public int compareTo(Member member) {
        *//*if(this.memberId > member.memberId){
            return 1;
        } else if(this.memberId < member.memberId) {
            return -1;
        } else {
            return 0;
        }*//*
        return (this.memberId - member.memberId);
    }*/

    @Override
    public int compare(Member mem1, Member mem2) {
        return (mem1.memberId - mem2.memberId);
    }
}
