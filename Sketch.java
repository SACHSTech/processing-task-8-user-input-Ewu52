import processing.core.PApplet;
import java.util.Random;
import processing.core.PImage;

public class Sketch extends PApplet {
  PImage imgGTO;


  public void settings() {
	// put your size call here
    size(1200, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    imgGTO = loadImage("gto vice principal.jpg");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
  }
  
  public void mouseMoved(){
    imgGTO.resize(300,300); 
    image(imgGTO, mouseX, mouseY);
  }

  public void keyPressed(){
    if (key == 32){
    Random rand = new Random();
    int upperbound = 256;
    int r = rand.nextInt(upperbound);
    int g = rand.nextInt(upperbound);
    int b = rand.nextInt(upperbound);
    background(r, g, b);
    }
  }

}