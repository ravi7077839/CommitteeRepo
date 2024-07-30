public class StringManipulation {
    
    public static void getLength(String str) {
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
    }

    public static void findIndexOf(String str, String target) {
        System.out.println("Original String: " + str);
        System.out.println("Index: " + str.indexOf(target));
    }

    public static void findLastIndexOf(String str, String target) {
        System.out.println("Original String: " + str);
        System.out.println("Index: " + str.lastIndexOf(target));
    }

    

    

    public static void main(String[] args) {
        getLength("Hello World");
        findIndexOf("Hello World", "World");
        findLastIndexOf("Hello World World", "World");
        
        
    }
}
