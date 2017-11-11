import java.awt.*;
import java.awt.event.*;
class DragDraw extends MouseAdapter implements MouseMotionListener 
	{Frame f;
	Panel p1,p2;
	int x1,y1,x2,y2;
	TextField t1,t2;
	Label l1,l2;

	public DragDraw()
	{
		f = new Frame();
		p1 = new Panel();
		p2 = new Panel();
		f.setSize(400,400);
		t1 = new TextField(5);
		t2 = new TextField(5);
		l1 = new Label("X");
		l2 = new Label("Y");
		
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		p1.addMouseListener(this);
		p1.addMouseMotionListener(this);
		f.add(p2,"South");
		f.add(p1);
		f.setVisible(true);
		WindowCloser wc = new WindowCloser();
		f.addWindowListener(wc);
	}
	
	
	public void mouseMoved(MouseEvent e1)
	{	
	}
	
	
	 
	public void mouseDragged(MouseEvent e2)
	{
		Graphics g = p1.getGraphics();
		g.setColor(Color.BLACK);
        	g.drawLine(x2,y2,e2.getX(),e2.getY());
        	x2 = e2.getX();
        	y2 = e2.getY();
		t1.setText(x2+"");
		t2.setText(y2+"");
	}
	public void mousePressed(MouseEvent e) 
	{
 		x1=e.getX();
		y1=e.getY();
		x2=x1;
		y2=y1;
   	 }
	
		
	public static void main(String args[])
	{
		DragDraw d = new DragDraw();
	}
}