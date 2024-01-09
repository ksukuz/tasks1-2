package task1;

import java.util.Scanner;

public class IPadresses {

    public static void main(String[] args) {

        String IpV4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        IpV4 = sc.nextLine();
        try{
            if(IpV4.contains("."))
                System.out.println("Result: " + convertIP(IpV4));
            else System.out.println("Result: " + convertIP(Long.parseLong(IpV4)));
        }catch (IllegalArgumentException iae){
            System.out.println("Incorrect value!");
        }


    }

    public static long convertIP(String IpV4){
        String[] octets = IpV4.split("[.]");
        if(octets.length != 4)
            throw new IllegalArgumentException("IPv4 is not correct!");

        return Long.parseLong(octets[0])*16777216+Long.parseLong(octets[1])*65536+Long.parseLong(octets[2])*256+Long.parseLong(octets[3]);
    }

    public static String convertIP(long IpV4){
        StringBuilder sb = new StringBuilder();
        long firstOCT = IpV4/16777216;
        long secondOCT = (IpV4 - firstOCT*16777216)/65536;
        long thirdOCT = ((IpV4 - firstOCT*16777216)-secondOCT*65536)/256;
        long fourthOCT = ((IpV4 - firstOCT*16777216)-secondOCT*65536)-thirdOCT*256;
        sb.append(firstOCT).append(".").append(secondOCT).append(".").append(thirdOCT).append(".").append(fourthOCT);

        return sb.toString();
    }
}
