#include<iostream>
using namespace std;

class Book {
    char id;
    float weight;

  public:
    void getData() {
      cout << "Enter book character id: ";
      cin >> id;
      cout << "Enter weight: ";
      cin >> weight;
    }

    void displayData() {
      cout << "Book character id: " << id << endl;
      cout << "Weight: " << weight << " kg" << endl;
    }
};

int main() {
  Book books[3];
  int i;

  cout << "Enter data for 3 books:" << endl;
  for(i = 0; i < 3; i++) {
    cout << "Book " << (i+1) << ":" << endl;
    books[i].getData();
  }

  cout << "Books Data:" << endl;
  for(i = 0; i < 3; i++) {
    cout << "Book " << (i + 1) << ":" << endl;
    books[i].displayData();
  }

  return 0;
}