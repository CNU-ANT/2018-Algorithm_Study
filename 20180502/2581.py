import math

M = int(input())
N = int(input())

primeNumber = [True] * (N+1)

primeNumber[0] = False
primeNumber[1] = False

rootN = math.sqrt(N)
for i in range(2,int(rootN)+1):
    j = 2
    if primeNumber:
        while (i*j) <= N:
            primeNumber[i*j] = False
            j += 1


minPrime = N+1
sum = 0

for index in range(M, N+1):
    if primeNumber[index]:
        sum += index
        minPrime = index if minPrime > index else minPrime

print(-1 if sum==0 else str(sum)+"\n"+str(minPrime))

