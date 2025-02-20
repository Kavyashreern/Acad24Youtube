public class B{
    public static void main(String[] args){
        A a = new A(1, 2);
        System.out.println(a.x);
        int z= a.x + a.y;
        System.out.println(z);
    }
}