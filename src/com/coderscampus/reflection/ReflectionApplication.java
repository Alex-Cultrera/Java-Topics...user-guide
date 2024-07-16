package com.coderscampus.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionApplication {
	
	PersonRepository personRepo = new PersonRepository();
	CatRepository catRepo = new CatRepository();
	CarRepository carRepo = new CarRepository();
	
	@Test
	public void reflection_test () {
		Person person = new Person();
		Cat cat = new Cat();
		Car car = new Car();
		person.setAge(18);
		person.setEyeColor("Brown");
		person.setName("Julie Smith");
		
		Method[] methods = person.getClass().getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		save(person, personRepo);
		save(cat, catRepo);
		save(car, carRepo);
	}
	
	public <T, R> void save (T obj, R repo) {
		Class<T> c = (Class<T>) obj.getClass();
		try {
			Method saveMethod = repo.getClass().getMethod("save", c);
			saveMethod.invoke(repo, obj);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.err.print("Oops there was an error getting the save method");
		}
	}
	
	public void save (Person person) {
//		 get a Repository and call the save method on the repo
		PersonRepository personRepository = new PersonRepository();
		personRepository.save(person);
	}
	public void save (Cat cat) {
//		 get a Repository and call the save method on the repo
		CatRepository catRepository = new CatRepository();
		catRepository.save(cat);
	}
	public void save (Car car) {
//		 get a Repository and call the save method on the repo
		CarRepository carRepository = new CarRepository();
		carRepository.save(car);
	}

}
