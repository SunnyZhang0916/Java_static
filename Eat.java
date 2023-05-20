package AbstractDemo;

/**
 * Interface 里面的成员变量是已经默认为static final
 *
 * 也不可以定义静态的方法
 */
public interface Eat {
    public String name = "接口定义的数据域";

    //public static void test(); 不可以定义静态的方法。这是因为static是已经实现好的，而接口是不能实现的

    public String test();  //这个方法其实默认的就是 public abstract String test

    public void eating1();   //只能定义，不能实现，但改成default即可，如：
    default public void eating2(){              //无法去直接使用接口的方法，所以需要找个类来实现这个接口
        System.out.println("Eat接口的默认实现");
    }
}

interface Eat1{
    default public void eating2(){
        System.out.println("Eat1接口的默认实现");
    }
}
