/*Prog 4.a: Write a Program to define a class, define instance methods and
overload them and use them dynamic method invocation.*/

class MethodOverloading{
	void display(int a, int b){
		int c = a+b;
		System.out.println("The sum of 2 integer is: " + c );}
		
	void display(double a, double b){
		double  c = a+b;
		System.out.println("The sum of 2 floating number is: " + c);}
		
	void display(int a, int b , int c){
		int d = a+b+c;
		System.out.println("The sum of 3 integer number is: "+ d);}
		
	void display(int a, double b){
		double c =a+b;
		System.out.println("The sum of an integer with a  floting point number is: " + c);}
		
 }
 
 class MethodOverloadingDemo{
         public static void main (String[] args){
         	MethodOverloading m1 = new MethodOverloading();
         	m1.display(34,89);
         	m1.display(30.78,10.56);
         	m1.display(50,78,100);
         	m1.display(78,23.9876);
         	}
 }
 