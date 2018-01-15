package demo001.demo001;

import org.junit.Test;

public class TestMavenFirst {
	@Test
	public void testSayHello() {
		MavenFirst first = new MavenFirst();
		String result = first.sayHello("zhangsan");
		System.out.println(result);
	}
}
