#include<iostream>
using namespace std;
class Overload
{
    public:
    void add(int x,int y)
    {
        cout<<"The sum of "<<x<<" and "<<y<<" is "<<x+y<<endl;
    }
    void add(int x,int y,int z)
    {
        cout<<"The sum of "<<x<<" "<<y<<" and "<<z<<" is "<<x+y+z<<endl;
    }


};
int main()
{
    Overload ol;
    int a,b,c;
        cout<<"Enter the values of integer"<<endl;
        cout<<"Enter the values of A : ";
        cin>>a;
        cout<<"Enter the values of B : ";
        cin>>b;
        cout<<"Enter the values of C : ";
        cin>>c;
    cout<<"The values of A,B,C are : "<<a<<" "<<b<<" "<<c<<endl;
    cout<<"Enter the coice for operations"<<endl;
    cout<<"1.Addition of two numbers"<<endl;
    cout<<"2.Addition of three numbers"<<endl;
    int choice;
    cin>>choice;
    switch(choice)
    {
        case 1:
        {
            ol.add(a,b);
        }
        break;
        case 2:
        {
            ol.add(a,b,c);
        }
        break;
        default : 
        {
            cout<<"Invalid choice"<<endl;
        }
    }
}