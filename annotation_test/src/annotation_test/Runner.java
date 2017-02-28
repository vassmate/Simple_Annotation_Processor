package annotation_test;

import hello_annotation.procerssor.HelloProcessor;

public class Runner {

	public static void main(String[] args) {
		HelloProcessor<HelloTest> hProcessor = new HelloProcessor<HelloTest>(HelloTest.class);
		HelloTest hTest1 = new HelloTest(hProcessor.getHelloString());
		System.out.println(hTest1.sayHello());
	}

}
