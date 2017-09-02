package model;

/**
 * Created by Евгений Дубовой on 02.09.2017.
 */
public class Student {
    //fields, properties
    public String name;
    public String phone;

    public int id;


    public int birthYear;
    public int birthMonth;
    public int birthDay;

    public double money;

    public String city;
    public String street;
    public String houseNum;

    private int TaskCount;

    public void init(String nm, String phn, int brthYear, int number){
        name = nm;
        phone= phn;
        birthYear = brthYear;
        id = number;
    }

}
