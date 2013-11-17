package DynamicProxy;
import java.lang.reflect.Proxy;


/**
 * 动态代理演示
 * @author root
 *
 */
public class Client {
	public static void main(String[] args) {
		TargetInterface target = new Target();//针对接口编程
		MyHandler myHandler=new MyHandler(target);//通过构造器设置被代理的对象
		//myHandler.setObject(target); //也可以用setter方法设置被代理的对象
		TargetInterface proxy =(TargetInterface)Proxy.newProxyInstance(Target.class.getClassLoader(), Target.class.getInterfaces(), myHandler);//代理对象
		proxy.doSomeThing();
	}
}
