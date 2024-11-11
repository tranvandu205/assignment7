package update_assignment7;

import java.util.ArrayList;

public class update {

    public static void main(String[] args) {
        // Tạo một ArrayList chứa các số nguyên từ 1 đến 5
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // Cập nhật phần tử thứ 3 thành 100 (chỉ mục 2 vì chỉ mục bắt đầu từ 0)
        numbers.set(2, 100);

        // In danh sách sau khi cập nhật
        System.out.println("Danh sach sau khi cap nhat: " + numbers);
    }
}
