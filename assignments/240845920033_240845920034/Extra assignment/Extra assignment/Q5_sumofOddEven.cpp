// WRITE A CPP PROGRAM TO DISPLAY SUMMATION OF  EVEN AND ODD NUMBERS IN AN ARRAY OF INTEGERS.
#include<iostream>
using namespace std;
int main()
{
    int sum_odd,sum_even;
    int arr[6]={};
    cout<<"Enter the Array elements : "<<endl;
    for(int i=0;i<6;i++)
    {
         cin>>arr[i];
    }

    for(int j=0;j<6;j++)
    {
        if(arr[j]%2==0)
        {
            sum_even += arr[j];
        }
        else{
            sum_odd += arr[j];
        }
    }

    cout<<"Addition of even numbers of array is : "<<sum_even<<endl;
    cout<<"Addition of odd numbers of array is : "<<sum_odd<<endl;
}