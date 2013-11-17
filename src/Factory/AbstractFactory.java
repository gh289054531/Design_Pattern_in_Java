package Factory;

/*
 * 在抽象工厂模式中，抽象产品 (AbstractProduct) 可能是一个或多个，从而构成一个或多个产品族(Product Family)。 在只有一个产品族的情况下，抽象工厂模式实际上退化到工厂方法模式。
 * 抽象工厂模式与工厂方法模式的最大区别就在于，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则需要面对多个产品等级结构。
 * 在学习抽象工厂具体实例之前，应该明白两个重要的概念：产品族和产品等级。
 * 所谓产品族，是指位于不同产品等级结构中，功能相关联的产品组成的家族。比如AMD的主板、芯片组、CPU组成一个家族，Intel的主板、芯片组、CPU组成一个家族。
 * 而这两个家族都来自于三个产品等级：主板、芯片组、CPU。
 * 在本例子中，有两个产品等级：Car和Ship，产品族也有2个：Factory1由Benz和BigShip组成，Factory2由Bmw和SmallShip组成。
 */
interface Ship {
	public void driveShip();
}

class BigShip implements Ship {
	@Override
	public void driveShip() {
		System.out.println("drive bigship");
	}
}

class SmallShip implements Ship {
	@Override
	public void driveShip() {
		System.out.println("drive smallship");
	}
}

public abstract class AbstractFactory {
	public abstract Car getCar();

	public abstract Ship getShip();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Factory1 extends AbstractFactory {
	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

	@Override
	public Ship getShip() {
		// TODO Auto-generated method stub
		return new BigShip();
	}
}

class Factory2 extends AbstractFactory {
	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

	@Override
	public Ship getShip() {
		// TODO Auto-generated method stub
		return new SmallShip();
	}
}
