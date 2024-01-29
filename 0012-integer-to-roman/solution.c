char* intToRoman(int num) {
    int numbers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    const char *romanNumerals[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    char* romanNumeral = (char*)malloc(20 * sizeof(char));  // Allocate memory for the result
    romanNumeral[0] = '\0';  // Initialize the string to an empty string

    for (int i = 0; i < 13; i++) {
        while (num >= numbers[i]) {
            strcat(romanNumeral, romanNumerals[i]);
            num -= numbers[i];
        }
    }
    return romanNumeral;  // Return the constructed roman numeral
}


