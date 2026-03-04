class Solution {
    public int solution(int n, int k) {
        int lambPrice = n * 12000;
        int freeDrink = n / 10;
        int drinkPrice = (k - freeDrink) * 2000;
        
        return lambPrice + drinkPrice;
    }
}