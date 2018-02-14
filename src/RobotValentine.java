import org.jointheleague.graphical.robot.Robot;

public class RobotValentine {
public static void main(String[] args) {
	Robot heart = new Robot();
	heart.moveTo(450, 450);
	heart.setWindowImage("images.jpg");
	heart.penDown();
	heart.setPenColor(255,255,255);
	heart.setSpeed(15);
	heart.hide();
	heart.setAngle(23);
	heart.move(280);
	for (int j = 0; j <2; j++) {
		
	
	heart.setAngle(0);
	 for (int i=0; i<180; i++) {
	heart.turn(-1);
	heart.move(1);

}
} 
heart.setAngle(157);
heart.move(280);
}}
