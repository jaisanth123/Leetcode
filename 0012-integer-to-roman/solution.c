char* intToRoman(int num) {
    int numbers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    const char *rNls[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    char* rNl = (char*)malloc(20 * sizeof(char));  
    rNl[0] = '\0';

    for (int i = 0; i < 13; i++) {
        while (num >= numbers[i]) {
            strcat(rNl, rNls[i]);
            num -= numbers[i];
        }
    }
    return rNl; 
}


