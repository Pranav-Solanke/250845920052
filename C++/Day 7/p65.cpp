//Operator Overloading
#include<iostream>
using namespace std;
class Complex
{
	int real,img;
	public:
	Complex()
	{
		real=img=0;
	}
	Complex(int real,int img)
	{
		this->real=real;
		this->img=img;
	}
	void display()
	{
		if(img>0)
		{
			cout<<real<<"+"<<img<<"i"<<endl;
		}
	}
	Complex operator+(Complex &c2_new)//addition of 2 complex
	{
		Complex temp;
		temp.real=this->real+c2_new.real;
		temp.img=this->img+c2_new.img;
		return temp;
	}
	Complex operator++()//Prefix
	{
		this->real=this->real+1;
		this->img=this->img+1;
		return *this;
	}
	Complex operator++(int)//Postfix
	{
		Complex temp=*this;
		this->real=this->real+1;
		this->img=this->img+1;
		return temp;
	}
};
int main()
{
	Complex c1(10,2);
	Complex c2(10,2);
	Complex c3=c1+c2;//c3=c1.operator+(c2);//c3=c1.add(c2);
	c3.display();

	cout<<"Before incrementing Pre: "<<endl;
	c1.display();
	Complex c4=++c1;
	cout<<"After incrementing Pre: "<<endl;
	c4.display();

	cout<<"Before incrementing Post: "<<endl;
	c2.display();
	Complex c5=c2++;
	cout<<"After incrementing Post: "<<endl;
	c5.display();
}