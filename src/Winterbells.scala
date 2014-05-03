import java.awt._
import javax.swing._
import java.awt.GraphicsDevice.WindowTranslucency._

object Winterbells {
  def main(args: Array[String]): Unit = {
    // create the overlay on the event-dispatching thread
    SwingUtilities.invokeLater(new Runnable {
      def run() {
        new Overlay().setVisible(true)
      }
    })
  }
}