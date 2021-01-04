package lambda;

public class Lambda2 {

    public static void main(String[] args) {

        Foo foo = ()->{
            System.out.println("this is gretting");
        };

        foo.greeting();

        Bar bar = (value)->{
            System.out.printf("bar(%d)\n",value);
        };

        bar.fahren(66);
        bar.gehen();
    }
}
