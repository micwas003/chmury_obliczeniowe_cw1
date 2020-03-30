public class ChmuryObliczeniowe {
    public static void main(String[] args) {
        System.out.printf("Java version: %s", System.getProperty("java.version"));
        
        System.out.println();
        
        DEV1 author1 = new DEV1();
        System.out.println(author1.author);
        
        DEV2 author2 = new DEV2();
        System.out.println(author2.author);
    }
}