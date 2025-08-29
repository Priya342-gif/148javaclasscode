abstract class college{
    abstract void register();//error dega agr agr abstract ni huye class agr method h abstract toh classs k abstract hona jruri hai
    abstract void Infrastructure();
    abstract void students();
    abstract void staff();//mnandatpry hai
    void medicalfacilty(){
        System.out.println("mdeical facilities are optional");//yh concrete method h compulsory ni h

    }
}
    class iit extends college//agr abstract method ko overirde ni krenge  toh error ayega 
{
    void register(){
        System.out.println("iit is registered with aktu");
    }
    void Infrastructure(){
        System.out.println("iit has digital classroom");
    }
    void students(){
        System.out.println("students must passed jee to take admission");
    }
    void staff(){
        System.out.println("num of staff in iit is 50");
    }
    void medicalfacilty(){
        System.out.println("iit has well developed medical facilities");
    }

//      abstract class iitian extends college//agr abstract method ko overirde ni krenge  toh error ayega 
// {
//     void register(){
//         System.out.println("iit is registered with aktu");
//     }
//     void Infrastructure(){
//         System.out.println("iit has digital classroom");
//     }
//     void students(){
//         System.out.println("students must passed jee to take admission");
//     }
   
//     void medicalfacilty(){
//         System.out.println("iit has well developed medical facilities");
//     }
// }


}





public class abstractexmaple {
    public static void main(String[] args) {
    college cg;
    cg=new iit();
    cg.Infrastructure();
    cg.staff();
    cg.students();
    cg.medicalfacilty();
    cg.register();

}
}


