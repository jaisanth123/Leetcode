
char* longestCommonPrefix(char** strs, int strssize) {
    if (strssize == 0){
        return "";
    }
    char* prefix = strs[0];
    int prefixlength = strlen(prefix);
for (int i = 1; i < strssize; i++){
    int j;
    for (j = 0; j < prefixlength && j < strlen(strs[i]); j++){
        if (prefix[j] != strs[i][j]){
            break;
        }
    }
    prefixlength = j;
    prefix[j] = '\0';
}
return prefix;
}

