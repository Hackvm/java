/*Name : Vivek Mishra
  Roll No : 21
  Branch : Cyber Security*/

import java.lang.String;
class stringbufferDemo{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("This is my college ");
        System.out.println("This string is sb " + sb);
        System.out.println("The length of the string sb is : " +sb.length());
        System.out.println("The Capacity of the string sb is : " + sb.capacity());
        System.out.println("The Caracteristic on the 6th position is : " + sb.charAt(6));
        sb.setCharAt(6,'v');
        System.out.println("After char v at position 6 is : " +sb);
        System.out.println("After Appending : " + sb.append(" in Mumbai"));
        System.out.println("After Inserting : " + sb.insert(19," SAKEC"));
        System.out.println("After Deleting : " + sb.delete(19,24));
    }
}