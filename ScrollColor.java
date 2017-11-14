import java.awt.*;
import java.awt.event.*;
class ScrollColor implements AdjustmentListener
{	Frame f;
	Scrollbar sb1,sb2,sb3;
	Panel p1,p2;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	public ScrollColor()
	{
		f = new Frame();
		f.setSize(600,400);
		p1 = new Panel();
		p1.setLayout(new GridLayout(0,3));
		sb1 = new Scrollbar(Scrollbar.VERTICAL,25,5,0,260);
 		sb1.addAdjustmentListener(this);
		sb2 = new Scrollbar(Scrollbar.VERTICAL,75,5,0,260);
		sb2.addAdjustmentListener(this);
		sb3 = new Scrollbar(Scrollbar.VERTICAL,90,5,0,260);
		sb3.addAdjustmentListener(this);
		p1.add(sb1);
		p1.add(sb2);
		p1.add(sb3);
		p2 = new Panel();
		p2.setLayout(new GridLayout(1,6));
		l1=new Label("Red");
		l2=new Label("Green");
		l3=new Label("Blue");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		p2.add(l3);
		p2.add(t3);
		f.add(p2,"South");
		f.add(p1,"East");
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int v1,v2,v3;
		v1=sb1.getValue();
		v2=sb2.getValue();
		v3=sb3.getValue();
		t1.setText(v1+"");
		t2.setText(v2+"");
		t3.setText(v3+"");
		 f.setBackground(new Color(v1,v2,v3));
		//Color myColor = new Color(v1,v2,v3);
		//f.setBackground(myColor);
		
	}
	
	public static void main(String args[])
	{
		ScrollColor s = new ScrollColor();
	}
}