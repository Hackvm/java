//import java.*;
/* Name : Vivek Mishra
   Roll No : 21
   Branch : Cyber Security*/

interface Citizen{
    String name="vivek";
    abstract void showCitizen();

}

interface Employe{
    int emp =21;
    int Salary = 50000;
    abstract void showEmploye();
}

class Professer implements Citizen,Employe
{
    int Publication=100;
    public void showCitizen(){
        System.out.println("Name : "+ name);
    }

    public void showEmploye(){
        System.out.println("Employe number : "+ emp+"\nEmploy Salary : "+ Salary);
    }

    public void showProfesser(){
        System.out.println("Publication : "+ Publication);
    }
}

class MultiInheristanceDemo{
    public static void main(String args[])
    {
    Professer p = new Professer();
    p.showCitizen();
    p.showEmploye();
    p.showProfesser();
    }
}