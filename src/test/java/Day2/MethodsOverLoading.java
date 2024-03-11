package Day2;

public class MethodsOverLoading {

    public static void main(String[] args){
        MethodsOverLoading caluculating= new MethodsOverLoading();
        caluculating.addNumbers(1,5);
        caluculating.addNumbers(23.54f, 20); //if decimal number using means should use 'f' letter
        caluculating.addNumbers(10,11,12);

    }

//    Method Overloading - More than one method having same Name but different Parameters.
    public void addNumbers(int a, int b){
        int sum = a+b;
        System.out.println("Sum:"+ sum);

    }
    public void addNumbers(float a, float b){
        float sum = a+b;
        System.out.println("Sum:"+ sum);

    }
    public void addNumbers(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Sum:"+ sum);

    }
}
