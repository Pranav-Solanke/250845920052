#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter value of n : "<<endl;
    cin>>n;
    int* ptr=new int(n);//int* ptr=new int[n]; this one for array
    for(int i=0;i<n;i++)
    {
        cin>>*(ptr+i);
    }
    cout<<" elements are ";
    for(int i=0;i<n;i++)
    {
        cout<<*(ptr+i)<<" ";
    }
    delete []ptr;
}