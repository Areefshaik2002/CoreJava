package practice;
class company{
	public void owns() {
		System.out.println("Company Assigns work to managers");
	}
}
class manager extends company{
	public void assigns() {
		System.out.println("managers assigns work to team leaders");
	}
}
class teamLead extends manager{
	public void leads() {
		System.out.println("team leaders leads the team members");
	}
}
class member extends teamLead{
	public void works() {
		System.out.println("team members gets their blood pressure High");
	}
}
public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member obj = new member();
		obj.owns();
		obj.assigns();
		obj.leads();
		obj.works();
	}

}
