//Basic destructor code
//
//#include<iostream>
//using namespace std;
//class Sample
//{
//    int* ptr;
//    public:
//    Sample()
//    {
//        ptr=new int;
//        *ptr=10;
//    }
//    void display()
//    {
//        cout<<*ptr<<endl;
//    }
//    ~Sample()
//    {
//        cout<<"destructor called\n";
//        if(ptr)
//        {
//            delete ptr;
//            cout<<"in if block\n";
//        }
//    }
//
//};
//int main()
//{
//    Sample sp;
//    sp.display();
//    sp.~Sample();
//}


//Dynamic constructor



//#include<iostream>
//using namespace std;
//class temp
//{
//		int size;
//		int* ptr;
//public:
//	temp();
//	void get();
//	void show();
//	int max();
//	int min();
//};
//temp::temp()
//{
//	cout<<"how many elements do u want to store\n";
//	cin>>size;//5	
//	ptr=new int[size];
//}
//void temp::get()
//{
//	cout<<"accept elements\n";
//	for(int i=0;i<size;i++)
//	cin>>ptr[i];//*(ptr+i)
//}
//void temp::show()
//{
//	cout<<"value are\n";
//	for(int i=0;i<size;i++)
//	cout<<ptr[i]<<"\n"; //*(ptr+i)
//}
//int temp::max()
//{
//	int m=ptr[0];
//	for(int i=1;i<size;i++)
//	if(ptr[i]>m)
//	m=ptr[i];
//	return m;
//}
//int temp::min()
//{
//	int m=ptr[0];
//	for(int i=1;i<size;i++)
//	if(ptr[i]<m)
//	m=ptr[i];
//	return m;
//}
//int main()
//{
//	temp a;
//	a.get();
//	a.show();
//	cout<<"maximum number is "<<a.max()<<endl;
//	cout<<"minimum number is "<<a.min()<<endl;
//}



//  #include<iostream>
//  using namespace std;
//  class Demo
//  {
//  	int x,y;
//  	public:
//  		
//  		Demo(int x,int y)
//  		{
//  			
//  			this->x=x;
//  			this->y=y;
//  			
//		  
//	}
//	void show()
//	{
//		cout<<x<<" "<<y<<endl;
//		
//	}
//};
//int main()
//{
//	Demo d1(1,2);
//	//classname newobject(orignal obj);
//	Demo d2(d1);
//	d1.show();
//	d2.show();
//
//	
 // }
 
// 
// #include <iostream>
// using namespace std;
// 
// class Sample{
// 	int id;
// 	
// 	public:
// 		void init(int x) {id = x;}
// 		void display() { cout << endl<<"ID="<<id;}
//		
// 		
//	};
//int main()
//{
//	Sample obj1;
//	obj1.init(10);
//	obj1.display();
//	 
//  Sample obj2;
//  obj2.display();
//  return 0;
//}






