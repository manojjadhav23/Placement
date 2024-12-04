#include<iostream>
#include<string>
using namespace std;
#define SIZE 5
template<class T>
class stack
{
    public: 
    stack();
    T pop();
    T push(T k);
    bool isEmpty();
    bool isFull();
    T topElement();
    private:
    int top;
    T st[SIZE];
};
template<class T>
stack<T>::stack()
{
    top = -1;
};
template<class T>
bool stack<T>::isEmpty()
{
    if(top == -1)
    {
        return 1;
    }
    else{
        return 0;
    }

};
template<class T>
bool stack<T>::isFull()
{
    if(top ==(SIZE-1))
    {
        return 1;
    }
    else{
        return 0;
    }
};
template<class T>
T stack<T>::pop()
{
    T pop_ele = st[top];
    top--;
    return pop_ele;
    //cout<<"popped element is "<<pop_ele<<endl;
}
template<class T>
T stack<T>::push(T k)
{
    if(isFull())
    {
        cout<<"Stack is full"<<endl;
    }
    else{
        cout<<"Inserted element is : "<<k<<endl;
        top = top +1;
        st[top]=k;
    }
}
template<class T>
T stack<T>::topElement()
{
    T top_ele = st[top];
    return top_ele;
};
int main()
{
    stack<int> integer_stack;
    stack<string> string_stack;

    integer_stack.push(5);
    integer_stack.push(15);
    integer_stack.push(5145);

    string_stack.push("Stack");
    string_stack.push("is");
    string_stack.push("LIFO");

    cout << integer_stack.pop() << " is removed from stack"<< endl;
 
    cout << string_stack.pop() << " is removed from stack "<< endl;
 
    cout << "Top element is " << integer_stack.topElement()<< endl;

    cout << "Top element is " << string_stack.topElement()<< endl;


}