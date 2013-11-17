package Observer;

public class Test {

	public static void main(String[] args) {
		Watched watched = new Watched();
		Watcher watcher1 = new Watcher(watched);
		Watcher watcher2 = new Watcher(watched);
		System.out.println(watcher1.data);
		System.out.println(watcher2.data);

		watched.changeData("changed");
		System.out.println(watcher1.data);
		System.out.println(watcher2.data);
	}
}
