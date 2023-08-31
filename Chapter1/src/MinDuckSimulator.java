import ch01.ex01.duck.Duck;
import ch01.ex01.duck.MallardDuck;

public class MinDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
	}
}
