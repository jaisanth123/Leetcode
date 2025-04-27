class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky=false;
        boolean isHeavy=false;
        if(length>=Math.pow(10,4)||width>=Math.pow(10,4)||height>=Math.pow(10,4)||((long)length*(long)width*(long)height>=Math.pow(10,9)))
            isBulky = true;
        if(mass>=100)
            isHeavy=true;

        if(isHeavy && isBulky)
            return "Both";
    
        if(isHeavy)
            return "Heavy";
        if(isBulky)
            return "Bulky";
        return "Neither";
        
    }
}
