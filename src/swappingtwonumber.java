public class swappingtwonumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before swapping");
        System.out.println("a="+a);
        System.out.println("a="+b);
        //swappng without third variable
        a=a+b;
        b=a-b;
        a=a-b;


    }

}
