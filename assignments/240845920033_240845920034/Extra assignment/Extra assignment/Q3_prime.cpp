#include<iostream>
using namespace std;

bool isPrime(int num) {
    if (num<=1) {
        return false;
    }
    for (int i=2;i*i<=num;i++) {
        if (num%i == 0) {
            return false;
        }
    }
    return true;
}
int main() {
    int count = 0;
    int num = 2;
    cout << "The first 25 prime numbers are: ";
    while (count < 25) {
        if (isPrime(num)) {
            cout << num << "\t";
            count++;
        }
        num++;
    }
    return 0;
}