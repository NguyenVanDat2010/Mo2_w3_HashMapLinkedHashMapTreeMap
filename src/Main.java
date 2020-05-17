import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Tạo HashMap trong main để lưu danh sách sinh viên
        HashMap<String,Integer> myHashMap=new HashMap<>();
        myHashMap.put("Smith", 30);
        myHashMap.put("Anderson", 31);
        myHashMap.put("Lewis", 29);
        myHashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(myHashMap + "\n");

        //Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String ,Integer>myTreeMap=new TreeMap<>(myHashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(myTreeMap);

        //Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String,Integer> myLinkedHashMap=new LinkedHashMap<>();
        myLinkedHashMap.put("Smith", 30);
        myLinkedHashMap.put("Anderson", 31);
        myLinkedHashMap.put("Lewis", 29);
        myLinkedHashMap.put("Cook", 29);
        System.out.println("\nThe age of Lewis is " + myLinkedHashMap.get("Lewis"));
    }
}
