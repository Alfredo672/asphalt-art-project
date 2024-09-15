import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

 

  public void paintRow(String color) {
    while(canMove()) {
      if(!isOnPaint()) {
        paint(color);
      }
      move();
    }
    if(!isOnPaint()) {
       paint(color);
    }
  }

  public void nextRow() {
    if(canMove("south")) {
      turnRight();
      move();
      turnRight();
    }
    else {
      turnLeft();
      move();
      turnLeft();
     }
   }
 

  public void paintBackground(String color) {
   while(canMove()) {
     paintRow(color);
     nextRow();
   }
 }

 public void paintWhiteStripedBackground(String color){
   
     paintRow(color);
       nextRow();
   paintRow("white");
 //     if(canMove()) {
 //       paintRow("white");
 //       nextRow();
    turnLeft();
   move();
   turnLeft();
   move();
   move();
   move();
   move();
   move();
   move();
     paintRow(color);
       nextRow();
   paintRow("white");
   
   turnLeft();
   move();
   turnLeft();
   move();
   move();
   move();
   move();
   move();
   move();
     paintRow(color);
       nextRow();
   paintRow("white");
   turnLeft();
   move();
   turnLeft();
   move();
   move();
   move();
   move();
   move();
   move();
     paintRow(color);
       nextRow();
   paintRow("white");
   turnLeft();
   move();
   turnLeft();
     paintRow(color);
   nextRow();
   paintRow("white");
    turnLeft();
   move();
   turnLeft();
     paintRow(color);
   nextRow();
   paintRow("white");
 // }
   
 }
}