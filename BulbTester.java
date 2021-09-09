
public class BulbTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bulb Mode = new Bulb();
    
    Mode.lightSwitch(false);
    Mode.isActive();
    Mode.getColor();
    Mode.brightness(5);
    Mode.setColor("red");
    Mode.getColor();
    
	}

}
