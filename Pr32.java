import java.util.LinkedList;

public class GenericSearch {

    // Generic method to search element in LinkedList
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        // Testing with LinkedList<Integer> for roll numbers
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        int searchRoll = 103;
        if (searchElement(rollNumbers, searchRoll)) {
            System.out.println("Roll number " + searchRoll + " found.");
        } else {
            System.out.println("Roll number " + searchRoll + " not found.");
        }

        // Testing with LinkedList<String> for names
        LinkedList<String> names = new LinkedList<>();
        names.add("Krisha");
        names.add("Rahul");
        names.add("Sneha");
        names.add("Amit");

        String searchName = "Sneha";
        if (searchElement(names, searchName)) {
            System.out.println("Name " + searchName + " found.");
        } else {
            System.out.println("Name " + searchName + " not found.");
        }
    }
}
