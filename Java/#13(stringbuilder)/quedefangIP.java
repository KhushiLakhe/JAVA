public class quedefangIP {
    public static String defangIPaddr (String address){
return address.replace(".","[.]");
    }
    public static void main(String[] args) {
        String address1 = "1.1.1.1";
    String address2="53.2.61.0";
    System.out.println(defangIPaddr(address1));
    System.out.println(defangIPaddr(address2));    
}
}
