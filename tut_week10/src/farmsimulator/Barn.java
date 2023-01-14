package farmsimulator;

import java.util.Collection;

public class Barn {
	private BulkTank tank;
	private MilkingRobot robot;
	
	public Barn(BulkTank tank) {
		this.tank = tank;
		this.robot = null;
	}
	
	public BulkTank getBullBulkTank() {
		return this.tank;
	}
	
	public void installMilkingRobot(MilkingRobot robot) {
		this.robot = robot;
		this.robot.setBulkTank(this.tank);
	}
	
	public void takeCareOf(Cow cow) {
		
		if(this.robot == null) {
			throw new IllegalStateException();
		}
		this.robot.milk(cow);
	}
	
	public void takeCareOf(Collection<Cow> cows) {
		if(this.robot == null) {
			throw new IllegalStateException();
		}
		for(Cow c : cows) {
			this.robot.milk(c);
		}
	}
	
	@Override
	public String toString() {
		return this.tank.toString();
	}

}
