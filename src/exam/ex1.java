package exam;

public class ex1 {
	 public static void main(String[] args) {
	        
	        Fan fanController = new Fan();
	        System.out.println(fanController.askSpeed());
	        System.out.println(fanController.askDirection());
	        fanController.speedLevelUp();
	        fanController.speedLevelUp();
	        fanController.speedLevelUp();
	        fanController.speedLevelUp();
	        fanController.reverseDirection();
	        System.out.println(fanController.askSpeed());
	        System.out.println(fanController.askDirection());
	        
	        fanController.toString();
	    }
	}

	enum DIRECTION { FORWARD, REVERSE }

	class Fan
	{
	    
	    public final int OFF = 0;
	    private int CurrentSpeed = OFF;
	    private DIRECTION direction = DIRECTION.FORWARD;
	    
	    
	    public int askSpeed() {
			return CurrentSpeed;
		}

		public DIRECTION askDirection() {
			return direction;
		}

		public void speedLevelUp() {
			if(CurrentSpeed == 3)
			{
			    CurrentSpeed = OFF;
			}
			else
			{
			    CurrentSpeed++;
			}
		}

		public void reverseDirection() {
			direction = (direction == DIRECTION.REVERSE) ? DIRECTION.FORWARD : DIRECTION.REVERSE;
		}
		
		@Override
		public String toString() {
			return "Current fan direction is "+ direction  + " with speed " + CurrentSpeed;
		}
}
