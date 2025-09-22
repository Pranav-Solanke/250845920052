// 1. OOP Design
// Create a class Item with attributes:

// itemID, itemName, price, stockQuantity

// Create a class Bill with:

// billID, customerName, list of purchased items

// 2. Operator Overloading
// Overload + to add an item to the bill

// Overload << to display the bill details

// 3. Exception Handling
// Throw exceptions for:

// Negative price or quantity

// Attempt to purchase more than available stock

// Empty bill generation

// 4. File Handling
// Save all bills to bills.txt

// Load previous bills at startup

// Append new bills without overwriting
#include<iostream>
#include<vector>
using namespace std;

class Item
{
    public:
    int itemID,stockQuantity;
    string itemName;
    double price;

    Item(int id,string nme,double p,int s)
    {
            if(p<=0 || s<=0)
            throw invalid_argument("prices cannot be negative");
        
        itemID=id;
        itemName=nme;
        price=p;
        stockQuantity=s;
    }
};
 
class Bill
{
    public:
    int billID;
    string customerName;
    vector<Item> purchasedItem;

    Bill(int b,string nme)
    {
        billID=b;
        customerName=nme;
    }

    Bill& operator+(Item& it)
    {
        purchasedItem.push_back(it);
        it.stockQuantity--;
        return *this;
    }

    friend ostream& operator<<(ostream& out,const Bill b)
    {
        out<<"Bill ID : "<<b.billID<<"\n"
           <<"Customer Name : "<<b.customerName<<"\n"
           <<"-------------------------------------"<<"\n";
        double total=0;
        for(size_t i=0;i<b.purchasedItem.size();i++)
        {
            out<<b.purchasedItem[i].itemID<<" "
               <<b.purchasedItem[i].itemName<<" "
               <<b.purchasedItem[i].price<<"\n";
            total=total+b.purchasedItem[i].price;
        }
        out<<"-------------------------------------"<<"\n";
        out<<"Total Bill = "<<total;
    }


};
int main()
{
    try
    {
    Item Laptop(1,"laptop",0.0,0);
    Item Mobile(1,"mobile",30000.0,0);

    Bill b1(101,"Pranav");

    b1 + Laptop;//b1.operator(laptop);
    b1 + Mobile;

   cout << b1;//operator(cout,b1);

    }
    
    catch(exception &e)
    {
        cout << "Error: " << e.what() << endl;
    }
}