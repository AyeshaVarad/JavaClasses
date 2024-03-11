package Day2;

import java.awt.desktop.SystemEventListener;

public class Methods {
//Main method
    public static void main(String[] args){

        Methods calculator = new Methods();//Class Object
        calculator.addNumbers(10,20);   //dot is a assigning operators
        calculator.addNumbers(-20, 10);
        calculator.subNumbers(12, 6);
    }

//    reusable method
    public void addNumbers(int x, int y){

        int sum = x+y;
        System.out.println("Sum :" + sum);
    }

    public void subNumbers(int x, int y){
        int sub=x-y;
        System.out.println("Sub:"+sub);
    }

}
