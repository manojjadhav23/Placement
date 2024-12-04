#include<iostream>
using namespace std;
int main()
{
    char * car[5]={"BMWx","Jeep","Mahi","Mati","KiaX"};
    for(int i=0;i<5;i++)
    {
        cout<<car[i]<<endl;
        cout<<&car[i]<<endl;
        for(int j=0;j<1;j++)
        {
            cout<<*(*(car+i)+1)<<endl;
        }
    }
}
// output:
// BMWx
// 0x61fef4
// M
// Jeep
// 0x61fef8
// e
// Mahi
// 0x61fefc
// a
// Mati
// 0x61ff00
// a
// KiaX
// 0x61ff04
// i