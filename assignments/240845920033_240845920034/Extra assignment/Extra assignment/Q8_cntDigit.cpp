// C++ Program to Find number of Digits in any number
#include<iostream>
using namespace std;

int main()
{
    int n, rem, ref, sum = 0;
    int cnt=0;
    cout << "Enter the number : " << endl;
    cin >> n;
    ref = n;
    while (n != 0)
    {
        rem = n % 10;
        n = n / 10;
        sum = sum * 10 + rem;
        cnt++;
    }
    cout<<"Total number of digits are : "<<cnt;
    return 0;
}