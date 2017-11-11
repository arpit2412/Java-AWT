import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
	Frame f;
	GridLayout gl,gl1,gl2,gl3,gl4;
	Panel p1,p2,p3,p4;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	TextField t1;
	int v1,v2,result;
	char op=' ';
	public Calculator()
	{
		f=new Frame();
		f.setSize(400,400);
		gl=new GridLayout(5,0);
		f.setLayout(gl);
		t1=new TextField();
		f.add(t1);
		p1=new Panel();
		gl1=new GridLayout(0,4);
		p1.setLayout(gl1);
		b1=new Button("1");
		b1.addActionListener(this);
		b2=new Button("2");
		b2.addActionListener(this);
		b3=new Button("3");
		b3.addActionListener(this);
		b4=new Button("+");
		b4.addActionListener(this);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		f.add(p1);
		p2=new Panel();
		gl2=new GridLayout(0,4);
		p2.setLayout(gl2);
		b5=new Button("4");
		b5.addActionListener(this);
		b6=new Button("5");
		b6.addActionListener(this);
		b7=new Button("6");
		b7.addActionListener(this);
		b8=new Button("-");
		b8.addActionListener(this);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		f.add(p2);
		p3=new Panel();
		gl3=new GridLayout(0,4);
		p3.setLayout(gl3);
		b9=new Button("7");
		b9.addActionListener(this);
		b10=new Button("8");
		b10.addActionListener(this);
		b11=new Button("9");
		b11.addActionListener(this);
		b12=new Button("*");
		b12.addActionListener(this);
		p3.add(b9);
		p3.add(b10);
		p3.add(b11);
		p3.add(b12);
		f.add(p3);
		p4=new Panel();
		gl4=new GridLayout(0,4);
		p4.setLayout(gl4);
		b13=new Button("C");
		b13.addActionListener(this);
		b14=new Button("0");
		b14.addActionListener(this);
		b15=new Button("/");
		b15.addActionListener(this);
		b16=new Button("=");
		b16.addActionListener(this);
		p4.add(b13);
		p4.add(b14);
		p4.add(b15);
		p4.add(b16);
		f.add(p4);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{	String str=e.getActionCommand();
		char ch=str.charAt(0);
		if(Character.isDigit(ch))
			t1.setText(t1.getText()+str);
		if(str.equals("+"))
		{	

			if(op=='-')
			{	if(t1.getText().equals(""))
			op='+';
			else
			{
				v2=Integer.parseInt(t1.getText()); 
				v1-=v2;
				op='+';
				t1.setText("");
			}}
			else
				if(op=='*')
				{	if(t1.getText().equals(""))
						op='+';
						else
						{
					v2=Integer.parseInt(t1.getText());
					v1*=v2;
					op='+';
					t1.setText("");
				}}
				else
					if(op=='/')
					{if(t1.getText().equals(""))
						op='+';
						else
						{
						v2=Integer.parseInt(t1.getText());
						if(v2==0)
							t1.setText("Divide by zero error!!!!!!!!");
						else
						{
							v1/=v2;
							op='+';
							t1.setText("");
						}
					}}
					else
						if(op=='+')
						{	if(t1.getText().equals(""))
						op='+';
						else
						{
							v2=Integer.parseInt(t1.getText());
							v1+=v2;
							op='+';	
							t1.setText("");
						}}
						else
							if(op==' ')
							{
								v1=Integer.parseInt(t1.getText());
								op='+';
								t1.setText("");
							}
		}
		if(str.equals("-"))
		{
			if(op=='+')
			{	if(t1.getText().equals(""))
						op='-';
						else
						{
				v2=Integer.parseInt(t1.getText());
				v1+=v2;
				op='-';
				t1.setText("");
			}}
			else
				if(op=='*')
				{	if(t1.getText().equals(""))
						op='-';
						else
						{
					v2=Integer.parseInt(t1.getText());
					v1*=v2;
					op='-';
					t1.setText("");
				}}
				else
					if(op=='/')
					{	if(t1.getText().equals(""))
						op='-';
						else
						{
						v2=Integer.parseInt(t1.getText());
						if(v2==0)
							t1.setText("Divide by zero error!!!!!!!!");
						else
						{
							v1/=v2;
							op='-';
							t1.setText("");
						}
					}}
					else
						if(op=='-')
						{	if(t1.getText().equals(""))
						op='-';
						else
						{
							v2=Integer.parseInt(t1.getText());
							v1-=v2;
							op='-';
							t1.setText("");
						}}
						else
							if(op==' ')
							{
								v1=Integer.parseInt(t1.getText());
								op='-';
								t1.setText("");
							}
		}
		if(str.equals("*"))
		{
			if(op=='+')
			{	if(t1.getText().equals(""))
						op='*';
						else
						{
				v2=Integer.parseInt(t1.getText());
				v1+=v2;
				op='*';
				t1.setText("");
			}}
			else
				if(op=='-')
					{ if(t1.getText().equals(""))
						op='*';
						else
						{
					v2=Integer.parseInt(t1.getText());
					v1-=v2;
					op='*';
					t1.setText("");
				}}
				else
					if(op=='/')
					{	if(t1.getText().equals(""))
						op='*';
						else
						{
						v2=Integer.parseInt(t1.getText());
						if(v2==0)
							t1.setText("Divide by zero error!!!!!!!!");
						else
						{
							v1/=v2;
							op='*';
							t1.setText("");
						}
					}}
					else
						if(op=='*')
						{	if(t1.getText().equals(""))
						op='*';
						else
						{
							v2=Integer.parseInt(t1.getText());
							v1*=v2;
							op='*';
							t1.setText("");
						}}
						else
							if(op==' ')
							{
								v1=Integer.parseInt(t1.getText());
								op='*';
								t1.setText("");
							}
		}
		if(str.equals("C"))
		{
			v1=v2=result=0;
			op=' ';
			t1.setText("");
		}
		if(str.equals("/"))
		{
			if(op=='+')
			{	if(t1.getText().equals(""))
						op='/';
						else
						{
				v2=Integer.parseInt(t1.getText());
				v1+=v2;
				op='/';
				t1.setText("");
			}}
			else
				if(op=='*')
				{	if(t1.getText().equals(""))
						op='/';
						else
						{
					v2=Integer.parseInt(t1.getText());
					v1*=v2;
					op='/';
					t1.setText("");
				}}
				else
					if(op=='-')
					{	if(t1.getText().equals(""))
						op='/';
						else
						{
						v2=Integer.parseInt(t1.getText());
						v1-=v2;
						op='/';
						t1.setText("");
					}}
					else
						if(op=='/')
						{	if(t1.getText().equals(""))
						op='/';
						else
						{
							v2=Integer.parseInt(t1.getText());
							if(v2==0)
								t1.setText("Divide by zero error!!!!!!!!");
							else
							{
								v1/=v2;
								op='/';
								t1.setText("");
							}
						}}
						else
							if(op==' ')
							{
								v1=Integer.parseInt(t1.getText());
								op='/';
								t1.setText("");
							}
		}
		if(str.equals("="))
		{
			v2=Integer.parseInt(t1.getText());
			if(op=='+')
			{
				result=v1+v2;
				t1.setText(result+"");
			}
			else
				if(op=='-')
				{
					result=v1-v2;
					t1.setText(result+"");
				}
				else
					if(op=='*')
					{
						result=v1*v2;
						t1.setText(result+"");
					}
					else
						if(op=='/')
						{
							try
							{
								result=v1/v2;
								t1.setText(result+"");
							}
							catch(Exception e1)
							{
								t1.setText("Divide by zero error!!!!!!!!");
							}
						}
			v1=v2=result=0;
			op=' ';
		}
	}
	public static void main(String args[])
	{
		Calculator c=new Calculator();
	}
}