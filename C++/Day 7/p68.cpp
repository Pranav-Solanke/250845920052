//to call only show() of A without (::) operator , we call call 
//show of A in show of C
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
        A::show();//calls A
    }
};


int main()
{
    C obj_c;
    obj_c.show();//prints "in A"
}