package oops;
interface Phone1{
	abstract public void On();
	abstract public void Call();
}
interface CameraPhone1{
	abstract public void on();
	abstract public void TakePic();
	}
 class Iphone1 implements Phone1, CameraPhone1{
	@Override
	public void TakePic() {
		System.out.println("clicked picture");
	}
	
	@Override
	public void On() {
		System.out.println("phone On");
	}
	
	@Override
	public void Call() {
		System.out.println("phone Call");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone1 p;
		p = new Iphone1();
		p.Call();
		p.On();
		CameraPhone1 c = new Iphone1();
		c.on();
		c.TakePic();
	}

}
