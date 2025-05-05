package Lift;

public class LiftServiceImpl implements LiftService {

	@Override
	public void move(Lift lift, int position) {
		
		if(position > lift.getPosition()) {
			System.out.println("\nLift Starting from the floor: " + lift.getPosition());
			for(int i=lift.getPosition();i<=position;i++) {
				System.out.println("👆 Floor:" + i);
			}
		}
		else if(position < lift.getPosition()) {
			System.out.println("\nLift Starting from the floor: " + lift.getPosition());
			for(int i=lift.getPosition()-1;i>=position;i--) {
				System.out.println("👇 Floor:" + i);
			}
		}
		else {
			System.out.println("Alredy in the floor 🤚");
		}
		
		lift.setLastPosition(lift.getPosition());
		lift.setPosition(position);
		
		System.out.println("Lift reached floor " + lift.getPosition());
	}

	@Override
	public void move(Lift lift) {
		lift.setPosition(0);
	}
}
