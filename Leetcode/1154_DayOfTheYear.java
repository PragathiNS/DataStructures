class Solution {
    public int dayOfYear(String date) {
        int febDays = 28;
        
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        boolean isLeap;
        
        // leap year
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("Leap year = " + year);
                    isLeap = true;
                }
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else
            isLeap = false;
        
        if (isLeap)
            febDays = 29;
        
        int[] daysInMonth = new int[] {31, febDays, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int out = day;
        //January
        if (month == 1)
            return out;
        else
        {
            // Feb to Dec
            for (int i = 0; i < (month - 1); i++)
                out = out + daysInMonth[i];
        }
    return out;
    }
}
