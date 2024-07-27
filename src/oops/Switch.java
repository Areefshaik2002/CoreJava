package oops;

public interface Switch {
	abstract public void On();
	abstract public void Off();
	}
class Fan implements Switch{
	@Override
	public void On() {
		System.out.println("Fan ON");
	}
	@Override
	public void Off() {
		System.out.println("Fan OFF");
	}
}
class Bulb implements Switch{
	@Override
	public void On() {
		System.out.println("Bulb ON");
	}
	@Override
	public void Off() {
		System.out.println("Bulb OFF");
	}
}