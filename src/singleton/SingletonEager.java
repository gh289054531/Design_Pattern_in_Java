package singleton;

/**
 * 饿汉式单实例
 * 
 * @author root
 * 
 */
public class SingletonEager {
	// 必须是private、static，private限制只能由getInstance()方法获取单实例，static表示不需要类实例化
	// 这里已经保证了线程安全
	private static SingletonEager uniqueInstance = new SingletonEager();

	// 这里覆盖了public的构造方法，使得无法通过构造函数创建实例
	private SingletonEager() {
	}

	// 这里不需要同步了，因为类是在static代码中创建实例
	public static SingletonEager getInstance() {
		return uniqueInstance;
	}

	// 其他方法

}
