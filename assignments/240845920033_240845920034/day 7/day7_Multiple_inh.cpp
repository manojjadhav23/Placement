#include<iostream>
using namespace std;
class Room
{
    public:
    int length=5;
    Room()
    {
        cout<<"in default of Room \n";
    }
    Room(int p)
    {
        cout<<"in para constructor \n";
    }


};
class Hall
{
    public:
    int breadth = 10;
    Hall()
    {
        cout<<"In default of Hall \n";
    }
    Hall(int f)
    {
        cout<<"in para constructor \n";
    }

};
class House:public Hall,public Room
{
    public:
    // House()
    // {
    //     cout<<"In default of House \n";
    // }
    House(int a,int b):Room(a),Hall(b)
    {
        cout<<"in para of House \n";
    }
    void area()
    {
        cout<<"Area of house is :"<<length * breadth;
    }

};
int main()
{
    House  h1(5,6);
    h1.area();
}