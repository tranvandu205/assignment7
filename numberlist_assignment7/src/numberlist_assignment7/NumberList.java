package numberlist_assignment7;

import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {
        // Tạo một ArrayList chứa các số nguyên từ 1 đến 10
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Xóa số 5 khỏi danh sách
        numbers.remove(Integer.valueOf(5));

        System.out.println("Danh sach sau khi xoa so 5: " + numbers);
    }
}
