
package arrange_assignment7;
import java.util.ArrayList;
import java.util.Collections;

public class arrange {
    public static void main(String[] args) {
        // Tạo một ArrayList chứa các số nguyên
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);

        // Sắp xếp danh sách theo thứ tự tăng dần
        Collections.sort(numbers);

        // In danh sách sau khi sắp xếp
        System.out.println("Danh sach sau khi sap xep: " + numbers);
    }
}

