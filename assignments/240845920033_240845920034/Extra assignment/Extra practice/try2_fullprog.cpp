#include<iostream>
using namespace std;
class Result
{
    int id;
    string name;
    char grade;
    public:
    Result()
    {
        cout<<"Default Costructur"<<endl;
    }
    Result(int num,string NAME,char gd)
    {
        cout<<"In paramaterised constructor"<<endl;
        id=num;
        name=NAME;
        grade=gd;
    }
    void accept()
    {
        cout<<"Enter Student id : ";
        cin>>id;
        cout<<"Enter Student Name : ";
        cin>>name;
        cout<<"Enter Student Grade : ";
        cin>>grade;
    }
    void display()
    {
        cout<<"Student id : "<<id<<endl;
        cout<<"Student Name : "<<name<<endl;
        cout<<"Student Grade : "<<grade<<endl;
    }
    void setId(int a)
    {
        id=a;
    }
    int getId()
    {
        return id;
    }
    void setName(string s)
    {
        name=s;
    }
    string getName()
    {
        return name;
    }
    void setGrade(char q)
    {
        grade=q;
    }
    char getGrade()
    {
        return grade;
    }
    
};
int main()
{
    Result rt;
    rt.accept();
    rt.display();
    // Result rt2(3,"Abhi",'B');
    // rt2.display();
    rt.setId(5);
    rt.display();
    cout<<"Get function for Id : "<<rt.getId();
    rt.setName("Kunal");
    rt.display();
    cout<<"Get function for Name : "<<rt.getName();
    rt.setGrade('F');
    rt.display();
    cout<<"Get function for Grade : "<<rt.getGrade();




};