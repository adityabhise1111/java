public class StringExample{
    public static void main(String[]  args){
        String s= "Aditya panduran bhise";

        // in java strings are immutable
        //lets try 
        
        System.out.println( s.getClass().getName());
        System.out.println(s.charAt(0));
        //s.charAt(0)= "a"; 
        // This line will cause a compile-time error because strings are immutable in Java.
        System.out.println(s);

    }
}