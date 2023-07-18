import java.util.*;

public class Task_1{
    private HashMap<String,List<String>> phoneBook;

    public Task_1(){
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber){
        List<String> phoneNumbers = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public void removeContact(String name){
        phoneBook.remove(name);
    }

    public void printPhoneBook(){
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
    

    Collections.sort(entries, new Comparator<Map.Entry<String, List<String>>>(){
        @Override
        public int compare(Map.Entry<String, List<String>>o1, Map.Entry<String, List<String>>o2){
            return o2.getValue().size() - o1.getValue().size();
        }
    });

    for (Map.Entry<String, List<String>> entry : entries){
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}

public static void main(String[] args) {
 Task_1 phoneBook = new Task_1();
 phoneBook.addContact("Rudi", "123456789");
 phoneBook.addContact("Rudi", "987654321");  
 phoneBook.addContact("Gogi", "234567890");  
 phoneBook.addContact("Gogi", "345678901");  
 phoneBook.addContact("Meri", "456789012");  
 phoneBook.addContact("Barbra", "567898976");
 
 phoneBook.printPhoneBook();
}
}