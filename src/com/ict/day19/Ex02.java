package com.ict.day19;

import java.util.Arrays;
import java.util.List;

enum Type{
	CHILD, YOUTH, ADULT
}
class Ex02 {
	private final String name;
	private final Type type;
	private final int visits;
	


	public Ex02(String name, Type type, int visits) {
		this.name = name;
		this.type = type;
		this.visits = visits;
	}
	
	public static final List<Ex02> visits_list =
			Arrays.asList(
			  new Ex02("루오", Type.CHILD, 10),
			  new Ex02("루세", Type.CHILD, 20),
			  new Ex02("밀로", Type.YOUTH, 5),
			  new Ex02("폴리오", Type.YOUTH, 5),
			  new Ex02("루치아", Type.ADULT, 30),
			  new Ex02("요한", Type.YOUTH, 7)
			  
			);



	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public int getVisits() {
		return visits;
	}
	
	
	
	
	
}
