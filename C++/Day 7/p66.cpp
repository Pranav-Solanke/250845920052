.//Techniques to solve ambiguity
//1. use scope resolution operator
#include<iostream>
using namespace std;
class A
{
	public:
    void show()
    {
        cout<<"in A class"<<endl;
    }
};
class B 
{
	public:
    void show()
    {
        cout<<"in B class"<<endl;
    }
};
class C : public A,public B
{
    //inherited show() of A and show() of B
};


int main()
{
    C obj_c;
    //obj_c.show();// Ambiguity as there are 2 function named show in C
    obj_c.A::show();//using scope resolution operator to use A function
    obj_c.B::show();//using scope resolution operator to use B function
}