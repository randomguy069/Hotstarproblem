package com.KamathInc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int noTestCases = sc.nextInt();
        for(int test = 0 ; test <noTestCases ; test++){

            try{
                BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
                String myStr = br.readLine();
                char [] myChars = myStr.toCharArray();
                int loopedThru =0;
                String noOs = br.readLine();
                int noOfOps = Integer.parseInt(noOs);
                for(int mycharsl=0; mycharsl < myChars.length ; mycharsl++){
                    if(myChars[mycharsl] == 'a'||myChars[mycharsl] == 'e'||myChars[mycharsl] == 'i'||myChars[mycharsl] == 'o'||myChars[mycharsl] == 'u'){
                        loopedThru++;
                        if(noOfOps < loopedThru){
                            break;
                        }else{
                            int newascii1 = (int) myChars[mycharsl] + 1;
                            myChars[mycharsl] = (char) newascii1;
                        }

                    }
                }
                for(int i = 0 ;i< myChars.length ; i++){

                    System.out.print(myChars[i]);
                }
                System.out.println();

            }catch(Exception ex){
                System.out.println(ex);
            }





        }



       }






    }

