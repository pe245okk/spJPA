package com.example.demo.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {
	@Autowired
	MemberRepository mrs;
	
	//@Test
	public void add()
	{
		mrs.save(new Member("a","ab","00","台北","99"));
		
		System.out.println("add success");
	}
	
	//@Test
	public void selectMemberTest()
	{
		List<Member> l=mrs.selectUsername("ab");
		
		if(l.size()!=0)
		{
			System.out.println(l);
		}
	}
	
	@Test
	public void selectMemberTest2()
	{
		List<Member> l=mrs.selectMember("tea", "0987");
		
		if(l.size()!=0)
		{
			System.out.println(l);
		}
	}
}