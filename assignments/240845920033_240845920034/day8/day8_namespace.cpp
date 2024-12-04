// #include <iostream>
// using namespace std;
// namespace fst_nmsp
// {
//   void func()
//   {
//      cout << "Inside first namespace" << endl;
//   }
// }

// namespace snd_nmsp
// {
//   void func()
//   {
//      cout << "Inside second namespace" << endl;
//   }
// }
 
// int main ()
// {
//       fst_nmsp :: func();
//       snd_nmsp :: func(); 
//       return 0;
// }




// #include <iostream>
// using namespace std;
// namespace fst_nmsp
// {
//   void func()
//   {
//      cout << "Inside first namespace" << endl;
//   }
// }
 
// namespace snd_nmsp
// {
//   void func()
//   {
//      cout << "Inside second namespace" << endl;
//   }
// }
// using namespace fst_nmsp;
// int main ()
// {
//   func();

//   return 0;
// }


#include <iostream>
using namespace std;
namespace first_space
{
  void func()
  {
     cout << "Inside first_space" << endl;
  }
  namespace second_space
  {
     void func()
     {
        cout << "Inside second_space" << endl;
     }
  }
}
using namespace first_space::second_space;
int main ()
{
      func();
   
      return 0;
}