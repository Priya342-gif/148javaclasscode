interface institute {

    

    //interface m by default public rhenge membber
    //interfacae fields are public ,static and final by default and method abstract and oublic hote hai 
    //interface k andr method by default abstract hote h
  
     void register();//error dega agr agr abstract ni huye class agr method h abstract toh classs k abstract hona jruri hai
     void Infrastructure();
     void students();
     void staff();//mnandatpry hai
    



static void staticconcrete(){
    System.out.println("static concrete method inside interface");
}
default void defcconcrte(){
    privateconcrete();
    System.out.println("default concrete methods insdie interface");
}
private void privateconcrete(){
    System.out.println("private method inside interface");
}
}



    class hello implements institute//abstract method ko overirde ni krenge  toh error ayega 
{
    public void register(){//public homge sb method at the time of overriding coz woh default  h or interface public hota h or hum iski visibilty ko reduce ni kr sktye gh
        System.out.println("iit is registered with aktu");
    }
    public void Infrastructure(){
        System.out.println("iit has digital classroom");
    }
    public void students(){
        System.out.println("students must passed jee to take admission");
    }
    public void staff(){
        System.out.println("num of staff in iit is 50");
    }
    public void medicalfacilty(){
        System.out.println("iit has well developed medical facilities");
    }

   
 } 

    public class interfaceExample{
 public static void main(String[] args) {
    
     // Interface reference
        institute cg = new hello();
        cg.Infrastructure();
        cg.staff();
        cg.students();
        cg.register();
         // static method call by interface name
        institute.staticconcrete();//will be called direclty without any obj
          // default method call by object reference
        cg.defcconcrte();
    }

}
//java 8 m :can have default and stattic methods with body
//java 9:can have private methods inside interface
//multiple inheritance classes k through allow ni h
//class inherit interface ->implements
//interface inherti interface->extends
//interfacae dont inherit class 
//multiple inheritance->multiple parents
//encapsulation->wrapping up of data under a single unit (Data ko wrap kia single unitor usko access krne ko pw lga ia hai)
//just like phone pay m pw 
//private bnao class ko iske liye 
//encapsultion achive krne k liye private access mdofier,getter and setter which should be public'
//setter is for stetting value and getting for getting the values getter m hum pw ki codn lga denge
