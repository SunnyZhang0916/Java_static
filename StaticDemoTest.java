package Capital10;

/**
 * Test StaticDemoTwo
 * 使用单例模式
 * 单例模式就是不管用哪种方法，不管是什么时间点得到的对象，其实都是同一个对象
 *
 */
public class StaticDemoTest {
    public static void main(String[] args) {

        //报错： StaticDemoTwo() has private access. 所以下面会报错
        //StaticDemoTwo staticDemo = new StaticDemoTwo();

        //但是可以改为getInstance()即可
        StaticDemoTwo staticDemo1 = StaticDemoTwo.getInstance();

        System.out.println(staticDemo1.normal_number); //只能选择normal_number

        StaticDemoTwo staticDemo2 = StaticDemoTwo.getInstance();
        staticDemo2.normal_number = 1024;

        StaticDemoTwo staticDemo3 = StaticDemoTwo.getInstance();
        System.out.println(staticDemo3.normal_number);

        //测试是否是同一个对象. true即，恒等情况下是同一个对象
        System.out.println((staticDemo1 == staticDemo2));
    }
}
