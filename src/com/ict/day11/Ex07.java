package com.ict.day11;

public class Ex07 {
	String name = "";
	int kor = 0;
	int eng = 0 ;
	int math = 0 ;
	int sum = 0 ;
	double avg = 0.0;
	String hak = "";
	int rank = 1 ;
	
	public Ex07() {
		
	}
	// 생성자는 메서드를 호출할 수 있다.
	public Ex07(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		process();
	}


	// 1. 총점(), 평균(), 학점()을 구하는 메서드를 각각 만들어서 각각 호출
	// 2. 하나에 메서드에 총점, 평균, 학점을 구할 수 있다.
	// 3.  총점, 평균, 학점을 구하는 메서드를 각각 만들어서 총점() => 평균() => 학점()
	
	// 한번에 처리하자.
	public void process() {
	
		sum = kor + eng + math ;
		avg = (int)((sum)/3.0 *10) / 10.0;
		if(avg >= 90) {
			hak = "A학점";
		}else if(avg >= 80) {
			hak = "B학점";
		}else if(avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}
}
