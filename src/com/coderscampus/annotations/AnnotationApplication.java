package com.coderscampus.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Annotation;

public class AnnotationApplication {

	public static void main(String[] args) {
		
		AnnotationApplicationTest testClass = new AnnotationApplicationTest();
		Method[] methods = AnnotationApplicationTest.class.getMethods();

		int testPass=0;
		int testFailed=0;
		int testIgnored=0;
		for (Method method : methods) {
			MyTest myTest = method.getAnnotation(MyTest.class);
			
			if (myTest != null) {
				try {
					if (myTest.enabled()) {
						method.invoke(testClass);
						testPass++;
					} else {
						testIgnored++;
					}
				} catch (Exception e) {
					testFailed++;
				}
			}
				
		}
		System.out.println("Tests passed: " + testPass + ", tests failed: " + testFailed + ", tests ignored: " + testIgnored);
		
	}

}
