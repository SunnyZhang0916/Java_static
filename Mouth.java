package AbstractDemo;

/**
 * 无法去直接使用接口的方法，所以需要找个类来实现这个接口
 */
public class Mouth implements Eat, Eat1 {
    public String test() {
        return null;
    }

    public void eating1() {

    }

    @Override
    public void eating2() {
        Eat1.super.eating2();
    }


    //只有default的方法，才不会被强制实现
}
