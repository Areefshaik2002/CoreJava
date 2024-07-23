package oops;
//In multilevel inheritance a class acts as both super and subclass.
class phone{
	public void call() {
		System.out.println("call connected");
	}
}
class CameraPhone extends phone{
	public void pics() {
		System.out.println("clicked picture");
	}
}
class smartPhone extends CameraPhone{
	public void InstallApps() {
		System.out.println("installed apps");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		//in order to call all the properties we need to create a object for the
		//youngest class
		smartPhone obj = new smartPhone();
		obj.call();
		obj.pics();
		obj.InstallApps();

	}

}
