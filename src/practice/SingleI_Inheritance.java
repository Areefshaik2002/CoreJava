package practice;
//single inheritance
class Father{
	public void shout(){
		System.out.println("father shouts");
	}
}
class Son extends Father {
	public void silent() {
		System.out.println("son gets silenced");
	}
}
public class SingleI_Inheritance {

	public static void main(String[] args) {
		Son son  = new Son();
		son.shout();
		son.silent();
	}

}
