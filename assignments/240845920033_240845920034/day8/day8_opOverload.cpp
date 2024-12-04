//Operator overloading
#include<iostream>
using namespace std;
class Complex
{
    int r,i;
    public:
    Complex();
    Complex(int ,int);
    void display()
    {
        if(i>0)
        {
            cout<<"Complex number is : "<<r<<"+"<<i<<"i"<<endl;
        }
        else
        {
            cout<<"Cpmplex number is : "<<r<<i<<"i"<<endl;
        }
    
    }
    Complex operator+(Complex&);
    Complex operator-(Complex&);
    Complex operator-();

};
Complex::Complex(){
    r=i=0;
};
Complex::Complex(int a,int b)
{
    this->r=a;
    this->i=b;
};
Complex Complex::operator+(Complex& c){
    Complex temp;
    temp.r=this->r+c.r;
    temp.i=this->i+c.i;
    return temp;
};
Complex Complex::operator-(Complex& c)
{
    Complex temp;
    temp.r=this->r-c.r;
    temp.i=this->i-c.i;
    return temp;
};
Complex Complex::operator-()
{
    Complex temp;
    temp.r=-this->r;
    temp.i=-this->i;
    return temp;
};

int main()
{
    Complex c1(1,2);
    Complex c2(3,4);
    Complex c3=c1+c2;
    c3.display();
    Complex c4 =c1-c2;
    c4.display();
    Complex c5 =-c2;
    c5.display();

}