package com.office.memberr;

public interface IMemberService {
	
	
	public void signup(MemberDto memberDto);
	
	public MemberDto signIn(MemberDto memberDto);
	
	public void modify(MemberDto memberDto);
	
	public void delete(MemberDto memberDto);
	
	

}
