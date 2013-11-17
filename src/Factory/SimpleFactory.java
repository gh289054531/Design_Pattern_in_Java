package Factory;

/*
 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑。在java中它往往由一个具体类实现。 
 抽象产品角色：它一般是具体产品继承的父类或者实现的接口。在java中由接口或者抽象类来实现。 
 具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现。 
 */

//抽象产品角色
interface Car {
	public void drive();
}

// 具体产品角色
class Benz implements Car {
	public void drive() {
		System.out.println("Driving Benz");
	}
}

// 具体产品角色
class Bmw implements Car {
	public void drive() {
		System.out.println("Driving Bmw");
	}
}

// 工厂类角色
public class SimpleFactory {
	// 工厂方法, 注意 返回类型为抽象产品角色
	public static Car driverCar(String s) throws Exception {
		if (s.equalsIgnoreCase("Benz")) {
			return new Benz();
		} else if (s.equalsIgnoreCase("Bmw")) {
			return new Bmw();
		} else {
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		try {
			Car car = SimpleFactory.driverCar("benz");
			car.drive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
