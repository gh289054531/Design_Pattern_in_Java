package DynamicProxy;

/**
 * 拦截器类，可以继承此类以构造不同的拦截系
 * @author root
 *
 */
public class Interceptor {
	public void before(){
		System.out.println("before!");
	}
	public void after(){
		System.out.println("after!");
	}
}
