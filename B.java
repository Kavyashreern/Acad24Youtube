public class B{
    public static void main(String[] args){
        A a = new A(1, 2);
        System.out.println(a.x);
        int z= a.x + a.y;
        System.out.println(z);
        C c = new C(3, 4);
        System.out.println("Sum of c1 and c2 is: " + c.sum());
        System.out.println("Product of c1 and c2 is: " + c.product());
        System.out.println("Is c1 greater than c2? " + c.isGreater());

    }
}