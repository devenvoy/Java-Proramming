import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Test {


    public static void main(String[] args){

        C obj = new C();

        //obj.stringMethods();

        // obj.hashMapMethods();

        // obj.stringBfMethod();

        obj.arrayMethods();
        

    }
}


abstract class A{
    abstract void show();
}

class b extends A{

    @Override
    public void show(){

        final double pi;

        System.out.println(Math.max(20,50));
        Random r = new Random();
        int r1 = (r.nextInt()) * -1;
        System.out.println(r1);
    
        System.out.println(Math.abs(r1));
        System.out.println(Math.sqrt(Math.abs(r1)));
        System.out.println(r.nextDouble());
        System.out.println(r.nextBoolean());


        C obj1 = new C();
        obj1.num1 = 78;
        C obj2  = new C();
        obj2.copy(obj1);
        System.out.println(obj2.num1);
    }
    
}

class Employee implements Comparator<Employee>{
    int salary;
    String name;
    String dept;

    Employee(int a , String b, String c){
        this.salary = a;
        this.name =b;
        this.dept = c;
    }

    public String toString(){
        return "name: "+name+"\n"+
        "Dept: "+dept+"\n"+
        "Salary :"+salary+"\n";
    }
    
    Employee(){}

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.salary, o2.salary);
    }
}

class C extends A{


    int num1;

    public void copy(C c1){
        this.num1 = c1.num1;
    }

    void arrayMethods(){
        Integer[] num = {80,99,69,1,5};

        String[] strs = {"90","98","80","92"};

        Employee e1 = new Employee(100, "Dev", "It");
        Employee e2 = new Employee(200, "Smit", "IOt");
        Employee e4 = new Employee(150, "Haesh", "Diamond");
        Employee[] emps = {e4,e2,e1};
 
        Arrays.sort(num);
        Arrays.sort(strs);
        printArray(strs);
        printArray(num);
        //Arrays.sort(emps,new Employee());
        //System.out.println(emps[0].toString());
        //System.out.println(emps[1].toString());
        
    }

    

    public <T> void printArray(T[] arr){
        if (arr == null) {
            System.out.println("Empty arr");
        }

        int len = arr.length;
        for(int i = 0; i < len ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    void stringBfMethod(){
        
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Devansh");
        sb.append(" Amdavadwala");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        
        sb.insert(7, " Jignesh");
        System.out.println(sb);
        sb.replace(7,15, " Shital");
        System.out.println(sb);
        sb.delete(7, 15);
        System.out.println(sb);
        System.out.println(sb.reverse());
        

    }

    void hashMapMethods(){
       HashMap<String,String> map = new HashMap<String,String>();
       map.put("Dev", "King");
       map.put("Dev1", "King1");

       System.out.println(map.size());
       System.out.println(map);
       System.out.println(map.get("Dev"));
       System.out.println(map.getOrDefault("Dev4","default value"));
       System.out.println(map.containsKey("Dev"));
       System.out.println(map.keySet());
       System.out.println(map.remove("Dev1"));
       System.out.println(map.entrySet());

    }

    void stringMethods(){
        String name = "Devanasah";

        System.out.println(name.charAt(3));
        System.out.println(name.equals("dev"));
        System.out.println(name.equals("Devansh"));
        System.out.println(name.compareTo("Devansh"));
        System.out.println(name.compareTo("Dev"));
        System.out.println(name.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.length());
        System.out.println("   "+name+"    ".trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(3));
        System.out.println(name.substring(0,3));
        System.out.println(name.replace("a","z"));
        System.out.println(name.replaceFirst("a","z"));

    }

    @Override
    public void show(){

    }
}