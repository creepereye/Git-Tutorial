input_data=input()
row=int(input_data[1])#행
col=int(ord(input_data[0]))-int(ord('a'))+1#ord(c)는 문자의 아스키 코드 값을 돌려주는 함수이다.열
root=[(2,-1),(2,1),(-2,1),(-2,-1),(1,2),(1,-2),(-1,2),(-1,-2)]#갈수있는 경우의 수
cnt=0
for n in range(8):
    if 1<=col+root[n][0]<=8and 1<=row+root[n][1]<=8:
        cnt+=1
print(cnt)
