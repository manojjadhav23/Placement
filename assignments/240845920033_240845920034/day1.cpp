
// Boolean data type
// #include<iostream>
// using namespace std;
// int main()
// {

//     bool x = true;
//     bool y = false;
//     printf("True : %d\n", x);
//     printf("False : %d\n", y);
//     cout<<x;
//     cout<<y;
// }

// Reference variable
// #include<iostream>
// using namespace std;
// int main()
// {
// 	int a=10;
// 	int &b=a;
// 	cout<<a<<"  "<<b<<endl;
// 	a=100;
// 	cout<<a<<"  "<<b<<endl;
// 	cout<<&a<<"  "<<&b<<endl;
	
// }

// Swapping by using reference variable
// #include <iostream>  
// using namespace std; 
// void swap(int&, int&); 
// int main()  
// {  
// 	int a,b;
// 	cout<<"enter values of a & b\n"<<endl;
// 	cin>>a>>b;
// 	swap(a,b);
// 	cout<<"after swapping "<<endl;
// 	cout<<"values of a & b is"<<a<<b<<endl;
// }
// void swap(int &p,int &q)
// {
// 	int temp;
// 	temp=p;
// 	p=q;
// 	q=temp;
	
// }

//static varible

// #include<iostream>
// using namespace std;
// void accept();
// int main()
// {
//     for(int i=0;i<=55;i++)
//     {
//         accept();
//     }

// }
// void accept()
// {
//     static int count=0;
//     cout<<" "<<count;
//     count++;
// }

//Class structure with consructor
#include <iostream>  
using namespace std; 
class ComplexNumber
{

	int rl,img;
	public:
		void accept();
		ComplexNumber();
		ComplexNumber(int,int);
		
};
void ComplexNumber ::accept()
{
	cout<<"complex no is "<<rl<<"+"<<img<<"i"<<endl;
}
ComplexNumber::ComplexNumber()
{
	cout<<"in default constructor\n";

	cout<<"enter value of real\n";
	cin>>rl;
	cout<<"enter value of img\n";
	cin>>img;
	
}
ComplexNumber::ComplexNumber(int r,int i)
{
	cout<<"in parametrized constructor\n";
	rl=r;
	img=i;
}
int main()
{
	ComplexNumber d1;
	d1.accept();

	ComplexNumber d2(5,6);
	d2.accept();
	
}