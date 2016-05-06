/**
 * Created by dingyunxiang on 16/5/5.
 */
public class TestClass {

    public static void main(String[] args) {

        //当整型常量值在-128到127之间的时候，不会new新对象，而会调用常量池中的Integer的对象
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

//            System.out.println(f1 == f2);
//            System.out.println(f3 == f4);







    }


    class A{
        private int a;
    }

    class B extends A{
        int a;
    }


}
