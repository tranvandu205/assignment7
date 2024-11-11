package keywordsearch_assignment7;

import java.util.ArrayList;

public class KeywordSearch {

    public static void main(String[] args) {
        // Tạo một ArrayList với các từ khóa
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");

        // Kiểm tra xem "Python" có trong danh sách không
        if (keywords.contains("Python")) {
            System.out.println("\"Python\" co trong danh sach.");
        } else {
            System.out.println("\"Python\" khong co trong danh sach.");
        }
    }
}
