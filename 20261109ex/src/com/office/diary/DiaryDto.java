package com.office.diary;

public class DiaryDto {
	
	private String diartTitle;
	private String diartBody;
	
	public DiaryDto() {
		
	}

	public DiaryDto(String diartTitle, String diartBody) {
		this.diartTitle = diartTitle;
		this.diartBody = diartBody;
	}

	public String getDiartTitle() {
		return diartTitle;
	}

	public void setDiartTitle(String diartTitle) {
		this.diartTitle = diartTitle;
	}

	public String getDiartBody() {
		return diartBody;
	}

	public void setDiartBody(String diartBody) {
		this.diartBody = diartBody;
	}
	
	

}
