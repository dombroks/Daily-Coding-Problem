/*
This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
<<<<<<< HEAD
=======

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

*/
>>>>>>> 9cc0ef5f0320f9ad50bcda82601a5e5e2a4e9df7

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

*/

public class Facebook_Problems_00 {
    public static int productArray(String message) {
        int counter = 1 ;
        for (int i = 0; i<message.length()-1;i ++ ){
            int firstNumber =Integer.parseInt(String.valueOf(message.charAt(i))) ;
            int secondNumber =Integer.parseInt(String.valueOf(message.charAt(i+1))) ;
            if ((firstNumber * 10 + secondNumber) < 27){
                counter ++ ;
            }
        }
        return counter ;

    }



    public static void main(String[] args) {

        System.out.println(productArray("111"));

    }
}

