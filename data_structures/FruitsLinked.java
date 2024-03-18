package data_structures;

import java.util.LinkedList;

public class FruitsLinked {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("リンゴ");
        linkedList.add("バナナ");
        linkedList.add("オレンジ");
        linkedList.add("スイカ");

        // Print the LinkedList
        System.out.println("リンクリストのフルーツ:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Add an element at the beginning of the LinkedList
        linkedList.addFirst("ブドウ");

        // Add an element at the end of the LinkedList
        linkedList.addLast("パイナップル");

        // Remove an element from the LinkedList
        linkedList.remove("オレンジ");

        // Print the modified LinkedList
        System.out.println("\n新しいリスト:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Get the first and last elements of the LinkedList
        System.out.println("\nFirst element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Check if an element exists in the LinkedList
        if (linkedList.contains("バナナ")) {
            System.out.println("\nバナナがあります。");
        } else {
            System.out.println("\nバナナがありません。");
        }

        // Get the size of the LinkedList
        System.out.println("\nリンクリストのサイズは：" + linkedList.size());

        // Clear all elements from the LinkedList
        linkedList.clear();
        System.out.println("\nリンクリストをクリアした。 新しいサイズは: " + linkedList.size());
    }
}
