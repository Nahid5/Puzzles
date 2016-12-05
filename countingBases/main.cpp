#include <iostream>
#include <map>
#include <string>
#include <iterator>
#include <ext/hash_map>
#include <functional>
#include <cstdlib>
#include <iomanip>
#include <algorithm>

std::map<char, int> count_chars(std::string input);

int main()
{
    std::string words = "";
    std::cout << "Enter phrase or keys. " << std::endl;
    std::getline(std::cin, words);
    std::transform(words.begin(), words.end(),words.begin(), ::toupper);    //makes everything uppercase
    count_chars(words);

    return 0;
}

std::map<char, int> count_chars(std::string input)
{
    std::map<char,int> counter;
    for ( int i = 0; i < input.size(); ++i)
    {
        counter[ input[i] ]++;  //adding one to the value at the point
        /*
        int x = counter[ input[i] ];
        x++; // x += 1; x = x + 1; ++x;
        counter[input[i]] = x;
        */
    }

    std::map<char,int>::iterator it;    //iterators points to values
    for (it= counter.begin(); it!=counter.end(); it++) //does it matter it++ ++it
    {
        std::cout << it->first << " : " << it->second << std::endl;     //prints from first element to last
    }
    return counter;
}
