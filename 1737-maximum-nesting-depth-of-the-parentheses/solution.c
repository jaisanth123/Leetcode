int maxDepth(char* s) {
    int max=0;
    int op=0;
    for (int i =0; i<strlen(s);i++){
        if (s[i]=='('){
            op++;
            if(op>max){
                max=op;
            }
        }
        else if (s[i]==')'){
            op--;
        }
    }
    return max;
}

    

