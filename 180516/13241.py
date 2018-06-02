def solve(a, b):
    if a % b == 0:
        return b
    return solve(b, a%b)
A, B = list(map(int, input().split()))
gcd = solve(A,B)
print(A * B // gcd)
