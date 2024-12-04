#include <iostream>
#include <fstream>
#include <vector>
#include <string>

using namespace std;

// Class Date to store manufacturing date of a vehicle
class Date {
public:
    int month;
    int year;

    Date(int m = 1, int y = 2000) : month(m), year(y) {}

    void display() const {
        cout << "Manufacturing Date: " << month << "/" << year << endl;
    }
};

// Base Class Vehicle
class Vehicle {
protected:
    string make;
    string model;
    double price;
    Date manufacture_date;

public:
    Vehicle(string mk = "", string mdl = "", double pr = 0.0, Date mfd = Date())
        : make(mk), model(mdl), price(pr), manufacture_date(mfd) {}

    virtual void display() const = 0; // Pure virtual function

    virtual void saveToFile(ofstream &out) const = 0; // Pure virtual function
};

// Derived Class Car
class Car : public Vehicle {
private:
    int seating_capacity;

public:
    Car(string mk = "", string mdl = "", double pr = 0.0, Date mfd = Date(), int seatCap = 4)
        : Vehicle(mk, mdl, pr, mfd), seating_capacity(seatCap) {}

    void display() const override {
        cout << "Car Make: " << make << ", Model: " << model << ", Price: $" << price << endl;
        manufacture_date.display();
        cout << "Seating Capacity: " << seating_capacity << endl;
    }

    void saveToFile(ofstream &out) const override {
        out << make << " " << model << " " << price << " " << manufacture_date.month << " " 
            << manufacture_date.year << " " << seating_capacity << endl;
    }
};

// Derived Class Bike
class Bike : public Vehicle {
private:
    double seat_height;

public:
    Bike(string mk = "", string mdl = "", double pr = 0.0, Date mfd = Date(), double seatH = 30.0)
        : Vehicle(mk, mdl, pr, mfd), seat_height(seatH) {}

    void display() const override {
        cout << "Bike Make: " << make << ", Model: " << model << ", Price: $" << price << endl;
        manufacture_date.display();
        cout << "Seat Height: " << seat_height << " inches" << endl;
    }

    void saveToFile(ofstream &out) const override {
        out << make << " " << model << " " << price << " " << manufacture_date.month << " " 
            << manufacture_date.year << " " << seat_height << endl;
    }
};

// Function to load car data from file
void loadCars(vector<Car>& cars) {
    ifstream inFile("car_data.txt");
    if (inFile) {
        string make, model;
        double price;
        int month, year, seating_capacity;
        while (inFile >> make >> model >> price >> month >> year >> seating_capacity) {
            cars.push_back(Car(make, model, price, Date(month, year), seating_capacity));
        }
    }
}

// Function to load bike data from file
void loadBikes(vector<Bike>& bikes) {
    ifstream inFile("bike_data.txt");
    if (inFile) {
        string make, model;
        double price, seat_height;
        int month, year;
        while (inFile >> make >> model >> price >> month >> year >> seat_height) {
            bikes.push_back(Bike(make, model, price, Date(month, year), seat_height));
        }
    }
}

// Function to save car data to file
void saveCars(const vector<Car>& cars) {
    ofstream outFile("car_data.txt");
    for (const auto& car : cars) {
        car.saveToFile(outFile);
    }
}

// Function to save bike data to file
void saveBikes(const vector<Bike>& bikes) {
    ofstream outFile("bike_data.txt");
    for (const auto& bike : bikes) {
        bike.saveToFile(outFile);
    }
}

int main() {
    vector<Car> cars;
    vector<Bike> bikes;

    // Load existing data from files
    loadCars(cars);
    loadBikes(bikes);

    int choice;
    do {
        cout << "\nVehicle Fleet Management System\n";
        cout << "1. Add Car\n";
        cout << "2. Add Bike\n";
        cout << "3. Display Cars\n";
        cout << "4. Display Bikes\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                string make, model;
                double price;
                int month, year, seating_capacity;

                cout << "Enter car make: ";
                cin >> make;
                cout << "Enter car model: ";
                cin >> model;
                cout << "Enter car price: ";
                cin >> price;
                cout << "Enter manufacturing month (1-12): ";
                cin >> month;
                cout << "Enter manufacturing year: ";
                cin >> year;
                cout << "Enter seating capacity: ";
                cin >> seating_capacity;

                cars.push_back(Car(make, model, price, Date(month, year), seating_capacity));
                saveCars(cars);
                break;
            }
            case 2: {
                string make, model;
                double price, seat_height;
                int month, year;

                cout << "Enter bike make: ";
                cin >> make;
                cout << "Enter bike model: ";
                cin >> model;
                cout << "Enter bike price: ";
                cin >> price;
                cout << "Enter manufacturing month (1-12): ";
                cin >> month;
                cout << "Enter manufacturing year: ";
                cin >> year;
                cout << "Enter seat height (in inches): ";
                cin >> seat_height;

                bikes.push_back(Bike(make, model, price, Date(month, year), seat_height));
                saveBikes(bikes);
                break;
            }
            case 3:
                cout << "\nDisplaying All Cars:\n";
                for (const auto& car : cars) {
                    car.display();
                    cout << endl;
                }
                break;
            case 4:
                cout << "\nDisplaying All Bikes:\n";
                for (const auto& bike : bikes) {
                    bike.display();
                    cout << endl;
                }
                break;
            case 5:
                cout << "Exiting..." << endl;
                break;
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (choice != 5);

    return 0;
}
