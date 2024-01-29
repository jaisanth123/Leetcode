int lengthOfLongestSubstring(char* s) {
int n = strlen(s);
int maxLength = 0;
int lastIndex[128];
int start = 0;
for (int i=0; i < 128; i++) {
lastIndex[i] = -1;
}
for (int end = 0; end < n; end++) {
if (lastIndex[s[end]] != -1) {
start = (lastIndex[s[end]] + 1) > start? (lastIndex[s[end]] + 1): start;
}
lastIndex[s[end]] = end;
maxLength = (maxLength > (end - start + 1)) ? maxLength: (end - start + 1);
}
return maxLength;
}


