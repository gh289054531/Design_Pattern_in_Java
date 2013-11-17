package singleton;

public class RegSingletonChild extends RegSingleton {
	/**
	 * 因为它的父类需要调用它，所以这里必须是public，这也就意味着也可以用这个方法生成实例，这是个隐患
	 */
	public RegSingletonChild() {
	}

	/**
	 * 静态工厂方法
	 */
	static public RegSingletonChild getInstance() {
		return (RegSingletonChild) RegSingleton.getInstance(RegSingletonChild.class.getName());
	}

	public String about() {
		return "Hello， I am RegSingletonChild.";
	}

	public static void main(String[] args) {
		RegSingletonChild child = RegSingletonChild.getInstance();
		System.out.println(child.about());
	}
}