//WRITE A CPP PROGRAM TO CHANGE THE CASE OF EACH CHARACTER IN A GIVEN STRING.
#include <iostream>
#include <cctype>
using namespace std;

int main() {
    char ch[10];
    cout << "Enter the string: " << endl;
    cin.getline(ch, 10);
    for (int i = 0; ch[i] != '\0'; i++) {
        ch[i] = toupper(ch[i]);
    }
    cout << "String after changing case: " << ch << endl;
    return 0;
}