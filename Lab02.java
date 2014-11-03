/**
*
* Description of the program goes here  // provide a brief description
*
* @author <André Purits>  // replace <...> with your name
* @version <30/10/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {

     public static void main(String[] args) {
     Display.openWorld("maps/maze.map");
     Display.setSize(8, 8);
     Display.setSpeed(3);
     Athlete andre = new Athlete();
     andre.putBeeper();
     andre.move();
     andre.putBeeper();
     andre.turnRight();
     andre.move();
     andre.putBeeper();
     andre.turnRight();
     andre.move();
     andre.putBeeper();
     andre.turnLeft();
     andre.move();
     andre.putBeeper();
     andre.turnLeft();
     andre.move();
     andre.putBeeper();
     andre.turnRight();
     andre.move();
     andre.putBeeper();
     andre.move();
     andre.putBeeper();
     andre.turnRight();
     andre.move();
     andre.putBeeper();
     andre.turnLeft();
     andre.move();
     andre.putBeeper();
     andre.turnLeft();
     andre.move();
     andre.putBeeper();
     andre.move();
     andre.putBeeper();
     andre.move();
     andre.putBeeper();
     andre.move();
     andre.putBeeper();
     andre.turnRight();
     andre.move();
     andre.putBeeper();
     andre.move();
          
     }
}
