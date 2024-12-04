// C++ Program to remove all special characters from a given string
#include <iostream>
#include <cstring> 
using namespace std;

int main()
{
    char ch[15];
    cout << "Enter a string: " << endl;
    cin.getline(ch, 15);
    int n = strlen(ch);
    for (int i = 0; i < n; i++)
    {
        if (!((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')))
        {
            for (int j = i; j < n - 1; j++)
            {
                ch[j] = ch[j + 1];
            }
            ch[n - 1] = '\0';
            n--;
            i--; 
        }
    }

    cout << "New string is : " << ch << endl;

    return 0;
}
