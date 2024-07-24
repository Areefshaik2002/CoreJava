package practice;
public class MethodOverLoading_Identification {
	public void Identify(String Nationality) {
		 System.out.println("suspect  is a "+Nationality);
	}
	public void Identify(String Nationality, String Gender) {
		System.out.println("suspect  is a "+Nationality);
		System.out.println("suspect is a "+Gender);
	}
	public void Identify(String Nationality, String Gender, int Age) {
		System.out.println("suspect  is a "+Nationality);
		System.out.println("suspect is a "+Gender);
		System.out.println("suspect is a "+Age+" year old");
	}
	public void Identify(String Nationality, String Gender, int Age, double Height) {
		System.out.println("suspect  is a  "+Nationality);
		System.out.println("suspect is a "+Gender);
		System.out.println("suspect is a "+Age+" year old");
		System.out.println("suspect is a "+Height+"ft person");
	}
public static void main(String[] args) {
	MethodOverLoading_Identification id = new MethodOverLoading_Identification();
	id.Identify("Indian","Male",33,6.3);
}
}
