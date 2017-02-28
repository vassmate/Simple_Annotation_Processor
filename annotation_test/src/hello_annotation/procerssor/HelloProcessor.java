package hello_annotation.procerssor;

import java.lang.annotation.Annotation;

import hello_annotation.HelloAnnotation;

public class HelloProcessor<T> {

	private Class<T> pClass;

	public HelloProcessor(Class<T> classToProcess) {
		pClass = classToProcess;
	}

	private String parseSelectedLang(String selectedLang) {
		if (selectedLang.equals("") || selectedLang.equals("HU")) {
			return "Hello világ!";
		} else if (selectedLang.equals("EN")) {
			return "Hello world!";
		} else if (selectedLang.equals("FR")) {
			return "Bonjour tout le monde!";
		}
		return "Not supported language!";
	}

	public String getHelloString() {
		try {
			Annotation[] annotations = pClass.getAnnotations();
			for (Annotation annotation : annotations) {
				if (annotation instanceof HelloAnnotation) {
					HelloAnnotation helloAnnotation = (HelloAnnotation) annotation;
					return parseSelectedLang(helloAnnotation.selectedLang());
				}
			}
			throw new Exception("Unsupported annotation!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
