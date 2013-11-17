package singleton;

import java.util.HashMap;

/**
 * 登记式单例类是为了克服饿汉式单例类及懒汉式单例类均不可继承的缺点而设计的。 只是它的子类实例化的方式只能是懒汉式的， 这是无法改变的。
 * 登记式单例类的一个缺点:(1)由于子类必须允许父类以构造子调用产生实例，因此， 它的构造方法必须是公开的这样一来，就等于允许了以这样方式产生实例
 * 而不在父类的登记中。(2)由于父类的实例必须存在才可能有子类的实例， 这在有些情况下是一个浪费。这是登记式单例类的另一个缺点。
 * 
 * @author root
 * 
 */
public class RegSingleton {
	static private HashMap<String, RegSingleton> m_registry = new HashMap<String, RegSingleton>();
	static {
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}

	/**
	 * 保护的默认构造子，因为有子类存在所以它不能是private的
	 */
	protected RegSingleton() {
	}

	/**
	 * 静态工厂方法，返还此类惟一的实例
	 */
	static public RegSingleton getInstance(String name) {
		if (name == null) {
			name = RegSingleton.class.getName();
		}
		if (m_registry.get(name) == null) {
			try {
				m_registry.put(name, (RegSingleton) Class.forName(name).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return m_registry.get(name);
	}

	public String about() {
		return "Hello， I am RegSingleton.";
	}

	public static void main(String[] args) {
		RegSingleton parent = RegSingleton.getInstance(null);
		System.out.println(parent.about());
	}
}
