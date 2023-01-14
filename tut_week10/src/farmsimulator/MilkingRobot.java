package farmsimulator;

public class MilkingRobot {
	
	private BulkTank tank;
	
	public MilkingRobot() {
		tank = null;
	}
	
	public BulkTank getBullBulkTank() {
		return this.tank;
	}
	
	public void setBulkTank(BulkTank tank) {
		this.tank = tank;
	}
	
	public void milk(Milkable milkable) {
		if(this.tank == null) {
			throw new IllegalStateException("No tank has been connected to the milking robot.");
		}
		this.tank.addToTank(milkable.milk());
	}
	
	
}
