#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int a=9;
    cout<<"Square root of 9 is : "<<sqrt(a)<<endl;
    int b=22.5;
    cout<<"Absolute of 22.5 is : "<<abs(b)<<endl;
    int base=4,expo=3;
    cout<<"Power of 4 to  the exponent 3 is : "<<pow(base,expo)<<endl;
    double c=-8.4;
    cout<<"Round up of -8.089 by using ceil is :  "<<ceil(c)<<endl;
    cout<<"Round down of -8.089 by using floor is :  "<<floor(c)<<endl;
    cout<<"Rounding up of -8.089 by using round is : "<<round(c)<<endl;

}
// output:
// Square root of 9 is : 3
// Absolute of 22.5 is : 22
// Power of 4 to  the exponent 3 is : 64
// Round up of -8.089 by using ceil is :  -8
// Round down of -8.089 by using floor is :  -9
// Rounding up of -8.089 by using round is : -8
