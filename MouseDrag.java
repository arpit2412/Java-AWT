import java.awt.*;
import java.awt.event.*;
class MouseDrag implements MouseMotionListener
{
Frame f;
Panel p1,p2;
Label l1,l2;
TextField t1,t2;
int x,y,a,b;	
	public MouseDrag()
	{
		f = new Frame();
		p1 = new Panel();
		p2 = new Panel();
		f.setSize(400,400);
		p2.addMouseMotionListener(this);
		l1 = new Label("X");
		l2 = new Label("Y");
		t1 = new TextField(5);
		t2 = new TextField(5);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		f.add(p1,"South");
		f.add(p2);
		f.setVisible(true);
		WindowCloser wc = new WindowCloser();
		f.addWindowListener(wc);
	}	
	public void mouseMoved(MouseEvent e1)
	{
		x=e1.getX();
		y=e1.getY();
		t1.setText(x+" ");
		t2.setText(y+" ");
		a=p2.getWidth();
		b=p2.getHeight();
		Graphics g = p2.getGraphics();
		g.setColor(Color.red);
		g.drawLine(0,0,x,y);
		g.setColor(Color.yellow);
		g.drawLine(0,b,x,y);
		g.setColor(Color.green);
		g.drawLine(a,0,x,y);
		g.setColor(Color.blue);
		g.drawLine(a,b,x,y);
	}
	
	public void mouseDragged(MouseEvent e2)
	{
	}
	public static void main(String args[])
	{
		MouseDrag m = new MouseDrag();
	}
}