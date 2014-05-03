import java.awt._
import javax.swing._

class Overlay extends JFrame {
  JFrame.setDefaultLookAndFeelDecorated(true);
  setBackground(new Color(0, 0, 0, 0));
  setSize(Toolkit.getDefaultToolkit().getScreenSize());
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setAlwaysOnTop(true)
  setVisible(true)

  override def paint(g: Graphics) {
    if (g.isInstanceOf[Graphics2D]) {
	  val g2d = g.asInstanceOf[Graphics2D];
	  g2d.setColor(Color.RED)
      g2d.fillOval(50, 50, 10, 10)
    }
  }
}