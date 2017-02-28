package annotation_test;

import hello_annotation.HelloAnnotation;

@HelloAnnotation(selectedLang = "FR")
public class HelloTest {
	
	private String hString;
	
	public HelloTest(String helloString) {
		hString = helloString;
	}
	
	public String sayHello() {
		return hString;
	}

}
