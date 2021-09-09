
public class Bulb {
         private boolean isOn;
         private int lightLevel;
         private String color;
         
         public Bulb() {
        	 isOn = true;
        	 lightLevel=7;
        	 color = "White";
         }
        	
        public boolean lightSwitch(boolean x) {
        	return isOn = x;
        	
        }
        
        public void isActive() {
        	System.out.println( "The light is currently on is" +isOn);
        }
        
        public String setColor(String y) {
        	return color = y;
        }
        
        public void getColor() {
        	System.out.println("The current color is"+ color);
        	
        }
        public void brightness(int z) {
        	lightLevel= z;
        }
        
        public void Status() {
        	 System.out.println("The current color is"+ color+",brightness is"+ lightLevel+ " and the fact that the bulb is turned on is "+isOn);
        }
        
      public Bulb(int z, String y) {
    	  isOn = true;
      }
         
}
