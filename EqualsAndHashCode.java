public class EqualsAndHashCode {
    public static void main(String []args){
        String a = new String("This");
        String b = new String("This");

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
