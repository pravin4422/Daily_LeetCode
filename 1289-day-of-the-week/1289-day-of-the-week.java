class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        
        int k = year % 100;   
        int j = year / 100;   
        int h = (day + (13*(month + 1))/5 + k + k/4 + j/4 + 5*j) % 7;
        
        
        return days[(h + 6) % 7];
    }
}
