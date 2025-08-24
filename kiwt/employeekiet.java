package kiwt;


public class employeekiet {
   public String em_name;
   private int salary;
   protected int  em_id;
   String Organisation;
   void employeedetails(){
    System.out.println("details of kiet employee are "+"\n" + em_id+" "+em_name);

   }
   public static void main(String[] args) {
    employeekiet ek=new employeekiet();
    ek.em_name="krishna";
    ek.em_id=1;
    ek.salary=500000000;
    ek.Organisation="kiet grps";
    ek.employeedetails();
   } 
}
