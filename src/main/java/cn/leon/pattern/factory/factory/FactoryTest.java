package cn.leon.pattern.factory.factory;

/**
 * 工厂类的调用
 * （台东步行街的美食之旅）
 * @author Leon
 */
public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("--------------抵达台东步行街--------------");
        System.out.println("--------------这里有家烤冷面--------------");
        Factory bakedRaengmyeonFactory = new BakedRaengmyeonFactory();
        // 老板，来一份烤冷面
        System.out.println("烤冷面：" + bakedRaengmyeonFactory.getDelicious());
        System.out.println("---------------这里有家蛋堡---------------");
        Factory eggBurgerFactory = new EggBurgerFactory();
        // 老板，来一份蛋堡
        System.out.println("蛋堡：" + eggBurgerFactory.getDelicious());
        System.out.println("---------------吃饱喝足走人---------------");
    }
}
