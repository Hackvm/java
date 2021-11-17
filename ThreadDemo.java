/* Name : Vivek Mishra
Roll No : 21
Branch : cyber security*/

import java.lang.Thread;
class A extends Thread{
    public void run(){
        System.out.println("Thraed A is started :");
        for(int i=0 ; i<=5 ;i++){
            System.out.println("\t From thred A : i="+i);
        }
        System.out.println("\nexit from thread A:");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("Thraed B is started :");
        for(int j=0 ; j<=5 ;j++){
            System.out.println("\t From thred B : i="+j);
        }
        System.out.println("\nexit from thread B:");
    }
}

class C extends Thread{
    public void run(){
        System.out.println("Thraed C is started :");
        for(int k=0 ; k<=5 ;k++){
            System.out.println("\t From thred C : i="+k);
        }
        System.out.println("\nexit from thread C:");
    }
}

class ThreadDemo{
    public static void main(String args[]){
        new A().start();
        new B().start();
        new C().start();
    }
}