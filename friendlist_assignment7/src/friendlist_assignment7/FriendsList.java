package friendlist_assignment7;

import java.util.ArrayList;

public class FriendsList {

    public static void main(String[] args) {
        // Tạo một ArrayList để lưu trữ tên bạn bè
        ArrayList<String> friends = new ArrayList<>();

        // Thêm 5 tên vào danh sách
        friends.add("Linh");
        friends.add("Minh");
        friends.add("Ha");
        friends.add("Phong");
        friends.add("Trung");

        // In danh sách tên bạn bè
        System.out.println("Danh sach ban be: " + friends);
    }
}
