
public class Light {

	// Variables that will be initialized in the Light constructors.	
	private boolean on;
	private boolean burntOut;
	private String color="";

	// Default constructor that sets the bulb to on, not burnt out, and "white".
	public Light() {
		this.on=true;
		 this.burntOut = false;
		 this.color = "white";
		/* missing code */
	}
 
	// This constructor sets the variable "on" to the parameter o. The burntOut
	// variable is set to the parameter b. If burntOut
	// is true, on is set to false, no matter what value is stored in o.
	// The color variable is set to the parameter c only if c is "red", "green"
	// or "blue". The constructor ignores the case of the value in c. If c holds
	// any value other than "red", "green" or "blue", the constructor sets
	// color to "white".
	
	public Light(boolean o, boolean b, String c) {
		this.on=o;
		this.burntOut=b;
		if(burntOut == true){
			this.on = false;
		}
		setColor(c);		
		/* missing code */
	}

	// The toString method returns a String with the Light in the format:
	// off red Burnt Out
	// on green not Burnt Out
	//
	// Notice there is one space between "off"/"on" and the value for color,
	// and a space before the "Burnt Out" or "not Burnt Out".
	public String toString() {
		/* missing code (don't forget to update the return statement) */
		String response="";
		if(this.on){
			response="on";
			setColor("green");
		}else{
			response="off";
			setColor("red");
		}
		response=response+" "+getColor();
		if(this.burntOut){
			response=response+" Burnt out";
		}else{
			response=response+" not Burnt out";
		}
		return response;
	}

	// This method changes the bulb from on to off, or visa versa. If the
	// burntOut variable is true, then the on variable may only be set to false.
	public void flip() {
		this.on=!this.on;
		if(this.burntOut == true){
			this.on = false;
		}
	}

	// The getColor method returns the color of the bulb.
	public String getColor() {
		/* missing code (don't forget to update the return statement) */
		return this.color;
	}

	// The setColor method sets the color of the Light. The color variable is
	// set to c only if c is "red", "green" or "blue". The method ignore the
	// case of the value in c. If c holds any value other than "red", "green"
	// or "blue", color will be set to "white".
	public void setColor(String c) {
		/* missing code */		
		if(c == "red"|| c== "green"|| c=="blue"){
			this.color=c;
		}else{
			this.color = "white";
		}
	}

	// The isOn method returns true if on, false otherwise.
	public boolean isOn() {
		/* missing code (don't forget to update the return statement) */
		return this.on;
	}

	// The burnOut method sets the variable burntOut to true.
	public void burnOut() {
		this.burntOut = true;
		/* missing code */
	}

	// The isBurntOut method returns true if the light is burnt out, false
	// otherwise.
	public boolean isBurntOut() {
		return this.burntOut;
		/* missing code (don't forget to update the return statement) */		
	}
}