import java.awt._
import javax.swing._

class Overlay extends JFrame {
  setBackground(new Color(0, 0, 0, 0));
  setSize(Toolkit.getDefaultToolkit().getScreenSize());
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setAlwaysOnTop(true)

  override def paint(g: Graphics) {
    if (g.isInstanceOf[Graphics2D]) {
      val R = 240;
      val G = 240;
      val B = 240;

      val p = new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0), 0.0f, getHeight(), new Color(R, G, B, 255), true);
      val g2d = g.asInstanceOf[Graphics2D];
      g2d.setPaint(p);
      g2d.fillRect(0, 0, getWidth(), getHeight());
    }
  }
}