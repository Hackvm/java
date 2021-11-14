/* Name : Vivek Mishra
   Roll No : 21
   Branch : Cyber Security*/
import java.lang.*;
class College
{
    College()
    {
        System.out.println("                 SAKEC                ");
    }
}

class Department extends College
{
    Department(){
        System.out.println("Department of Cyber Security");
    }
}

class Employe extends Department{
    int empID;
    String empName;
    Employe(int empID,String empName){
        this.empID=empID;
        this.empName=empName;
        System.out.println("Emp ID : " + empID);
        System.out.println("Emp Name : " + empName);
    }
}

class Student extends Department{
    int StdROll;
    String StdName;
    Student(int StdROll,String StdName){
        this.StdROll=StdROll;
        this.StdName=StdName;
        System.out.println("Stdunet Roll No : " + StdROll);
        System.out.println("Student name : "+ StdName);
    }
}

class InheristanceTypeDemo
{   
    public static void main(String args[]){
        System.out.println("\n---------------Single Inhertance-----------------\n");
        Department dp = new Department();

        System.out.println("\n---------------Multilevel Inheristanve--------------\n");
        Employe Ep = new Employe(203,"VijayKumar Dudhanikar");

        System.out.println("\n-------------------Hirerchayel Inheristance----------------\n");
        Student Sd = new Student(21,"Vivek Mishra");
    }

}
