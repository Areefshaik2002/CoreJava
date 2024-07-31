package oops;
class Exam{
	private Exam() {
		System.out.println("private constructor");
	}

public static Exam getInstance() {
	return new Exam();
}
}
public class PrivateConstructor {
	public static void main(String[] args) {
		Exam.getInstance();
		
	}

}
