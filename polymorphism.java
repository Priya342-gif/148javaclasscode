// class employepoly{
//     //this is code of overloading
//     String emp_name;
//     void details(){
//         System.out.println("Nam eof employee"+ emp_name);
//     }
//     void details(int salary){
//         System.out.println("salary of employee"  +"" +salary);
//     }
//     void details(String company){//string h isliye no error
//         System.out.println("institue"+company);
//     }
// }
// //methid overiding
// class faculty extends employepoly{
// //jisko override krne k liye sb same likhna hota h method etc bs km alg dedete
          
//           void details(){
            //run time k time cheejo ko call krta h yh
//               super.details();//means parent class b call hogi 
//         System.out.println("welcome faculties");
//     }
// //inheritance m child k object bnta h to call methods 
// }
// public class polymorphism {
//     //it allow us to perform a single action in diffferent way
//     //types
//     //compile time -(static or early binding)(overloading->with in same class and diff parameter)
//     //runtime->overriding(sb kuch same hona chahiye or extend hon chahiye)(dynamic or late binding)
//     //does not support operator overloading but method overloading
//     //already operator overdingin by using plus used in concate

// // Overloading = same name, different parameters (compile time).

// // Overriding = same name, same parameters, different class (runtime).
//     public static void main(String[] args) {
//         // employepoly emp=new employepoly();
//         // emp.emp_name="radha ju";
//         // emp.details();
//         // emp.details(1000);
//         // emp.details("kiet");
//         //method ko call krte time decide hota h kisko call krna h->isliye compile time h 
//         //order swap krne s bhi overlaoding hojata h



//         //overriding
//         faculty few=new faculty();
//         few.emp_name="radharadha";
//         few.details();

//     }

// }
 class employepoly{
    //this is code of overloading
    String emp_name;
    void details(){
        System.out.println("Nam eof employee " + emp_name);
    }
    void details(int salary){
        System.out.println("salary of employee " + salary);
    }
    void details(String company){//string h isliye no error
        System.out.println("institue " + company);
    }
}
//methid overiding
class faculty extends employepoly{
//jisko override krne k liye sb same likhna hota h method etc bs km alg dedete
          void details(){
        System.out.println("welcome faculties");
    }
//inheritance m child k object bnta h to call methods 
}
public class polymorphism {
    //it allow us to perform a single action in diffferent way
    //types
    //compile time -(static or early binding)(overloading->with in same class and diff parameter)
    //runtime->overriding(sb kuch same hona chahiye or extend hon chahiye)(dynamic or late binding)
    //does not support operator overloading but method overloading
    //already operator overdingin by using plus used in concate

// Overloading = same name, different parameters (compile time).

// Overriding = same name, same parameters, different class (runtime).
    public static void main(String[] args) {
        employepoly emp=new employepoly();
        emp.emp_name="radha ju";
        emp.details();
        emp.details(1000);
        emp.details("kiet");
        //method ko call krte time decide hota h kisko call krna h->isliye compile time h 
        //order swap krne s bhi overlaoding hojata h

        //overriding
        faculty few=new faculty();
        few.emp_name="radharadha";
        few.details();

    }

}

