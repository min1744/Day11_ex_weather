package com.iu.member;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberInit {

	private String members;
	private Scanner sc;

	public MemberInit() {
		StringBuffer sb = new StringBuffer();
		sb.append("iu, iu, iu, 26, 1,");
		sb.append("choa, choa, choa, 30, 2,");
		sb.append("suzy, suzy, suzy, 23, 2,");
		sb.append("hani, hani, hani, 15, 0");
		members = sb.toString();
		sc = new Scanner(System.in);
	}

	//메서드명 setMember 리턴은 멤버들(맵) 키는 아이디로, 밸류는 member
	public HashMap<String, Member> setMember() {
		HashMap<String, Member> map = new HashMap<String, Member>();
		Member member = null;
		StringTokenizer st = new StringTokenizer(members, ",");
		while(st.hasMoreTokens()) {
			member = new Member();
			member.setName(st.nextToken().trim());
			member.setId(st.nextToken().trim());
			member.setPw(st.nextToken().trim());
			member.setAge(Integer.parseInt(st.nextToken().trim()));
			member.setLevel(Integer.parseInt(st.nextToken().trim()));
			map.put(member.getId(), member);
		}
		return map;
	}

	public Member memberJoin() {
		Member member = new Member();
		System.out.println("아이디 입력");
		member.setId(sc.next());
		System.out.println("비밀번호 입력");
		member.setPw(sc.next());
		System.out.println("이름 입력");
		member.setName(sc.next());
		System.out.println("나이 입력");
		member.setAge(sc.nextInt());
		System.out.println("레벨 입력(0-2)");
		member.setLevel(sc.nextInt());
		return member;
	}

	public Member memberLogin(HashMap<String, Member> map) {
		Member member = null;
		System.out.println("아이디 입력");
		String nid = sc.next();
		System.out.println("비밀번호 입력");
		String npw = sc.next();

		member = map.get(nid);
		if(member!=null) {
			if(!member.getPw().equals(npw)) {
				member = null;
			}
		}
		return member;
	}

	public String memberDelete(HashMap<String, Member> map) {
		String str = "아이디를 확인해주세요.";
		System.out.println("탈퇴할 아이디를 입력하세요.");
		String nid = sc.next();
		Member member = map.get(nid);
		if(member != null) {
			map.remove(nid);
			str = "탈퇴가 완료되었습니다.";
		}
		return str;
	}
}