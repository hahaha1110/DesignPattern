package ch01.ex01.duck;

public class MallardDuck extends Duck{

	public MallardDuck() { // MallardDuck은 Duck 클래스에스 quackBehavior와 vlyBehavior 인스턴스 변수를 상속받는다.
		quackBehavior = new Quack();
		flyBehavior = new FlyawithWings();
	}
	
	@Override
	public void display() {
		System.out.println("저는 물오리 입니다.");
	}
}
