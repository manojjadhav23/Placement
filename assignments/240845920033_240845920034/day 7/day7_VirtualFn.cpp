#include<iostream>
using namespace std;
class Vehicle
{
    public:
   virtual void type()
    {
        cout<<"In Vehicle type "<<endl;
    }
    virtual void size()
    {
        cout<<"In Vehicle size"<<endl;
    }
    virtual void mode()
    {
        cout<<"in Vehicle mode"<<endl;

    }

};
class BMW: public Vehicle
{
     void size()
    {
        cout<<"In BMW size"<<endl;
    }
    void mode()
    {
        cout<<"in BMW mode"<<endl;

    }
    void type()
    {
        cout<<"in BMW type"<<endl;
    }



};
class Coupe : public BMW
{
void type()
    {
        cout<<"In Coupe type "<<endl;
    }
};
int main()
{
    Vehicle * ptr1 = new Vehicle();
    Vehicle * ptr2 = new BMW();
    Vehicle * ptr3 = new Coupe();

    ptr1-> type();
    ptr1-> size();
    ptr1-> mode();
     ptr2-> type();
    ptr2-> size();
    ptr2-> mode();
     ptr3-> type();
    ptr3-> size();
    ptr3-> mode();
}