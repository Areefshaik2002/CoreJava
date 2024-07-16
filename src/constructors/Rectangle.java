package constructors;
public class Rectangle{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public  int Area(int length, int breadth){
        int Area=length * breadth;
      return Area;
    }
    public  int Perimeter(int length, int breadth){
        int Perimeter = 2*(length+breadth);
        return Perimeter;
}
	public static void main(String[] args) {
	    Rectangle rectangle  = new Rectangle(2, 3);
	   int a=rectangle.Area(rectangle.length, rectangle.breadth);
	   System.out.println("the Area of the rectangle is "+a);
	   int p=rectangle.Perimeter(rectangle.length, rectangle.breadth);
	   System.out.println("the perimeter of the rectangle is "+p);
	}
}