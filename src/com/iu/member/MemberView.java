package com.iu.member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberView {

	public void view(String str) {
		System.out.println(str);
	}

	public void view(Member member) {
		System.out.println("Id : " + member.getId());
		System.out.println("Pw : " + member.getPw());
		System.out.println("Name : " + member.getName());
		System.out.println("Age : " + member.getAge());
		System.out.println("Lv : " + member.getLevel());
		System.out.println("==============");
	}

	public void view(HashMap<String, Member> map) {
		Iterator<String> str = map.keySet().iterator();//1,2,3
		while(str.hasNext()) {
			String key = str.next();
			Member value = map.get(key);
			this.view(value);
		}
	}
}