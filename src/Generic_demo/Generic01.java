package Generic_demo;

public class Generic01 {
    public static <Dt extends Comparable<Dt>> Dt maximumOf(Dt a, Dt b,Dt c){
        Dt max = a;
        if(b.compareTo(max) > 0){
             max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34,54,76));
        System.out.println(maximumOf(3.4,5.4,7.6));
        System.out.println(maximumOf('a','z','b'));
    }
}
