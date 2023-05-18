public class SingleModelTest {
    public static void main(String[] args) {

        //SingleModel demo1 = new SingleModel();   无法实例化
        SingleModel single1 = SingleModel.getInstance();

        System.out.println(single1.count);

        single1.count++;
        System.out.println(single1.count);

        SingleModel single2 = SingleModel.getInstance();
        System.out.println(single2.count);   //single2 和 single1 是同一个实例

        System.out.println(single1 == single2);
    }
}
