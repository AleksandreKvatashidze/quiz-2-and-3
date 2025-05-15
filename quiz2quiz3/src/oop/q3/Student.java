package oop.q3;

/**
 * The Student class represents a student with basic information including name, surname, country, and additional info.
 * This class provides methods to access and modify the student details.
 */
public class Student {

    private String name;
    private String surname;
    private String country;
    private String info;

    /**
     * Constructor to initialize a student with name, surname, country, and info.
     *
     * @param name    The name of the student.
     * @param surname The surname of the student.
     * @param country The country of the student.
     * @param info    Additional info about the student.
     */
    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }

    /**
     * Gets the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the surname of the student.
     *
     * @return The surname of the student.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets the country of the student.
     *
     * @return The country of the student.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gets additional info about the student.
     *
     * @return The info of the student.
     */
    public String getInfo() {
        return info;
    }
}
