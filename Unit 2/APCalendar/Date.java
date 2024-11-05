public class Date {
    private int month, year, day;
    public String toString() {
        return month+"/"+day+"/"+year;
    }
    public void addCentury(Date recent, Date old) {
        old.addYears(100);
        recent = old;
        // System.out.println(recent);
    }
    public void addYears(int n) {
        year += n;
    }
    public Date(int mo, int da, int yr) {
        month = mo;
        day = da;
        year=yr;
    }
    public static void main(String[] args) {
        Date oldDate = new Date(1,13,1900);
        Date recentDate = null;
        System.out.println(oldDate.year);
        oldDate.addCentury(recentDate, oldDate);
        System.out.println(recentDate);
        System.out.println(oldDate);
    }
}