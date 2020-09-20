
import sys

A=int(input())

N=list(map(int,input().split()))

check=[False]*A

order=[]

v=[]

def possible(index):
    num=0
    for n in range(index-1,-1,-1):
        if int(order[n])>int(order[index]):
            num+=1
    if num==N[index]:
        return True
    else:
        return False

def solve(s):
    if len(s)==A:
        print(order)
        for n in range(A):
            if not possible(n):
                return
        for n in range(A):
            v.append(int(s[n])+1)
        print(v)
        sys.exit()
    for n in range(A):
        if not check[n]:
            check[n]=True
            order.append(n)
            solve(str(n)+s)
            check[n]=False
            order.pop()

solve("")







    

