package ApparentAndActualTypes;

public class WrittenAnswer {
    /*
    Does the accept method in D override the accept method in C? Explain your answer.

    No, it does not. This is because even though B is a child of A, C's accept method will accept an value that is of type A or one of its subclasses.
    Whereas, D's accept will only accept types of B or its subclasses.

     */

    public static class A {

    }

    public static class B extends A {

    }

    public static class C {

        public void accept(A a) {
            System.out.println("Accepted object of type A.");
        }

    }

    public static class D extends C {

        public void accept(B b) {
            System.out.println("Accepted object of type B.");
        }

    }

    public static void main(String[] args) {

        B b = new B();

        C c = new D();
        c.accept(b);

        D d = new D();
        d.accept(b);

    }

}

