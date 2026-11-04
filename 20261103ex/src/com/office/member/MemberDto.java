package com.office.member;

public class MemberDto {
	
	private String memId;
	private String memPW;
	private String memMail;
	private String memPhone;
	
	public MemberDto() {
		
		
	}
	
	public MemberDto(String memId, String memPW, String memMail, String memPhone) {
		this.memId = memId;
		this.memPW = memPW;
		this.memMail = memMail;
		this.memPhone = memPhone;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPW() {
		return memPW;
	}

	public void setMemPW(String memPW) {
		this.memPW = memPW;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	
	

}
