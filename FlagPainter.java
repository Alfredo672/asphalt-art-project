import org.code.neighborhood.Painter;

public class FlagPainter extends PainterPlus{

  
// This paints the squares
  public void paintSquare(String color){
    paintLine(color);
    paintLine(color);
    paintLine(color);   
    paintLine(color);
    move();
    turnRight();
    move();
    turnLeft();
    // Paints a row white,blue,white,blue
    paintWhiteDottedLine(color);
    nextRow(); 
    // Paints a row blue, white,blue, white 
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
    paintColorDottedLine(color);
    nextRow();
    paintWhiteDottedLine(color);
    nextRow();
  }
// This makes it that it paints a whole line one color
  public void paintLine(String color) {
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnRight();
    
    
  }

  public void paintWhiteDottedLine(String color) {
    paint("white");
    move();
    paint(color);
    move();
    paint("white");
    move();
    paint(color);
    move();
    paint("white");
    
  }
  public void paintColorDottedLine(String color) {
    paint(color);
    move();
    paint("white");
    move();
    paint(color);
    move();
    paint("white");
    move();
    paint(color);
  }
  
  public void nextRow() {
    if(isFacingEast()) {
       turnRight();
       move();
       turnRight();
     } else {
      turnLeft();
      move();
      turnLeft();
    }
   }  
 }