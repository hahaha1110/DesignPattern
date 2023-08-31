package ch01.ex01.duck;

import ch01.ex01.fly.FlyNoWay;
import ch01.ex01.quack.MuteQuack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("저는 모형 오리 입니다.");
	}

}
