package ch01.ex01.fly;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("저는 못 날아요"); // 날 수 없는 오리들의 나는 행동을 구현한 클래스
	}
	
}
