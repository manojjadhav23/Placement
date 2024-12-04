// WRITE A CPP PROGRAM TO DISPLAY FACTORIAL FROM NUMBER 5 TO 8.
#include<iostream>
using namespace std;

int factorial(int j)
{
    int fact=1;
    for(int i=j;i>=1;i--)
        {
            fact=fact*i;
        }

        return fact;

}



int main()
{
    int n;
    for(n=5;n<=8;n++)
    {
        int result=factorial(n);
        cout<<"Factorial of number "<<n<<" is : "<<result<<endl;
    }
}
