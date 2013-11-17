package singleton;

/**
 * 双检查式单实例，只能在JDK1.5之后版本使用 这种实现性能比较高
 * 
 * @author root
 * 
 */
public class SingletonDoubleCheckedLock {
	// 注意这里的volatile！
	private volatile static SingletonDoubleCheckedLock uniqueInstance;

	private SingletonDoubleCheckedLock() {
	}

	// 首先判断是否创建了实例，如果没有创建才对对象加锁并创建实例，所以性能提升
	public static SingletonDoubleCheckedLock getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonDoubleCheckedLock.class) {
				if (uniqueInstance == null) { // 这里还要在判断一次！
					uniqueInstance = new SingletonDoubleCheckedLock();
				}
			}
		}
		return uniqueInstance;
	}
}
