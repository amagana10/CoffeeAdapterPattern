
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	private OldCoffeeMachine old;
	@Override
	public void chooseFirstSelection() {
		// TODO Auto-generated method stub
		old.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		// TODO Auto-generated method stub
		old.selectB();
	}
	
	
}
