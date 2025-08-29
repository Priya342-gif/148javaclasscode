import java.util.Scanner;

class EmployeeEncap{//setter getter dono ek hi class m bnega
    private int Acc_bal;//data hinding
    private int upi=211122;

    public void setbalance (int balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("to know balance enter pin");
        int pin=sc.nextInt();
        if(pin==upi){
           Acc_bal=balance;
           System.out.println("congratulation salary is credited");
        }else{
            System.out.println("salary not credited");
        }
  
}

public int getbalance(){
    Scanner sc=new Scanner(System.in);
    System.out.println("to know balance please enter upi pin");
    int pin=sc.nextInt();
    if(pin==upi){
        System.out.println("availaible balnce "+Acc_bal);
        return Acc_bal;
    }else{
        System.out.println("wrong pin:unable to fetch balance");
    }
    return -1;
}
}

public class encapsulation {
    public static void main(String[] args) {21
        EmployeeEncap eeee=new EmployeeEncap();
        eeee.setbalance(1000);
        eeee.getbalance();
    }
}
//salary credit krane k liye b enter pin
//get k bd account balance k liye b enter pin