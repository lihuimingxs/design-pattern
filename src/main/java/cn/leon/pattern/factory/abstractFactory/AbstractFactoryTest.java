package cn.leon.pattern.factory.abstractFactory;

/**
 * 抽象工厂调用
 * （五星级的深夜食堂的饕餮之旅）
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("-------------深夜食堂美食窗口-------------");
        FoodFactory foodFactory = new FoodFactory();
        System.out.println("----------------来份烤冷面----------------");
        // 来一份烤冷面（不用等老板上菜了，在美食窗口自取就可以了）
        System.out.println("烤冷面：" + foodFactory.getBakedRaengmyeon());
        System.out.println("-----------------来份蛋堡-----------------");
        // 来一份蛋堡（不用等老板上菜了，在美食窗口自取就可以了）
        System.out.println("蛋堡：" + foodFactory.getEggBurger());
        System.out.println("---------------吃饱喝足走人---------------");
    }
}
