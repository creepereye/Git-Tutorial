#include<iostream>
#include<string>
using namespace std;
class corona_nation//���������
{
public:
    corona_nation(const string& arena_name = "empty", const int& number_of_patient = 0, const int& number_of_death = 0, corona_nation* next = NULL, corona_nation* prev = NULL)
    {
        this->number_of_patient = number_of_patient;
        this->arena_name = arena_name;
        this->number_of_death = number_of_death;
        percent_of_death = ((double)number_of_death / number_of_patient) * 100;
        this->prev = prev;
        this->next = next;
    }
    double percent_of_death;
    int number_of_death;
    int number_of_patient;
    string arena_name;
    corona_nation* prev;
    corona_nation* next;
};
template<typename T>
class DLL//��������
{
public:
    T* head = NULL;
    void add_to_DLL_sorted(const string& arena_name = "empty", const int& number_of_patient = 0, const int& number_of_death = 0);
    void print();
    void delete_node(const string& name);
    ~DLL()
    {
        while (head != NULL)
        {
            if (head->next == NULL)
            {
                delete head;
                break;
            }
            head = head->next;
            delete head->prev;
        }
    }
};
template<typename T>
void DLL<T>::add_to_DLL_sorted(const string& arena_name, const int& number_of_patient, const int& number_of_death)
{
    if (head == NULL)
    {
        head = new T(arena_name, number_of_patient, number_of_death);
    }
    else
    {
        T* check = head;
        while (check != NULL)
        {
            if (arena_name < head->arena_name)
            {
                T* temp = new T(arena_name, number_of_patient, number_of_death);
                temp->next = head;
                head->prev = temp;
                temp->prev = NULL;
                head = temp;
                break;
            }
            if (check->arena_name > arena_name)
            {
                T* temp = new T(arena_name, number_of_patient, number_of_death);
                temp->next = check;
                temp->prev = check->prev;
                check->prev->next = temp;
                check->prev = temp;
                break;
            }
            if (check->next == NULL)
            {
                T* temp = new T(arena_name, number_of_patient, number_of_death);
                check->next = temp;
                temp->prev = check;
                temp->next = NULL;
                break;
            }
            check = check->next;
        }
    }
}
template<typename T>
void DLL<T>::print()
{
    T* check = head;
    while (check != NULL)
    {
        cout.width(10);
        cout << check->arena_name;
        cout.width(10);
        cout << check->number_of_patient;
        cout.width(10);
        cout << check->number_of_death;
        cout.width(10);
        cout << check->percent_of_death << endl;
        check = check->next;
    }
}
template<typename T>
void DLL<T>::delete_node(const string& name)
{
    T* check = head;
    while (check != NULL)
    {
        if (check->arena_name == name)
        {
            if (head->arena_name == name)
            {
                head = head->next;
            }
            if (check->prev != NULL)
            {
                check->prev->next = check->next;
            }
            else
            {
                check->prev = NULL;
            }
            if (check->next != NULL)
            {
                check->next->prev = check->prev;
            }
            else
            {
                check->next = NULL;
            }
            delete check;
            break;
        }
        check = check->next;
    }
}
int main()
{
    DLL<corona_nation> v;
    int number_of_death;
    int number_of_patient;
    string arena_name;
    int choice = 0;
    while (1)
    {
        cout << "������ �߰��Ϸ��� 1�� ������ ����Ϸ���2�� ������ �����Ϸ��� 3�� �����÷��� 4���� �����ּ���" << endl;
        cin >> choice;
        if (choice == 1)
        {
            cout << "�����̸� Ȯ���ڼ� ����ڼ� ������� �����ּ���" << endl;
            cin >> arena_name >> number_of_patient >> number_of_death;
            v.add_to_DLL_sorted(arena_name, number_of_patient, number_of_death);
        }
        else if (choice == 2)
        {
            cout.width(10);
            cout << "�����̸�";
            cout.width(10);
            cout << "�����ڼ�";
            cout.width(10);
            cout << "����ڼ�";
            cout.width(10);
            cout << "�����" << endl;
            v.print();
        }
        else if (choice == 3)
        {
            cout << "���� �ϰ���� �����̸��� �����ּ���" << endl;
            cin >> arena_name;
            v.delete_node(arena_name);
        }
        else
        {
            cout << "���α׷��� ����˴ϴ�" << endl;
            return 0;
        }
    }
    v.print();
    return 0;
}