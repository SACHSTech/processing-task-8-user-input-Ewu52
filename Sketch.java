import processing.core.PApplet;
import java.util.Random;
import processing.core.PImage;

public class Sketch extends PApplet {
  PImage imgGTO;
  PImage imgSupaHotFire;

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;
  float imgX = 600;
  float imgY = 400;

  public void settings() {
	// put your size call here
    size(1200, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
    imgGTO = loadImage("gto vice principal.jpg");
    imgSupaHotFire = loadImage("supa hot fire.jpg");
  }

  /**
   * Moves imgSupaHotFire based on if the arrow keys are pressed.
   */
  public void draw() {
    if (upPressed){
      imgY -= 20;
    }
    if (downPressed){
      imgY += 20;
    }
    if (leftPressed){
      imgX -= 20;
    }
    if (rightPressed){
      imgX += 20;
    }
    
    imgSupaHotFire.resize(100,100);
    image(imgSupaHotFire, imgX, imgY);
  }
  
  // Repeatedly prints out funny picture when dragging mouse
  public void mouseMoved(){
    imgGTO.resize(300,300); 
    image(imgGTO, mouseX, mouseY);
  }

  // 1. Changes background to random colour when pressing the space bar. Note: EPILEPSY WARNING FOR IF YOU HOLD DOWN THE SPACE BAR!!!!!
  // 2. Prints out rectangle at random position when pressing CTRL.
  // 3. Determines if the UP DOWN LEFT RIGHT buttons are being pressed, so that we can move imgSupaHotFire.
  // 4. Draws a grid when the user presses e.
  // 5. Randomly draws rectangles along x-axis when user presses q.
  // 6. Randomly draws rectangles along y-axs when user presses SHIFT.
  public void keyPressed(){
    if (key == 32){
    Random rand = new Random();
    int upperbound = 256;
    int r = rand.nextInt(upperbound);
    int g = rand.nextInt(upperbound);
    int b = rand.nextInt(upperbound);
    background(r, g, b);
    }

    if (keyCode == CONTROL){
      Random newRand = new Random();
      int newUpperbound = 1200;
      int newVariable = newRand.nextInt(newUpperbound);
      rect(newVariable, newVariable, 60, 20);
    }

    if (keyCode == UP){
      upPressed = true;
    }
    if (keyCode == DOWN){
      downPressed = true;
    }
    if (keyCode == LEFT){
      leftPressed = true;
    }
    if (keyCode == RIGHT){
      rightPressed = true;
    }

    if (key == 'e'){
      for(int rectX = 0; rectX <= 1200; rectX +=50){
        for(int rectY = 0; rectY <= 800; rectY += 50){
          fill(255, 193, 23);
          rect(rectX, rectY, 50, 50);
        }
      }
    }

    if (key == 'q'){
      Random newerRand = new Random();
      int newerUpperbound = 1200;
      int newerVariable = newerRand.nextInt(newerUpperbound);
      fill(255, 255, 255);
      rect(newerVariable, 200, 100, 50);
      rect(newerVariable, 400, 100, 50);
      rect(newerVariable, 600, 100, 50);
    }

    if(keyCode == SHIFT){
      Random newestRand = new Random();
      int newestUpperbound = 800;
      int newestVariable = newestRand.nextInt(newestUpperbound);
      fill(255, 255, 255);
      rect(200, newestVariable, 50, 100);
      rect(400, newestVariable, 50, 100);
      rect(600, newestVariable, 50, 100);
      rect(800, newestVariable, 50, 100);
      rect(1000, newestVariable, 50, 100);

    }
  }

  // Determines when the UP DOWN LEFT RIGHT keys are released so that imgSupaHotFire stops moving.
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }

  // Draws a line of random-coloured circles at a random y position
  public void mouseClicked(){
    Random rand1 = new Random();
    int upperbound1 = 256;
    int r1 = rand1.nextInt(upperbound1);
    int g1 = rand1.nextInt(upperbound1);
    int b1 = rand1.nextInt(upperbound1);
    
    Random rand2 = new Random();
    int upperbound2 = 801;
    int y = rand2.nextInt(upperbound2);

    for(int x = 0; x <= 1200; x += 50){
      fill(r1, g1, b1);
      ellipse(x, y, 50, 50);
    }
  }

  
  

}