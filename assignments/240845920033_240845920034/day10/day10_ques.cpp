#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char str[100];
    cout<<"Enter the String : "<<endl;
    gets(str);
   // int n=strlen(str)-1;

    int charcnt =0;
    int spacecnt=0;
    int wordcnt=0;
    int vowelcnt=0;
    //int consonantcnt;
    char tgchar;
    int tgcharcnt=0;
    int i;

    cout<<"Enter character which you want to count repeating : ";
    cin>>tgchar;

    for(i=0;str[i]!='\0';i++)
    {
        charcnt++;
        if(str[i]==' ')
        {
            spacecnt++;
        }
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
        {
            vowelcnt++;
        }
        if(str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
        {
            vowelcnt++;
        }
        if(str[i]==tgchar)
        {
            tgcharcnt++;
        }
    }
    
    wordcnt=spacecnt+1;

    cout<<"Total number of Characters in a string is : "<<charcnt<<endl;
    cout<<"Total number of Vowels in a string is : "<<vowelcnt<<endl;
    cout<<"Number of times "<<tgchar<<" in a string is : "<<tgcharcnt<<endl;
    cout<<"Total words in a string is : "<<wordcnt<<endl;
    cout<<"Total number of spaces in a string is : "<<spacecnt<<endl;
} 
