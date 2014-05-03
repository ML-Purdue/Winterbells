import java.awt._
import javax.swing._
import java.awt.GraphicsDevice.WindowTranslucency._

object Winterbells {
  def main(args: Array[String]): Unit = {
    SwingUtilities.invokeLater(new Runnable {
      def run() {
        new Overlay()
      }
    })
  }
}