
public class Person {
	private String name="Muralidhar";
	private String address="Rajam,Srikakulam";
	void person(String name,String address){
		
	}
	String getname(){
		return name;
	}
	String getAddress(){
		return address;
	}
	void setAddress(String address){
		
	}
	public String toString(){
		String person = null;
		return person;
	}
}

public class Staff extends Person{
	private String school="GMRIT";
	private double pay=35000;
	Staff(String name,String address,String school,double pay){
		
	}
	String getSchool(){
		return school;
	}
	void setSchool(String school){
		
	}
	double getPay(){
		return pay;
	}
	void setPay(double pay){
		
	}
	public String toString(){
		String staff = null;
		return staff;
	}
}

public class Student extends Person{
	private String program="M.Tech";
	private int year=4;
	private double fee=120000;
	Student(String name,String address,String program,int year,double fee){
		
	}
	String getProgram(){
		return program;
	}
	void setProgram(String program){
		
	}
	int getYear(){
		return year;
	}
	void setYear(int year){
		
	}
	double getFee(){
		return year;
	}
	void setFee(double fee){
		
	}
	public String toString(){
		String student = null;
		return student;
	}
}

class PesonStudentStaffDemo
{
	public static void main(String args[])
	{
	Person p = new Person();
	Person p1=new Student();
	Person p2=new Staff();

	System.out.println("Student Details are"+p.getName()+" "+p.getAddress()+" "p1.school()+""+p1.pay() );
	}
}