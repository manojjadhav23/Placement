#include<iostream>
using namespace std;
class Student
{
    int roll;
    char grade;
    public:
    void receive()
    {
        cout<<"Enter your Roll no.: ";
        cin>>roll;
        cout<<"Enter your grade :";
        cin>>grade;
    }
    void display()
    {
        cout<<"Roll no.: "<<roll<<endl;
        cout<<"Grade :"<<grade<<endl;
    }
    void setRoll(int a)
    {
        roll=a;
    }
    int getRoll()
    {
        return roll;
    }
    //setting the grade
    void setGrade(char b)
    {
        grade=b;
    }
    char getGrade()
    {
        return grade;
    }
};
int main()
{
    Student std;
    std.receive();
    std.display();
    std.setRoll(5);
    std.display();
    // cout<<"Roll no is "<<std.getRoll();
    std.setGrade('X');
    std.display();
    cout<<"Grade is"<<std.getGrade();

}
