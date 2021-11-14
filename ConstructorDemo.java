/* Prog 4.b Write a java Program to define a class,ddescribe its constructors,
overlad the constructors and instantiate its objects */

class Student
{
	String Name;
	String location;
	int postid;
	Student(){
		Name ="Harsh";
		location="Mumbai";
		postid = 421001;
		}
		
	Student(String Name,String location,int postid){
		this.Name=Name;
		this.location=location;
		this.postid = postid;
		}
		
	void Display(){
		System.out.println(Name +"\t" +location +"\t"+ postid);
		}
		
}

class ConstructorDemo{
  	public static void main(String[] args){
  		Student s1 = new Student();
  		System.out.println("\nDisplaying Fisrt Student Detail");
  		s1.Display();
  		Student s2 = new Student("Vivek","Mumbai",421003);
  		System.out.println("\nDisplaying Second Student Detail");
  		s2.Display();
  		}
  		
  	}
