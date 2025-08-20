import java.util.HashMap;

public class PhoneDirectory {
    
    HashMap<String, String> phoneBook = new HashMap<>();

    public void addContact(String name, String number){
        phoneBook.put(name, number);
        System.out.println(name + " added to Phone Book");
    }

    public void searchContact(String name){
        String number = phoneBook.get(name);
        if (number != null) {
            System.out.println(name + " number is " + number);
        } else {
            System.out.println(name + " not found in Phone Book");
        }
    }

    public void removeContact(String name){
        if (phoneBook.remove(name) != null) {
            System.out.println(name + " contact deleted");
        } else {
            System.out.println(name + " not found in Phone Book");
        }
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectoryObject = new PhoneDirectory();
        phoneDirectoryObject.addContact("Dileep", "8179724985");
        phoneDirectoryObject.addContact("Naveen", "8179724215");
        phoneDirectoryObject.addContact("Mahesh", "8179654985");
        phoneDirectoryObject.addContact("Hemanth", "8154724985");
        phoneDirectoryObject.searchContact("Dileep");
        phoneDirectoryObject.removeContact("Mahesh");
        phoneDirectoryObject.searchContact("Mahesh");
    }
}
