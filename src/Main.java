import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {


    //create a HashMap to get value for every character
    private static final  Map< Character, Integer>
            m = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);}};
    public static int romanToInt(String s) {
        //initial count and string length
        int sum = 0;
        int n = s.length();

        //iterate the String
        for (int i = 0; i <n ; i++) {
            // If present value is less than next value,
            // subtract present from next value and add the
            // resultant to the sum variable.

            // si indice no es igual que lo largo de String  y
            // si el valor tomado es menor que el siguiente valor
            if (i != n-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                //restale el segundo valor menos el valor anterior
                sum += m.get(s.charAt(i+1)) - m.get((s.charAt(i)));
                i++;
            }else{
                //sino suma ese valor a sum
                sum+= m.get(s.charAt(i));
            }

        }
        return sum;

    }


    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

}



