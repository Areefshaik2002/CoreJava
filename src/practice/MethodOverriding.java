package practice;
class Signature{
	public void shot(){
		System.out.println("player defended");
	}
}
class ViratKohli extends Signature {
	public void shot() {
		System.out.println("virat kohli played a Cover drive");
	}
}
class RohitSharma extends ViratKohli {
	public void shot() {
		System.out.println("rohit sharma played a pull shot");
	}
}
class KL_Rahul extends RohitSharma{
	public void shot() {
		System.out.println("kl rahul played a Flick");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signature play = new Signature();
		ViratKohli virat  = new ViratKohli();
		RohitSharma rohit = new RohitSharma();
		KL_Rahul KL = new KL_Rahul();
		play.shot();
		virat.shot();
		rohit.shot();
		KL.shot();
		
	}

}
