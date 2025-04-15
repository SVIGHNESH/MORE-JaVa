class IIB{
    int x ;
    int y ;

    IIB(){
        System.out.println("Constructor is called.");

    }
    {System.out.println("Instance Intializer Block is Invoked.");}

    public static void main(String []args){
        IIB obj1 = new IIB();
        IIB obj2 = new IIB();
    }
}