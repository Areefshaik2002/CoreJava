package oops;
class Student{
	private String id;
	private String name;
	private String age;
	private int YOP;
	private long mobile_number;
	private String email;
	public void setId(String id) {
		this.id = id;
		}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
		}
	public void setYOP(int YOP) {
		this.YOP = YOP;
	}
	public void setMobile_number(long Mobile_number) {
		this.mobile_number = Mobile_number;
		}
	public void setEmail(String email){
		this.email=email;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public int getYOP() {
		return YOP;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public String getEmail() {
		return email;
	}
}
public class Encapsulation {
public static void main(String[] args) {
	Student s = new Student();
	s.setId("20BQ1A02C5");
	System.out.println(s.getId());
	s.setName("Areef");
	System.out.println(s.getName());
	s.setAge("21Years");
	System.out.println(s.getAge());
	s.setYOP(2024);
	System.out.println(s.getYOP());
	s.setMobile_number(9398479810L);
	System.out.println(s.getMobile_number());
	s.setEmail("Areefshaik2002@gmail.com");
	System.out.println(s.getEmail());
	
}
}
