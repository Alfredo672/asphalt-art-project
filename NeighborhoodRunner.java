import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  FlagPainter myFlagPainter = new FlagPainter();
  BackgroundPainter myBackgroundPainter = new BackgroundPainter();
  myFlagPainter.setPaint(900);
  myBackgroundPainter.setPaint(900);
 
  myFlagPainter.paintSquare("blue");
  myBackgroundPainter.paintWhiteStripedBackground("red");
    
  }
}