package ch01.ex01.quack;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("삑~");
	}
}