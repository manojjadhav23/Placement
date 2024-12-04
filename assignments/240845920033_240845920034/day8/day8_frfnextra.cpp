// #include<iostream>
// using namespace std;
// class Box
// {
//     private:
//     int length;

//     public : 
//     Box()
//     {
//         length=10;
//     }
//     friend int area(Box);
// };
// int area(Box t)
// {
//     t.length +=10;
//     return t.length;

// };
// int main()
// {
//     Box bx;
//     cout<<"Area is : "<<area(bx)<<endl;
// }


// #include<iostream>
// using namespace std;
// class B;
// class A
// {
//     int x;
//     public:
//     void setData(int i)
//     {
//         x=i;
//     }
//     friend void min(A,B);
// };
// class B
// {
//     int y;
//     public:
//     void setData(int i)
//     {
//         y=i;
//     }
//     friend void min(A,B);
// };
// void min(A a,B b)
// {
//     if(a.x>b.y)
//     {
//         cout<<"A is greater than b"<<endl;
//     }
//     else{
//         cout<<"B is greater than A"<<endl;
//     }
// };
// int main()
// {
//     A a;
//     B b;
//     a.setData(10);
//     b.setData(20);
//     min(a,b);

// }


#include<iostream>
using namespace std;
class Swap
{
    int a,b,temp;
    public:
    Swap(int a,int b)
    {
        this->a=a;
        this->b=b;
    }
    friend void swap1(Swap&);
};
void swap1(Swap& s)
{
    cout<<"Before swapping : "<<s.a<<" and "<<s.b<<endl;

    s.temp=s.a;
    s.a=s.b;
    s.b=s.temp;
    cout<<"After swapping : "<<s.a<<" and "<<s.b<<endl;
};
int main()
{
    Swap sw(4,5);
    swap1(sw);
}