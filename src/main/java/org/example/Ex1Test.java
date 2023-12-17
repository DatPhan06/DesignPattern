package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Ex1Test thực hiện kiểm thử và hiển thị thông tin về phả hệ gia đình.
 */
public class Ex1Test {
    /**
     * Phương thức chính của chương trình.
     *
     * @param args Tham số dòng lệnh (không sử dụng trong ví dụ này).
     */
    public static void main(String[] args) {
        // Tạo đối tượng Person để mô phỏng các thành viên trong gia đình.
        Person Tai = new Person("Tài Phan", "23/04/1979", "Male", "Hạnh Đỗ");

        Person Dat = new Person("Đạt Phan", "03/04/2004", "Male", "Mei Trang");
        Person Thanh = new Person("Phan Trí Thành", "01/05/2012", "Female", null);
        Tai.addChild(Dat);
        Tai.addChild(Thanh);

        Person Minh = new Person("Tuấn Minh", "23/05/2034", "Male", "Mẫn Nhi");
        Person Ngoc = new Person("Bảo Ngọc", "02/02/2040", "Female", null);
        Dat.addChild(Minh);
        Dat.addChild(Ngoc);

        Person Man = new Person("Mận", "12/04/2059", "Male", "Xoài");
        Person Lou = new Person("Louis", "23/03/2057", "Male", null);
        Person Khang = new Person("Tuấn Khang", "23/04/2056", "Male", null);
        Minh.addChild(Man);
        Minh.addChild(Lou);
        Minh.addChild(Khang);

        // Khởi tạo danh sách để theo dõi thông tin gia đình.
        List<String> familyTwoChildren = new ArrayList<>();
        List<Person> personLastGeneration = new ArrayList<>();
        List<Person> family = new ArrayList<>();
        List<Integer> listCheck = new ArrayList<>();

        // Thêm người đầu tiên vào danh sách gia đình.
        family.add(Tai);
        while (!family.isEmpty()) {
            int size = family.size();
            boolean check = true;
            for (int i = 0; i < size; i++)
                if (family.get(i).getMarried() == null) listCheck.add(i, -1);
                else {
                    listCheck.add(i, family.get(i).getChildren().size());
                    if (check && listCheck.get(i) > 0) check = false;
                }
            if (check) {
                personLastGeneration.addAll(family);
                family.clear();
            } else {
                List<Person> nextListPerson = new ArrayList<>();
                for (int i = 0; i < size; i++)
                    if (listCheck.get(i) > 0) {
                        nextListPerson.addAll(family.get(i).getChildren());
                        if (listCheck.get(i) == 2)
                            familyTwoChildren.add(family.get(i).getName() + " - " + family.get(i).getMarried());
                    }
                family.clear();
                family.addAll(nextListPerson);
            }
        }

        // Hiển thị thông tin về các cặp vợ chồng có 2 con.
        System.out.println("\nNhững cặp vợ chồng có 2 con trong danh sách phả hệ:");
        for (String couple : familyTwoChildren) System.out.println("\t" + couple);

        // Hiển thị thông tin về thế hệ mới nhất trong danh sách phả hệ.
        System.out.println("\nThế hệ mới nhất trong danh sách phả hệ:");
        for (Person person : personLastGeneration) System.out.println("\t" + person);
    }
}
