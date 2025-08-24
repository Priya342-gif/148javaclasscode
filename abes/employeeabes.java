package abes;
import kiwt.*;//for importing all class of package we use *
//import package name class name ;//for importing particular class
public class employeeabes extends employeekiet {//agr koi class dusri class ko inherit kr rhi h toh ab hume abject bnane ki need ni h hum child class k obj s usko access kr skte hai
    // public static void main(String[] args) {
    //     employeekiet son=new employeekiet();
    //     son.em_name="hari";
    //     son.em_id=190;
    //     son.salary=200000;
    //     son.Organisation="abes grp";
    // }
    public static void main(String[] args) {
        employeeabes son=new employeeabes();
        son.em_name="hari";
        son.em_id=190;//protected hai isliye error ana bnd hogya coz humne child class ko extend kr loa hai isliye humorotected ko acesskr skte hai
        son.salary=200000;
        son.Organisation="abes grp";
    }
}
