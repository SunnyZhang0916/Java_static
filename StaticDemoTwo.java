package Capital10;

/**
 * 使用静态关键字实现了单例模式，只能获得某个类的唯一一个实例
 *
 * 单例模式一般用于网页游戏中的只能开一个窗口，既避免了双开
 *
 * https://www.youtube.com/watch?v=ZEBcVp1Kv2I&t=480s
 */
public class StaticDemoTwo {

    //设定 StaticDemoTwo 只能被实例化一次。当前时刻只能有一个对象
    private static StaticDemoTwo me = null;

    /**
     * 将构造方法私有，以便实现外部无法使用new进行实例化的效果
     */
    private StaticDemoTwo(){
        //将构造方法定义为私有的，即构造方法只能在内部定义
        me = this;
    }

    /**
     * 要获得当前类对象的实例，只能调用本方法
     * 不会在内部方法的时候使用，而是在类的外面
     * 要获得当前类对象的实例，只能调用本方法
     * @return
     */
    public static StaticDemoTwo getInstance(){
        if(me == null){  //当me为空的时候，就实例化一个对象。唯一的一次实例化
            me = new StaticDemoTwo();
        }
        return me;
    }

    public static int static_number = 1;
    public int normal_number = 1;

    public static void test(){
        static_number++;
    }
}
