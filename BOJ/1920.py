def binary_search(target):
    start = 0
    end = n - 1

    while start <= end:
        mid = (start + end) // 2

        if numbers[mid] == target:
            return True

        if numbers[mid] < target:
            start = mid + 1
        elif numbers[mid] > target:
            end = mid - 1


n = int(input())
numbers = list(map(int, input().split()))
numbers.sort()

m = int(input())
ans = list(map(int, input().split()))


for a in ans:
    if binary_search(a):
        print(1)
    else:
        print(0)

