package cn.leon.pattern.factory.simple;

/**
 * 简单工厂调用
 * （深夜食堂的美食之旅）
 * @author Leon
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        System.out.println("---------------抵达深夜食堂---------------");
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println("-----------------开始点餐-----------------");
        // 老板，来一份烤冷面（不需要自己做烤冷面了）
        System.out.println("烤冷面：" + simpleFactory.getDelicious("BakedRaengmyeon"));
        // 老板，来一份蛋堡（不需要自己做蛋堡了）
        System.out.println("蛋堡：" + simpleFactory.getDelicious("EggBurger"));
        System.out.println("---------------吃饱喝足走人---------------");
    }
}
