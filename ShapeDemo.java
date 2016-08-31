
public class Shape {
	protected String color="Red";
	protected boolean filled;
	Shape(){
		
	}
	Shape(String color,boolean filled){
		
	}
	String getColor(){
		return color;
	}
	void setColor(String color){
		
	}
	boolean isFilled(){
		boolean res = false;
		return res;
	}
	double getArea(){
		return 0;
		
	}
	double getPerimeter(){
		return 0;
		
	}
	public String toString(){
		return null;
	}
}

public class Rectangle extends Shape{
	protected double width=50;
	protected double lenght=50;
	Rectangle(){
		
	}
	Rectangle(double width,double lenght){
		
	}
	Rectangle(double width,double lenght,String color,boolean filled){
		
	}
	double getWidth(){
		return width;
	}
	void setwidth(String width){
		
	}
	double getLength(){
		return lenght;
	}
	void setLength(String lenght){
		
	}
	double getArea(){
		return 0;
		
	}
	double getPerimeter(){
		return 0;
		
	}
	public String toString(){
		return null;
	}

}

public class Circle extends Shape{
	protected double radius;
	Circle(){
		
	}
	Circle(double radius){
		
	}
	Circle(double radius,String color,boolean filled){
		
	}
	double getRadius(){
		return radius;
	}
	void setRadius(double radius){
		
	}
	double getArea(){
		return 0;
		
	}
	double getPerimeter(){
		return 0;
		
	}
	public String toString(){
		return null;
	}
}

public class Square extends Shape{
	Square(){
		
	}
	Square(double side){
		
	}
	Square(double side,String color,boolean filled){
		
	}
	double getSide(){
		return 0;

	}
	void setSide(String side){
		
	}
	void setWidth(double side){
		
	}
	void setLength(double side){
		
	}
	public String toString(){
		return null;
	}

}

class ShapeDemo
{
	public static void main(String args[])
	{
	Shape s =new Shape();
Shape s1 =new Circle();
Shape s2 =new Rectangle();
Shape s3 =new Square();


	}
}