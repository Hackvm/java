package PKG1;

public class StudentClass{
        int regist;
        String Name;
        public void getdata(int rg, String N){
            regist = rg;
            Name = N;
        } 

        public void putdata(){
           System.out.println("Name = " + Name);
           System.out.println("Registration Number = " + regist);
        }



}

