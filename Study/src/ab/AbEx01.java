package ab;

abstract class Animal {
	
	// 추상 클래스도 필드값과 생성자를 가질 수 있다.
	private String name;
	private int age;
	
	public Animal() {
		System.out.println("동물입니다.");
	}
	
	abstract void sound();
	
	void eat() {
		System.out.println("먹는다.");
	} // 추상클래스도 일반 메서드를 가질 수 있다.
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("멍멍");
		
	}
	
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("야옹");
	}

	@Override
	void eat() {
		System.out.println("사료를 먹습니다.");
	}
	
}

public class AbEx01 {
	
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
	}
	
}
