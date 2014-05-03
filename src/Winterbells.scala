import java.awt._
import javax.swing._
import java.awt.GraphicsDevice.WindowTranslucency._

object Winterbells {
  def main(args: Array[String]): Unit = {
    // determine what the graphics device can support
    val ge = GraphicsEnvironment.getLocalGraphicsEnvironment()
    val gd = ge.getDefaultScreenDevice()

    // exit if translucent windows aren't supported
    if (!gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT)) {
      System.out.println("Per-pixel translucency is not supported");
      System.exit(0);
    }
    
    JFrame.setDefaultLookAndFeelDecorated(true);

    // create the overlay on the event-dispatching thread
    SwingUtilities.invokeLater(new Runnable {
      def run() {
        new Overlay().setVisible(true)
      }
    })
  }
}