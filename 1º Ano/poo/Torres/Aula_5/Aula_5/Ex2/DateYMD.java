package Aula_5.Ex2;

public class DateYMD {
    private int year;
    private int month;
    private int day;

    public DateYMD(int year, int month, int day) {
        if (validDate(day, month, year)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid date");
        }
    }

    public DateYMD(DateYMD date) {
        this.year = date.year;
        this.month = date.month;
        this.day = date.day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void set(int day, int month, int year) {
        if (validDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Invalid date");
        }
    }

    public static int monthDays(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }
        return days;
    }

    // incrementday()

    public void incrementDay(int x) {
        if (validDate(day + x, month, year)) {
            this.day += x;
        } else {
            System.out.println("Invalid date");
        }
    }

    // incrementmonth()

    public void incrementMonth(int x) {
        if (validDate(day, month + x, year)) {
            this.month += x;
        } else {
            System.out.println("Invalid date");
        }
    }

    // incrementyear()

    public void incrementYear(int x) {
        if (validDate(day, month, year + x)) {
            this.year += x;
        } else {
            System.out.println("Invalid date");
        }
    }

    // decrementday()

    public void decrementDay(int x) {
        if (validDate(day - x, month, year)) {
            this.day -= x;
        } else {
            System.out.println("Invalid date");
        }
    }

    // decrementmonth()

    public void decrementMonth(int x) {
        if (validDate(day, month - x, year)) {
            this.month -= x;
        } else {
            System.out.println("Invalid date");
        }
    }

    // decrementyear()

    public void decrementYear(int x) {
        if (validDate(day, month, year - x)) {
            this.year -= x;
        } else {
            System.out.println("Invalid date");
        }
    }

    // validDay

    public boolean validDay(int day) {
        if (day < 1 || day > 31) {
            return false;
        } else {
            return true;
        }
    }

    // validMonth

    public boolean validMonth(int month) {
        if (month < 1 || month > 12) {
            return false;
        } else {
            return true;
        }
    }

    // validYear

    public boolean validYear(int year) {
        if (year < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validDate(int day, int month, int year) {
        if (validMonth(month) && validDay(day) && validYear(year)) {
            if (monthDays(month, year) >= day) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
    }

    public boolean equals(DateYMD date) {
        if (this.year == date.year && this.month == date.month && this.day == date.day)
            return true;
        return false;
    }

    public boolean isLeapYear() {
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0)
            return true;
        return false;
    }
}
