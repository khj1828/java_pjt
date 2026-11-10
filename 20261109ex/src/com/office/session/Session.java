package com.office.session;

import java.util.HashMap;

//세션은 딱하나만 존재하니 싱글통
public class Session {
	
	private static Session session;
	
	//private String signInedMemberId;  이거하고 게터세터만들기 
	//그러면 하나만 존재 Set 이용해서넣고 get으로 조회하면 되는데 이렇게 하면 문제는 항상 STRING 만 가능하다
	// object로 바꿔고 하나만 넣을수 있고 어레이 리스트해도 안되니 해쉬맵으로!
	
	final private HashMap<String, Object> attributies;
	
	
	private Session( ) {
		attributies = new HashMap<String, Object>();
	}
	
	public static Session getInstance() {
		if (session == null)
			session = new Session();
		
		return session;
			
		}

	public Object getAttribute(String name) {
		return attributies.get(name);
	}
	
	public void setAttribute(String name, Object object) {
		attributies.put(name, object);
	}
	
	public void removeAttribute(String name) {
		attributies.remove(name);
	}
	
	}
