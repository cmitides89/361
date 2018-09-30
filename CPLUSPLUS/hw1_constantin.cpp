#include <iostream>
#include <string>
using namespace std;

class Mammal
{
  public:
    string mDescription;
    Mammal(): mDescription("I breathe air."){}

    string getMDescription()
    {
        cout << mDescription << endl;
    }     
};

class OceanCreature
{
  public:
    string maDescription;
    OceanCreature() : maDescription("I live in the water.") {}

    string getMADescription()
    {
        cout << maDescription << endl;
    }
};

class Whale : public Mammal, public OceanCreature
{  
  public:
    string wDescription;
    Whale() : wDescription("I do both:"){}

    string getWDescription()
    {
        string inheritiedDescription = wDescription + " " + mDescription + " " +maDescription;
        cout << inheritiedDescription << endl;
    }  
};

// void* malloc (size_t size);

// void *p = malloc(sizeof(int));
// printf p; // returns 200. The address of the starting block.

#include<iostream>
using namespace std;

class BankUser
{
    private:
        //This data is encapsulated inside the BankUser Class
        string name;
        int accountNumber;
        int age;
    
    public:
        //requires this access modifier to change data
        void setAge(int age)
        {
            this->age = age;
        }
        void setAccountNumber(int accountNumber)
        {
            this->accountNumber = accountNumber;
        }

        int getAge() const {
            return age;
        }

        int getAccountNumber() const{
            return accountNumber;
        }
};

int main()
{
    Whale whale1;
    cout << "As we can see whale inherited description of mammal" << endl;
    whale1.getMDescription();
    cout << "Whale also inherited description of Marine Animal" << endl;
    whale1.getMADescription();
    cout << "Here, we are using the method which gets the members of both inherited classes" << endl;
    whale1.getWDescription();

    BankUser bankUser1;
    bankUser1.setAccountNumber(12345);
    bankUser1.setAge(29);
    cout << bankUser1.getAccountNumber() <<endl;
    cout << bankUser1.getAge();

    return 0;
}