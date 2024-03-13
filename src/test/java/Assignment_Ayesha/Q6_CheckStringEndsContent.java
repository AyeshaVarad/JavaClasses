package Assignment_Ayesha;

public class Q6_CheckStringEndsContent {

    public static void main(String[] args){

        String name1="Ayesha";
        String name2="Madhuri";

        System.out.println(name1.endsWith("sha"));
        System.out.println(name2.endsWith("sha"));

        System.out.println(name2.startsWith("Ma"));
        System.out.println(name2.startsWith("sha"));

        System.out.println(name2.toLowerCase().contains("ma"));
        System.out.println(name1.toUpperCase().endsWith("SHA"));

    }
}
