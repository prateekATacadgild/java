import java.math.BigInteger;
public class FirstAsm {
	int a=20;
	int b=10;
	int ans;
	int c,d,e;
    int asc ;
    String ch;
    
  //Assignment 1.2
    void display()
    {
    	  System.out.println("Assignment 1.2");
    	b=(a--)-(--a);
    	System.out.println("int b= a-- - --a output is - " +b);
    	c=a--;
    	System.out.println("int c=a-- output is - " +c);
    	 d=a>>2;	
    	System.out.println("int d=a>>2;output is   - "+d);
    	 e=a&b;
    	System.out.println("int e=a&b output is - " +e);
    }

//Assignment 1.1	
  void add(int a,int b)
  {
	  System.out.println("Assignment 1.1");
	  BigInteger b1=new BigInteger(new Integer(a).toString());
	  BigInteger b2=new BigInteger(new Integer(b).toString());
	  BigInteger sum=b1.add(b2);
     System.out.println("Sum is " +sum);
  }

void add1(int a,int b)
{
  System.out.println("Assignment 1.1 second option");
	 ans=a-(-b);
   System.out.println("ANS is " +ans);
}

//Assignment 1.3
void swap(int x,int y)
{
	System.out.println("Assignment 1.3");
	System.out.println("Before Swap");
	System.out.println("x value "+x);
	System.out.println("y value "+y);
	 x = x+y;
     y=x-y;
     x=x-y;
	System.out.println("After Swap");
	System.out.println("x value "+x);
	System.out.println("y value "+y);
}
//Assignment 1.4
void Ascii()
{
	System.out.println("Assignment 1.4");
	for(asc=65; asc<=90; asc++)
    {
        ch = new Character((char)asc).toString();
        System.out.print(asc+ "-" + ch + "\n");
    }

}
}

