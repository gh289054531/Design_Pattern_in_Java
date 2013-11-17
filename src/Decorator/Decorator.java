package Decorator;

interface Work {
	public void paint();
}

class Son implements Work {
	public void paint() {
		System.out.println("儿子用铅笔画好了一幅画。");
	}
}

class Mother implements Work {
	// 被装饰者
	private Work work;

	public Mother(Work work) {
		this.work = work;
	}

	private Mother() {
	}

	public void paint() {
		System.out.println("妈妈正在做给画上颜色前的准备工作。");
		work.paint();
		System.out.println("妈妈给画上好了颜色。");
	}
}

class Father implements Work {
	// 被装饰者
	private Work work;

	public Father(Work work) {
		this.work = work;
	}

	private Father() {
	}

	public void paint() {
		System.out.println("爸爸正在做上画框前的准备工作。");
		work.paint();
		System.out.println("爸爸给画装好了一个画框。");
	}
}

public class Decorator {
	public static void main(String[] args) {
		// 只画铅笔画
		Work work = new Son();
		work.paint();
		System.out.println("\n");

		// 除了画铅笔画，还要给画上颜色
		work = new Mother(work);
		work.paint();
		System.out.println("\n");

		// 除了画铅笔画，给画上颜色，还要给画上画框
		work = new Father(work);
		work.paint();
	}
}
