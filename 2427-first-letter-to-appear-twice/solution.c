char repeatedCharacter(char* s) {

    int see[26];
    for(int i = 0 ; i < 26 ;i++){
        see[i]=0;
    }
    int i = 0;
    while (s[i] != '\0'){
        char cu = s[i];
        int index = cu-'a';
        if(see[index]==1)
            return cu;
        see[index] =1;
        i++;
    }
    return '\0';
}
