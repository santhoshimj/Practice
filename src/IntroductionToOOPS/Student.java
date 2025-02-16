package IntroductionToOOPS;

public class Student {

	public static void main(String[] args) {
		
		StudentSub std = new StudentSub();
		
		std.name = "santhoshi";
		System.out.println("the name of the student is : " + std.name);
		std.studentsPlay();
		std.studentsStudy();
		

	}

}

class StudentSub{
	
	//students have: attributes or HAS-A part
	String name;
	int rollno;
	char sec;
	
	//what the students do : Methods or Does part
	void studentsPlay() {
		System.out.println("Students always play a lot");
	}
	
	void studentsStudy() {
		System.out.println("Students study a lot");
	}
	
}
