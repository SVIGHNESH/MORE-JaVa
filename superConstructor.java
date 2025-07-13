class superConstructorSuper{
    superConstructorSuper(){
            System.out.println("The Super Constructor Executes");
    }
}
public class superConstructor extends superConstructorSuper {
    superConstructor(){
       
        System.out.println("This Constructor is Called");
    }

    
    public static void main(String[] args) {
        superConstructor sC = new superConstructor();
    }

}
