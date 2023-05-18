/**
 * 单例模式：（套路）
 * 只能创建一个唯一的实例
 */
public class SingleModel {
    //假如只要一个实例，那就应该是静态的. 即，用来指向唯一的奔类的实例
    private static SingleModel me = null;
    public int count = 0;

    //因为是单例，所以要把方法改为Private。这种做法和abstract是一样的
    private SingleModel(){
        count++;
    }

    //获得本类唯一的一个实例 -- 单例模式的核心方法
    public static SingleModel getInstance(){
        if(null == me)
            me = new SingleModel();

        return me;
    }

    /*
    public SingleModelDemo(){
        count++;
    }


    假如不是单例模式的例子
    public static void main(String[] args) {
        //每一次new都实例化一次，因此以下共有四个实例。单实例是只会有一个实例
        SingleModelDemo single1 = new SingleModelDemo();
        System.out.println(single1.count);
        SingleModelDemo single2 = new SingleModelDemo();
        System.out.println(single2.count);

        SingleModelDemo single3 = new SingleModelDemo();
        System.out.println(single3.count);

        SingleModelDemo single4 = new SingleModelDemo();
        System.out.println(single4.count);



    }
     */
}
