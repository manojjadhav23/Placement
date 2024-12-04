#include<iostream>
using namespace std;

int main()
{
    int n, rem, ref, sum = 0;
    cout << "Enter the number : " << endl;
    cin >> n;
    ref = n;
    while (n != 0)
    {
        rem = n % 10;
        n = n / 10;
        sum = sum * 10 + rem;
    }
    if (sum == ref)
    {
        cout << "Number is a palindrome";
    }
    else
    {
        cout << "Number is not a palindrome";
    }
    return 0;
}
