class UnderAge extends Exception{
    public UnderAge(int age){
        super("Under Age: " + age + " Years");
    }
}

public class exceptionDemo{
    static void test(int age) throws UnderAge{
        if(age<18)
            throw new UnderAge(age);
        System.out.println("Your age is " + age);
    }

    public static void main(String [] args) {
        try{
            test(Integer.parseInt(args[0]));
        }
        catch(UnderAge ua){
            System.out.println(ua.getMessage());
        }
        finally{
            System.out.println("Program Completed Successfully!");
        }
        
    }
}
