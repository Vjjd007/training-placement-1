import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N % 2 == 1)
    System.out.println("Weird");
    else{
        if (2 <= N && N <= 5)
        System.out.println("Not Weird");
        else if (20 < N)
        System.out.println("Not Weird");
        else 
        System.out.println("Weird");
    }
}
    }