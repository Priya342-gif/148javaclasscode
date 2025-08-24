package kiwt;

public class hrdept {
   public static void main(String[] args) {
     employeekiet ek=new employeekiet();
     ek.em_name="shiv";
     ek.em_id=123;
     ek.salary=2000;//coz private field ko access kr rhe h
     ek.Organisation="kiet grps";
     ek.employeedetails();
   } 
}
