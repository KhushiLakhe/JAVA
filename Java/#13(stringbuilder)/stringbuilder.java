public class stringbuilder{
    public static void main(String[] args){
StringBuilder sb= new StringBuilder("tony");
System.out.println(sb);
System.out.println(sb.charAt(0));// char at index zero
sb.setCharAt(0,'p'); // to change char at certain index 
System.out.println(sb);
sb.insert(0,'s');
System.out.println(sb);
sb.insert(2,'o');
System.out.println(sb);
sb.delete(0,3); // ending index is always non inclusive i.e it will delete elemets at index 0,1,2
System.out.println(sb);
sb.append('y');//append means to add at the end
System.out.println(sb);
}
}