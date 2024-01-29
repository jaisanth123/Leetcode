    char* longestPalindrome(char* s) {
    int n = strlen(s);
    if (n == 0) {
        return "";
    }


    bool isPalindrome[n][n];
    memset(isPalindrome, false, sizeof(isPalindrome));

    int start = 0;
    int maxLength = 1;

    
    for (int i = 0; i < n; i++) {
        isPalindrome[i][i] = true;
    }

    
    for (int i = 0; i < n - 1; i++) {
        if (s[i] == s[i + 1]) {
            isPalindrome[i][i + 1] = true;
            start = i;
            maxLength = 2;
        }
    }

    
    for (int len = 3; len <= n; len++) {
        for (int i = 0; i < n - len + 1; i++) {
            int j = i + len - 1;
            if (s[i] == s[j] && isPalindrome[i + 1][j - 1]) {
                isPalindrome[i][j] = true;
                start = i;
                 maxLength = len;
            }
        }
    }

    
    char* longestPalindrome = (char*)malloc((maxLength + 1) * sizeof(char));
    strncpy(longestPalindrome, &s[start], maxLength);
    longestPalindrome[maxLength] = '\0';
    return longestPalindrome;
}

