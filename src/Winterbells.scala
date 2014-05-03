import java.awt._
import javax.swing._
import java.awt.GraphicsDevice.WindowTranslucency._

object Winterbells {
  def main(args: Array[String]): Unit = {
    JFrame.setDefaultLookAndFeelDecorated(true);

    SwingUtilities.invokeLater(new Runnable {
      def run() {
        val overlay = new Overlay()
      }
    })
  }
}