package Factory;

/*
 * 工厂方法模式
 * 抽象工厂角色：这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。 
 * 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。在java中它由具体的类来实现。 
 * 抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。 
 * 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。 
 */

interface Driver {
	public Car driverCar();
}

class BenzDriver implements Driver {
	public Car driverCar() {
		return new Benz();
	}
}

class BmwDriver implements Driver {
	public Car driverCar() {
		return new Bmw();
	}
}

public class FactoryMethod {
	public static void main(String[] args) {
		try {
			Driver driver = new BenzDriver();
			Car car = driver.driverCar();
			car.drive();
		} catch (Exception e) {
		}
	}
}