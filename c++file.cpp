
#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main(void)
{
    ofstream writeFile;
    ifstream readFile;
    string a;
    string path = "test.txt";    //파일 열기
    writeFile.open(path);
    while (getline(cin, a))
    {
        if (!a.length())
        {
            break;
        }
        a = +"\n";
        writeFile.write(a.c_str(), a.length());
    }
    writeFile.close();
    readFile.open(path);
    while (!readFile.eof())
    {
        getline(readFile, a);
        cout << a<<endl;
    }
    readFile.close();
    return 0;
}



