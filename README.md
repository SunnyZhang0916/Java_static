# Java_static
静态 - 指的是生命周期

1. 静态属性和方法是先于类的实例存在的。也就是说在还没有实例化的时候，就已经有static_number了

2. 假如属性是static，如static_number，因为已经是先于类的实例存在了（即在new之前），因此是没办法再new一次的。如StaticDemo.static_number，而无法staticDemo1.static_number

3. StaticDemoOne.static_number 和 static_number 是一样的，

4. 假如方法是静态的话，意思是静态方法只能调用静态属性和静态方法（即属性必须是static才能用在static方法里面。

5. private int normal_number 和 fiinal是一样的概念。

getInstance()
6. 使用静态关键字实现了单例模式，只能获得某个类的唯一一个实例。

7. 单例模式就是不管用哪种方法，不管是什么时间点得到的对象，其实都是同一个对象

接口 VS 抽象类
1. 类中可以定义成员变量，接口不允许存在成员变量

因为接口的成员是默认为final

2. 接口中所有方法都需要实现类去实现
