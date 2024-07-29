package oops;
class Bird{
	public void Fly(){
		System.out.println("Bird started moving");
	}
}
class Eagle extends Bird{
	public void Fly() {
		System.out.println("Eagle started moving");
	}
}
public class DMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird1 = new Bird();
		bird1.Fly();
		Bird bird2 = new Eagle();
		bird2.Fly();
		Eagle eagle = new Eagle();
		eagle.Fly();
		
	}

	
}
