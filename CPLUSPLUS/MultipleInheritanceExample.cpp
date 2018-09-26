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

class MarineAnimal
{
  public:
    string maDescription;
    MarineAnimal() : maDescription("I live in the water.") {}

    string getMADescription()
    {
        cout << maDescription << endl;
    }
};

class Whale : public Mammal, public MarineAnimal
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

int main(){
    Whale whale1;
    cout << "As we can see whale inherited description of mammal" << endl;
    whale1.getMDescription();
    cout << "Whale also inherited description of Marine Animal" << endl;
    whale1.getMADescription();
    cout << "Here, we are using the method which gets the members of both inherited classes" << endl ;
    whale1.getWDescription();

    return 0;
}