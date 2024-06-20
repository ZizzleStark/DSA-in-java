public class typecasting {
    public static void main(String[] args) {
        //type casting incompatible types
        int num = (int)('d');
        System.out.println(num);

        //automatic type promotion in expressions

        int num1=65537;   // it will give num1%256
        byte num2=(byte)(num1);
        System.out.println(num2);

    }
}
