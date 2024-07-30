package oops;
interface washable{
	
}
class Bike implements washable{
	
}
class truck implements washable{
	
}
class EVCar implements washable{
	
}
class Tv{
	
}
class Remote{
	
}
class Mobile{
	
}
class WasherMan{
	public void wash(Object obj) {
		if(obj instanceof washable) {
			System.out.println(obj.getClass().getSimpleName()+" is washable");
		}
		else {
			System.out.println(obj.getClass().getSimpleName()+" is not washable");
		}
	}
}
public class MarkerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WasherMan w = new WasherMan();
		w.wash(new Bike());
		w.wash(new Tv());
		w.wash(new Remote());
		w.wash(new Mobile());
		w.wash(new EVCar());
	}

}
