import ch01.ex01.duck.Duck;
import ch01.ex01.duck.MallardDuck;
import ch01.ex01.duck.ModelDuck;
import ch01.ex01.fly.FlyRocketPowerd;
import ch01.ex01.quack.Squeak;

public class MinDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("----------");
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		
		System.out.println();
		
		model.setQuackBehavior(new Squeak());
		model.setFlyBehavior(new FlyRocketPowerd());
		model.performQuack();
		model.performFly();
		
	}
}
