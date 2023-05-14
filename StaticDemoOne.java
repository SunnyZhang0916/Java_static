package Capital10;

/**
 * 静态 - 指的是生命周期
 * 静态属性和方法是先于类的实例存在的。也就是说在还没有实例化的时候，就已经有static_number了
 *
 * 假如方法是静态的话，意思是静态方法只能调用静态属性和静态方法（即属性必须是static才能用在static方法里面
 */
public class StaticDemoOne {

    //static时的类属性
    public static int static_number = 1;
    //全新的变量
    public int normal_number = 1;

    public void test(){
        static_number++;
        normal_number++;
    }


    public static void main(String[] args) {
        StaticDemoOne staticDemo1 = new StaticDemoOne();
        staticDemo1.test();

        System.out.println(StaticDemoOne.static_number);
        System.out.println(staticDemo1.normal_number);

        StaticDemoOne staticDemo2 = new StaticDemoOne();
        staticDemo2.test();

        System.out.println(StaticDemoOne.static_number);
        System.out.println(staticDemo2.normal_number);

        staticDemo2.test();

        System.out.println(static_number);
        System.out.println(staticDemo1.normal_number);
    }
}
