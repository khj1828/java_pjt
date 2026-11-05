package com.office.diary;

import java.util.ArrayList;

public class DiaryDao {
	
	
	//[] -> 길이수정이 안된다 대체하고자 해서  ---> ArrayList (파이썬 List 같은거)
	
	private ArrayList<String>  diaries = new ArrayList<String>();  //[]

	public boolean insertDiary(DiaryDto diaryDto) {
		
		int beforSize = diaries.size();
		
		//System.out.println(diaries.size());   //0
		
//		diaries.add(diaryDto.getTxt());
		
		diaries.add(0, diaryDto.getTxt());   //0을 추가해서 데이터가 INDEX0자리로 와라 최신데이터가 뒤로온다. 
		
		int afterSize = diaries.size();
		
		
		
		//System.out.println(diaries.size());   //1
		
		return afterSize > beforSize ? true : false;
	}

	public ArrayList<String> getDiaries() {
		return diaries;
	}
	
	
	
	

}
