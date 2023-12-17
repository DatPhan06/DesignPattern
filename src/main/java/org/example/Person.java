package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Person đại diện cho một cá nhân trong gia đình, bao gồm thông tin như tên, ngày sinh,
 * giới tính, thông tin về hôn nhân và danh sách con cái.
 */
public class Person {
    private String name;            // Tên của người
    private String Date;            // Ngày sinh của người
    private String sex;             // Giới tính của người
    private String married;         // Thông tin về hôn nhân của người
    private List<Person> children;  // Danh sách con cái của người

    /**
     * Phương thức khởi tạo một đối tượng Person với các thông tin cơ bản.
     *
     * @param name      Tên của người.
     * @param birthDate Ngày sinh của người.
     * @param sex       Giới tính của người.
     * @param married   Thông tin về hôn nhân của người.
     */
    public Person(String name, String birthDate, String sex, String married) {
        this.name = name;
        this.Date = birthDate;
        this.sex = sex;
        this.married = married;
        this.children = new ArrayList<>();
    }

    /**
     * Phương thức khởi tạo mặc định không tham số.
     */
    public Person() {
    }

    /**
     * Thiết lập tên của người.
     *
     * @param name Tên mới của người.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Thiết lập ngày sinh của người.
     *
     * @param date Ngày sinh mới của người.
     */
    public void setDate(String date) {
        Date = date;
    }

    /**
     * Thiết lập giới tính của người.
     *
     * @param sex Giới tính mới của người.
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Thiết lập thông tin về hôn nhân của người.
     *
     * @param married Thông tin về hôn nhân mới của người.
     */
    public void setMarried(String married) {
        this.married = married;
    }

    /**
     * Thiết lập danh sách con cái của người.
     *
     * @param children Danh sách con cái mới của người.
     */
    public void setChildren(List<Person> children) {
        this.children = children;
    }

    /**
     * Thêm một đối tượng Person làm con cái cho người.
     *
     * @param child Đối tượng Person làm con cái mới.
     */
    public void addChild(Person child) {
        children.add(child);
    }

    /**
     * Trả về tên của người.
     *
     * @return Tên của người.
     */
    public String getName() {
        return name;
    }

    /**
     * Trả về ngày sinh của người.
     *
     * @return Ngày sinh của người.
     */
    public String getDate() {
        return Date;
    }

    /**
     * Trả về giới tính của người.
     *
     * @return Giới tính của người.
     */
    public String getSex() {
        return sex;
    }

    /**
     * Trả về thông tin về hôn nhân của người.
     *
     * @return Thông tin về hôn nhân của người.
     */
    public String getMarried() {
        return married;
    }

    /**
     * Trả về danh sách con cái của người.
     *
     * @return Danh sách con cái của người.
     */
    public List<Person> getChildren() {
        return children;
    }

    /**
     * Phương thức chuyển đối tượng Person thành một chuỗi String.
     *
     * @return Chuỗi đại diện cho đối tượng Person.
     */
    @Override
    public String toString() {
        return "Name: " + name + ", DOB: " + Date + ", Sex: " + sex;
    }
}
