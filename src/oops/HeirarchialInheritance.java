package oops;
class Bank{
	   String name;
	   public Bank(String name) {
		   this.name=name;
	   }
	   public void displayBankDetails(String name) {
		   System.out.println("Bankname"+name);
	   }
	   public void intrestrate() {
		   System.out.println("Interest rate");
	   }
}
class StateBank extends Bank{
	   public StateBank(String name) {
		  super("Statebank");
	   }
	   @Override
	   public void displayBankDetails(String name) {
		   System.out.println("Bank"+name);
	   }
	   @Override
	   public void intrestrate() {
		   System.out.println("Statebank gives 5% intrest");
	   }
	   public void service() {
		   System.out.println(name+" provide Services");
		   
	   }
	   
	   
	   
}
class HDFC extends Bank{
	   public HDFC(String name) {
		super(name);
	}
	   @Override
	   public void displayBankDetails(String name) {
		   System.out.println("HDFC bank");
	   }
	   @Override
	   public void intrestrate() {
		   System.out.println("HDFC bank gives 6% intrest rate");
	   }
	   public void service() {
		   System.out.println("HDFC gives Services");
	   }

	   
}
public class HeirarchialInheritance {

	public static void main(String[] args) {
		StateBank s=new StateBank("State");
		s.displayBankDetails("State");
		s.intrestrate();
		s.service();
		HDFC h=new HDFC(null);
		h.displayBankDetails("HDFC");
		h.intrestrate();
		h.service();
		
	}

}
