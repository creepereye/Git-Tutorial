def solution(n, lost, reserve):
    answer = n-len(lost)
    for i in range(len(lost)):
        for j in range(len(reserve)):
            if lost[i]==reserve[j]:
                answer+=1
                reserve.pop(j)
                lost.pop(i)
                break
    for i in range(len(lost)):
        for j in range(len(reserve)):
            if lost[i]==reserve[j]-1 or lost[i]==reserve[j]+1:
                answer+=1
                reserve.pop(j)
                lost.pop(i)
                break
    return answer
print(solution(5,[2,4],[1,3,5]))