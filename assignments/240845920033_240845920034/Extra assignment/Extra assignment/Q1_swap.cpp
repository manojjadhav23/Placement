#include<iostream>
using namespace std;

int main()
{
    int a,b;
    cout<<"Enter value of a and b before Swapping: "<<endl;
    cin>>a>>b;
    a= a+b;
    b= a-b;
    a= a-b;
    cout<<"After swapping : "<<endl;
    cout<<a<<" "<<b;
}