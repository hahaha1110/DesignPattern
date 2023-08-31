package ch01.ex01.fly;

public class FlyWithWins implements FlyBehavior{
	
	@Override
	public void fly() {
		System.out.println("날고 있어요!"); // 실제로 날 수 있는 오리들의 나는 행동을 구현한 클래스
	}
}
