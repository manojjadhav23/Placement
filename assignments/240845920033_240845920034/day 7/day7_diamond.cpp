#include<iostream>
using namespace std;
class Teacher
{
    public:
    int m1,b1;
    Teacher()
    {
        cout<<"in default of Teacher \n";
    }
    Teacher(int a,int b)
    {
        cout<<"in para of Teacher \n";
        m1=a;
        b1=b;
    }
    void mul()
    {
        cout<<"Multiplication is"<<m1*b1<<endl;
    }

};
class Student1: virtual public Teacher
{
    public:
    int m2,b2,e2;
    Student1()
    {
        cout<<"in default of Student1 \n";
    }
    Student1(int b,int c,int d)
    {
        cout<<"in para of Student1 \n";
        m2=b;
        b2=c;
        e2=d;
    }
    void mul()
    {
        cout<<"Multiplication is"<<m2*b2*e2<<endl;
    }

};
class Student2: virtual public Teacher
{
    public:
    int m3=30;
    Student2()
    {
        cout<<"in default of Student2 \n";
    }
    Student2(int c)
    {
        cout<<"in para of Student2 \n";
    }

};
class Principal: public Student1,public Student2
{
    public: 
    // Principal()
    // {
    //     cout<<"In default of principal \n";
    // }
    Principal(int s,int t,int u,int v):Student1(s,t,u),Student2(t),Teacher(v,u)
    {
        cout<<"In para of principal \n";
    }
    void average()
    {
        int sum=m1+m2+m3;
        int avg =sum/3;
        cout <<"Average is : "<<avg<<endl;
    }

};
int main()
{
   Principal p1(1,2,3,4);
   Teacher * ptr = new Teacher();
   ptr -> mul();
    p1.average();
    p1.mul();
// Teacher * ptr=new Teacher(1,2,3,4);
// ptr ->average();

}