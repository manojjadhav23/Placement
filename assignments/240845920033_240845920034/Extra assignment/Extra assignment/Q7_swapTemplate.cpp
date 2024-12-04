#include <iostream>
#include <sstream>
using namespace std;

template <typename T>
void Swap(T& a, T& b) {
    T temp = a;
    a = b;
    b = temp;
}

class Complex {
public:
    Complex(double real = 0.0, double imag = 0.0) : real(real), imag(imag) {}

    string toString() const {
        stringstream ss;
        ss << real << " + " << imag << "i";
        return ss.str();
    }

    bool operator==(const Complex& other) const {
        return real == other.real && imag == other.imag;
    }

private:
    double real, imag;
};

int main() {
    int a = 3, b = 7;
    cout << "Before swapping int: a = " << a << ", b = " << b << endl;
    Swap(a, b);
    cout << "After swapping int: a = " << a << ", b = " << b << endl;

    char x = 'X', y = 'Y';
    cout << "Before swapping char: x = " << x << ", y = " << y <<endl;
    Swap(x, y);
  cout << "After swapping char: x = " << x << ", y = " << y << endl;

    Complex c1(3.0, 4.0), c2(1.0, 2.0);
    cout << "Before swapping Complex: c1 = " << c1.toString() << ", c2 = " << c2.toString() << endl;
    Swap(c1, c2);
   cout << "After swapping Complex: c1 = " << c1.toString() << ", c2 = " << c2.toString() << endl;

    return 0;
}