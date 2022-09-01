def solution(number, k):
    stk = []
    for n in number:
        while stk and stk[-1] < n and k > 0:
            stk.pop()
            k -= 1
        stk.append(n)

    return ''.join(stk[:len(number) - k])


