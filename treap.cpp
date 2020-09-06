#include<iostream>
#include<string>
using namespace std;
int counter = 0;
bool on = false;
class node//1.노드 만들기
{
public:
    node(const string& country = "", const double& death_percent = 0)
    {
        this->country = country;
        this->death_percent = death_percent;
        left = NULL;
        right = NULL;
    }
    node* left;
    node* right;
    string country;
    double death_percent;
};
class manager//2.노드 관리
{
public:
    node* leftrotation(node* x)
    {
        node* y = x->right, * T2 = y->left;
        y->left = x;
        x->right = T2;
        return y;
    }
    node* rightrotation(node* y)
    {
        node* x = y->left, * T2 = x->right;
        x->right = y;
        y->left = T2;
        return x;
    }
    node* search(node* root, const string& country)
    {
        if (root == NULL || root->country == country)
        {
            on = true;
            return root;
        }
        if (root->country > country)
        {
            if (!on)
            {
                cout << root->country << "를 거쳤습니다." << endl;
                counter++;
            }
            return search(root->left, country);
        }
        if (root->country <= country)
        {
            if (!on)
            {
                cout << root->country << "를 거쳤습니다." << endl;
                counter++;
            }
            return search(root->right, country);
        }
    }
    node* insert(node* root, const string& country, const double& death_percent)
    {
        if (root == NULL)
        {
            return new node(country, death_percent);
        }
        if (root->country <= country)
        {
            root->right = insert(root->right, country, death_percent);
            if (root->death_percent < death_percent)
            {
                root = leftrotation(root);
            }
        }
        else if (root->country > country)
        {
            root->left = insert(root->left, country, death_percent);
            if (root->death_percent < death_percent)
            {
                root = rightrotation(root);
            }
        }
        return root;
    }
    node* deletenode(node* root)
    {
        if (root == NULL)
        {
            return root;
        }
        if (root->left == NULL)
        {
            node* root_ = root->right;
            delete root;
            root = root_;
        }
        else if (root->right == NULL)
        {
            node* root_ = root->left;
            delete root;
            root = root_;
        }
        else if (root->left->death_percent >= root->right->death_percent)
        {
            root = rightrotation(root);
            root->right = deletenode(root->right);
        }
        else
        {
            root = leftrotation(root);
            root->left = deletenode(root->left);
        }
        return root;
    }
};
int main()
{
    manager manager;
    node* root = NULL;
    string name = "";
    double percent = 0;
    int input = 0;
    root = manager.insert(root, "미국", 1.2);
    root = manager.insert(root, "중국", 13.2);
    root = manager.insert(root, "일본", 1.3);
    root = manager.insert(root, "프랑스", 1.211);
    root = manager.insert(root, "영국", 14.2);
    root = manager.insert(root, "러시아", 16.3);
    while (true)
    {
        counter = 0;
        cout << "1번은 나라추가     2번은 나라 검색     3번은 가장사망률이높은 국가 삭제입니다     4번은 나가기 입니다" << endl;
        cin >> input;
        if (input == 1)
        {
            cout << "나라이름,사망률순으로 적어주세요" << endl;
            cin >> name >> percent;
            root = manager.insert(root, name, percent);
        }
        else if (input == 2)
        {
            on = false;
            cout << "나라이름을 적어주세요" << endl;
            cin >> name;
            cout << endl;
            cout << "\n\n" << manager.search(root, name)->country << " 의 사망률은 " << manager.search(root, name)->death_percent << endl;
            cout << counter << "번거쳤습니다\n\n";
        }
        else if (input == 3)
        {
            root = manager.deletenode(root);
            cout << "가장사망률이높은 국가가삭제되었습니다" << endl;
        }
        else
        {
            while (root != NULL)
            {
                root = manager.deletenode(root);
            }
            cout << "프로그램 종료" << endl;
            break;
        }
    }
    return 0;
}