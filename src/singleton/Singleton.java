package singleton;

/**
 * 懒汉式单实例模式
 * 
 * @author root
 * 
 */
public class Singleton {
	// 必须是private、static，private限制只能由getInstance()方法获取单实例，static表示不需要类实例化
	private static Singleton uniqueInstance = null;

	// 这里覆盖了public的构造方法，使得无法通过构造函数创建实例
	private Singleton() {
	}

	// synchronized保证多线程安全
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// 其他方法
}
