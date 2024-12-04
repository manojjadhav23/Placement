// #include<iostream>
// using namespace std;
// class complex
// {
// 	int real,img;
// 	public:static const int cnt;
// 	private:static const int cnt1;
// 	public:
// 		complex()
// 		{
// 			cout<<"default is invoked\n";
// 			real=5;
// 			img=5;
// 		//	cnt++;//not allowed
// 		}
// 		static int getcnt()
// 		{
// 			return cnt1;
// 		}
// };
// const int complex::cnt=5;//memory alloaction takes place
// const int complex::cnt1=10;
// int main()
// {
// 	complex c1;
// 	cout<<"no of obj created is   "<<complex::getcnt()<<endl;
// 	cout<<"sizeoof obj is     "<<sizeof(c1)<<endl;
// 	cout<<c1.cnt;
// 	//cout<<complex::cnt1;

// }
// output:
// default is invoked
// no of obj created is   10
// sizeoof obj is     8
// 5



// #include <iostream>
// using namespace std;

// class Test
// {
// 	static int x;
// public:
// 	Test() { x++; }
// 	static int getX() {return x;}
// };
// int Test::x;
// int main()
// {
// 	cout << Test::getX() << " ";
// }
// output: 0



// #include <iostream>
// using namespace std;
 
// class Player
// {
// private:
//     int id;
//     static int next_id;
// public:
//     int getID() { return id; }
//     Player()  {  id = next_id++; }
// };
// int Player::next_id = 1;
 
// int main()
// {
//   Player p1;
//   Player p2;
//   Player p3;
//   cout << p1.getID() << " ";
//   cout << p2.getID() << " ";
//   cout << p3.getID();
//   return 0;
// }
// output : 1 2 3

// #include <iostream>
// using namespace std;
//  class Point {
//     Point() { cout << "Constructor called"; }
// };
// int main()
// {
//     Point t1; //'Point::Point()' is private within this context
//     return 0;
// }
// output : Compilation error



// #include<iostream>
// using namespace std;
// class Point {
// public:
//     Point() { cout << "Constructor called"; }
// };
// int main()
// {
//    Point t1, *t2;
//    return 0;
// }
// output: Constructor called



// #include<iostream> 
// using namespace std; 
// #include<stdlib.h> 
//  class Test 
// { 
// public: 
//    Test() 
//    { cout << "Constructor called"; } 
// }; 
//  int main() 
// { 
//     Test *t = (Test *) malloc(sizeof(Test)); 
//     return 0; 
// } 
// output: malloc function does not call constructor so code run successfully output will be empty



// #include<iostream>
// using namespace std;
// class temp
// {
// 	int z;
// 	static int y;
// public:
// 	temp();
// 	void show();
// 	void display();
// };
// int x;
// int temp::y;
// void temp::show()
// {
// 	y++;
// }
// temp::temp()
// {
// 	int z=200;
// 	x=100;
// 	cout<<"value of z is "<<z<<endl;
// }
// void temp::display()
// {
// 	cout<<"value of x is "<<x<<endl;
// 	cout<<"value of y is  "<<y<<endl;
// }
// int main()
// {
// 	temp t;
// 	t.show();
// 	t.show();
// 	t.display();
// 	cout<<sizeof(t);
// }
// output:
// value of z is 200
// value of x is 100
// value of y is  2
// 4


// #include<iostream>
// using namespace std;
// class item
// {
// public:
// 	static int x;
// 	int number;
// public:
// 	void getdata(int a)
// 	{
// 		number=a;
// 		number++;
// 		x++;
// 	}
// 	void getcount()
// 	{
// 		x=10;
// 		cout<<"value is "<<x<<endl;
// 	}
// 	void getcount_1()
// 	{
// 		x++;
// 		cout<<"value is  "<<number<<endl;
// 		cout<<"value is "<<x<<endl;
// 	}
// };
// int number=9;
// int item::x;
// int main()
// {
// 	item a;
// 	a.getcount();
// 	a.getdata(100);
// 	a.getcount_1();
// 	cout<<number<<endl;
// 	cout<<a.number;
// }

// output:
// value is 10
// value is  101
// value is 12
// 9
// 101
