package ch01.ex01.fly;

public class FlyRocketPowerd implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("로켓 추진으로 날아갑니다.");
	}
}
