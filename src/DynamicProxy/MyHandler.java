package DynamicProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理对象Proxy把事件处理委托给了InvocationHandler处理器来做
 * @author root
 *
 */
public class MyHandler implements InvocationHandler {
	Interceptor i = new Interceptor();
	private Object targetObject = null;

	public MyHandler(Object targetObject) {
		this.targetObject = targetObject;
	}

	public void setObject(Object targetObject) {
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		i.before();
		result = method.invoke(targetObject, args);
		i.after();
		return result;
	}
}
