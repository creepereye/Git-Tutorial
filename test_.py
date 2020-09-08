
N=int(input())

A=list(input().split())
check=[False]*10

mx=""
mn=""

def possible(i,j,k):
    if k=="<":
        return i<j
    elif k==">":
        return i>j
    return True

def solve(cnt ,s):
    global mx
    global mn
    if cnt == N+1:
        if not len(mn):
            mn=s
        else:
            mx=s
        return
    for i in range(10):
        if not check[i]:
            if cnt == 0 or possible(s[-1] , str(i) , A[cnt-1]) :
                check[i] = True
                solve(cnt+1, s+str(i))
                check[i]=False
solve(0 , "")
print(mx)
print(mn)
        




















