package DynamicProxy;

/**
 * 实际对象
 * @author root
 *
 */
public class Target implements TargetInterface {
	
	public void doSomeThing()
	{
		System.out.println("do some thing!");
	}
}
