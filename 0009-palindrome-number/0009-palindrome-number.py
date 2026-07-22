class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False

        num = x
        rev =0
        original=x
        while num>0:
            last_dig = num%10
            rev = (rev*10)+last_dig
            num = num//10

        return rev == original

        