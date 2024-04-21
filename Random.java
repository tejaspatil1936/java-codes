public class Random {
    public static void main(String[] args) {
        int n = 124;
        int sum = 0;
        int product = 1;
        int originalNumber = n;
        while(n > 0)
        {
            int last_digit = n%10;
            sum = sum + last_digit;
            product = product * last_digit;  
            n/=10; 
        }
        if(sum == product)
        {
            System.out.println(originalNumber + " its a spy number");
        }
        else{
            System.out.println(originalNumber + " its not a spy number");
        }
    }
}
