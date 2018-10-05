package at.htl.mydate;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Informationen zu Enums: http://tutorials.jenkov.com/java/enums.html
 *               zu split: https://stackoverflow.com/a/3481842/9818338
 *   zur Ermittlung des Wochentages: https://de.wikipedia.org/wiki/Wochentagsberechnung#Programmierung
 */
public class MyDate {

    private int day;
    private int month;
    private int year;

    /**
     *
     * @param dateString zB.: 5.10.2018
     */
    public MyDate(String dateString){

    }

    public MyDate(int year, int month, int day){

    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /**
     * Formatierung des Datums
     *
     * @return String, zB Samstag, 29. September 2018
     */
    public String formatDate() {

        return null;

    }

    /**
     *  Überprüfen, ob ein übergebenes Datum (other) jünger oder älter ist
     *
     * @param other
     * @return true, wenn this-Datum jünger als other-Datum ist
     *         false, wenn this-Datum jünger oder gleich other-Datum ist
     */
    public boolean isYoungerThan(MyDate other) {

        return false;

    }
}
