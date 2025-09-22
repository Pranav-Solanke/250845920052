//Techniques to solve ambiguity
//2. Override show Function in C
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
	public:
    void show()
    {
        cout<<"in C class"<<endl;
    }
};


int main()
{
    C obj_c;
    obj_c.show();
    obj_c.A::show();
    obj_c.B::show();
}