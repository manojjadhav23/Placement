//Friend class

// #include<iostream>
// using namespace std;
// class A
// {
//     private : 
//     int x;
//     protected :
//     int y;

//     public: 
//     A()
//     {
//         x=10;
//         y=20;
//     }
//     friend class F;
// };
// class F
// {
//     public:
//     void add(A& a)
//     {
//         cout<<"Addition is : "<<a.x+a.y<<endl;
//     }
// };
// int main()
// {
//     A aobj;
//     F fobj;
//     fobj.add(aobj);
// }


//friend function with class
// #include<iostream>
// using namespace std;
// class base;
// class A
// {
//     public:
//     void add(base &);
   
// };
// class base
// {
//     private : 
//     int x=10;
//     protected :
//     int y=20;

//     public: 
//     base()
//     {
    
//     }
//     friend void A ::add(base &);
// };

// void A :: add(base & a)
// {
//     cout<<"Addition :"<<a.x+a.y<<endl;
// }
// int main()
// {
//     A aobj;
//     base fobj;
//     aobj.add(fobj);
// }


//Global friend function
#include<iostream>
using namespace std;

class base
{
    private : 
    int x=10;
    protected :
    int y=20;

    public: 
    base()
    {
    
    }
    friend void add(base &);
};

void add(base & a)
{
    cout<<"Addition :"<<a.x+a.y<<endl;
}
int main()
{

    base fobj;
    add(fobj);
}