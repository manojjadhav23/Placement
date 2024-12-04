//Static function overloading

// #include<iostream>
// using namespace std;
// class Parent
// {
//     public: 
//     static void show()
//     {
//         cout<<"in show() of Parent \n";
//     }

// };
// class Child : public Parent
// {
//     public: 
//     static void show()
//     {
//         cout<<"in show() of Child \n";
//     }

// };
// int main()
// {
//     Parent * ptr = new Child();
//     ptr->show();

// }

//Virtual function

#include<iostream>
using namespace std;
class Parent
{
    public: 
    virtual void show()
    {
        cout<<"in show() of Parent \n";
    }
    // void print()
    // {
    //     cout<<"In print() of Parent \n";
    // }

};
class Child : public Parent
{
    public: 
     void show()
    {
        cout<<"in show() of Child \n";
    }
    void print()
    {
        cout<<"in print() of Child \n";
    }

};
int main()
{
    Parent * ptr = new Child();
    ptr->show();
    //ptr->print();

}


