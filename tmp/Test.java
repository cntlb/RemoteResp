package tmp;

/**
 * @author Linbing Tang
 * @since 2017-09-02
 */
public class Test {
    static {
        System.out.println("tmp.Test remote: static block");
    }

    public static void show(){
        System.out.println("tmp.Test remote: public static void show()");
    }

    public void method(){
        System.out.println("tmp.Test remote: public void method()");
    }
}
