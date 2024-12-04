#include<iostream>
using namespace std;

class A
{
  public:
A(){
    cout<<"in default of A : \n";
}
   A(int p)
   {
     cout<<"in para of A :\n"<<p<<endl;
   }

};

class B : virtual public A
{
  public:

B(){
    cout<<"in default of B : \n";
}
  B(int q)
   {
     cout<<"in para of B :\n"<<q<<endl;
   }
};

class C : virtual public A
{
  public:

C(){
    cout<<"in default of C : \n";
}
   C(int r)
   {
     cout<<"in para of C :\n"<<r<<endl;
   }
};

class D : public C , public B
{
  public:

// D(){
//     cout<<"in default of D : \n";
// }
   D(int a):A(a),B(a),C(a)
   {
     cout<<"in para of D :\n"<<a<<endl;
   }
};
int main(){
 D obj(10);

}