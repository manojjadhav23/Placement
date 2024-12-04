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
            cout<<"Complex number is : "<<r<<i<<"i"<<endl;
        }
    
    }
    Complex operator+(Complex&);
    Complex operator-(Complex&);
    Complex operator-();
    Complex operator++();
    Complex operator++(int);
    Complex operator--();
    Complex operator--(int);
    Complex operator+(int);
    friend Complex operator+(int,Complex&);
    friend void operator << (ostream &out, const Complex &c);
    friend void operator >> (istream &in,  Complex &c);
    

};
void operator << (ostream &out, const Complex &c)
{
    out << c.r;
    out  <<"+"<< c.i <<"i"<< endl;
   
}
 
void operator >> (istream &in,  Complex &c)
{
    cout << "Enter Real Part : ";
    in >> c.r;
    
    cout << "Enter Imaginary Part : ";
    in >> c.i;
    
}
Complex operator+(int n,Complex& t)
{
    Complex temp;
    temp.i=t.i+n;
    temp.r=t.r+n;
    return temp;

};
Complex Complex :: operator+(int n)
{
    Complex temp;
    temp.r=r+n;
    temp.i=this->i+n;
    return temp;

};
Complex Complex::operator++()   //preincrement operator
{
    ++this->r;
    ++this->i;
    return(*this);

};
Complex Complex::operator--()   //predecrement operator
{
    ++this->r;
    ++this->i;
    return(*this);

};
Complex Complex::operator++(int)  //post increment operator
{
    Complex temp =(*this);
     ++this->r;
    ++this->i;
    return temp;
};
Complex Complex::operator--(int)  //post decrement operator
{
    Complex temp =(*this);
     ++this->r;
    ++this->i;
    return temp;
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
    cout<<"Additon operator overloading : "<<endl;
    Complex c3=c1+c2;
    c3.display();
    cout<<"Substraction operator overloading : "<<endl;
    Complex c4 =c1-c2;
    c4.display();
    cout<<"Unary substraction overloading : "<<endl;
    Complex c5 =-c2;
    c5.display();
    cout<<"Preincreament operator overloading : "<<endl;
    Complex c6 = ++c1;
    c1.display();
    c6.display();
    cout<<"Post increament operator overloading : "<<endl;
    Complex c7 = c2++;
    c2.display();
    c7.display();  
    cout<<"Pre decreament operator overloading : "<<endl;
    Complex c8 = --c1;
    c1.display();
    c8.display();
    cout<<"Post decreament operator overloading : "<<endl;
    Complex c9 = c2--;
    c2.display();
    c9.display();
    cout<<"Addition of number to object in object + num format : "<<endl;
    Complex c10 = c1+5;
    c1.display();
    c10.display();
    cout<<"Addition of number to object in num + object format : "<<endl;
    Complex c11 = 8+c1;
    c1.display();
    c11.display();
    cout<<"cin >> operator overloading : "<<endl;
    Complex c12;
    cin>>c12;
    cout << "The complex object is for << overloading : "<<endl;
    cout << c12;




}