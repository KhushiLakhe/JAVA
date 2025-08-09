public class methods {
    public static void main(String[] args) {
        // string declaration
        String name="hello";
        String fullname="khushi lakhe";
        String sentence="khushi lakhe is a good girl";
        String full = name +" "+fullname;
        System.out.println(full.length());     
        // to print charachter at ever index
        for(int i=0;i<full.length();i++){
            System.out.println(full.charAt(i));
        }
        // string name.substring(starting index,ending index)
        String a=sentence.substring(7,12);//keep ending index such that it will print till prior index like in this case it will print till 11 index 
String b=sentence.substring(0,7);
String c=sentence.substring(0,sentence.length());
String d=sentence.substring(11);// if not written ending index then it will by default take the last index as the ending
System.out.println(a);    
System.out.println(b);    
System.out.println(c);    
System.out.println(d);    
}
}