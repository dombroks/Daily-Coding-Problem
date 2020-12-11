"""
This problem was asked by Alibaba.

Given an even number (greater than 2), return two prime numbers whose sum will be equal to the given number.

A solution will always exist. See Goldbach’s conjecture.

Example:

Input: 4
Output: 2 + 2 = 4

If there are more than one solution possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b, and [c, d] is another solution with c <= d, then

[a, b] < [c, d]

If a < c OR a==c AND b < d.
"""


def sum_couple_primes(num):
    if num <= 2:
        return
    pairs = []
    for i in range(0, num, 2):
        if i < num and i <= num // 2 and i != 0:
            pairs.append((i, num - i))
    pairs.sort()
    return pairs[0]


assert sum_couple_primes(4) == (2, 2)
