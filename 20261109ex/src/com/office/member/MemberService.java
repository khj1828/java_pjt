package com.office.member;

public class MemberService {
	
	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	


	public int signup(MemberDto memberDto) {
		
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			return memberDao.insertMember(memberDto);
			
		} else {
			return 0;
			
		}
		
	}

}
