# Java_static
静态 - 指的是生命周期

1. 静态属性和方法是先于类的实例存在的。也就是说在还没有实例化的时候，就已经有static_number了

2. 假如属性是static，如static_number，因为已经是先于类的实例存在了（即在new之前），因此是没办法再new一次的。如StaticDemo.static_number，而无法staticDemo1.static_number

3. 假如方法是静态的话，意思是静态方法只能调用静态属性和静态方法（即属性必须是static才能用在static方法里面。
