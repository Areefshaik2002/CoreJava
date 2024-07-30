package oops;
interface Sim{
	abstract void callConnect();
}
class Airtel implements Sim{
	@Override
	public void callConnect() {
		System.out.println("Airtel is 5G network");
	}
}
class Jio implements Sim{
	@Override
	public void callConnect() {
		System.out.println("Jio is also 5G network");
	}
}
class Mobiles{
	public void call(Sim sim) {
		System.out.println("Call Connected");
		if(sim!=null) {
			sim.callConnect();		
			}
		 else{
			System.out.println("No sim card Provided");
		}
	}
}
public class LooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles mobile  = new Mobiles();
		Sim airtel = new Airtel();
		Sim jio = new Jio();
		mobile.call(airtel);
		mobile.call(jio);
		mobile.call(jio);
	}

}
