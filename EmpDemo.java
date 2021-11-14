/*Prog 3 : write a java Program to define a class, define instance method for
 setting and retriving value of instance variable and instantiate its object */



import java.lang.*;
class Emp
{
	String name;
	int id;
	String address;
	void getdata(String name,int id,String address){
		this.name=name;
		this.id=id;
		this.address=address;
		}
		
	void putdata(){
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("address : " + address);	
		}
 }
 
 class EmpDemo{
   public static void main(String[] args){
       Emp e=new Emp();
       e.getdata("Vivek",15626,"Mumbai");
       e.putdata();
       }
   }