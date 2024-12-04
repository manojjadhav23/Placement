// C++ Program to Reverse a Number
#include<iostream>
using namespace std;

int main()
{
    int n, rem, ref, rev = 0;
    cout << "Enter the number : " << endl;
    cin >> n;
    ref = n;
    while (n != 0)
    {
        rem = n % 10;
        n = n / 10;
        rev = rev * 10 + rem;
    }
    cout<<"Reverse of given number is : "<<rev;
    return 0;
}