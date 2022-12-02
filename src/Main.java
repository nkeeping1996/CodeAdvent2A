import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        int points = 0;
        boolean win = false;
        boolean tie = false;
        ArrayList<String> rounds = new ArrayList<String>();

        File f = new File("src/CodeAdvent2AData");
        FileReader fd = new FileReader(f);
        BufferedReader br = new BufferedReader(fd);
        String line;
        while ((line = br.readLine())!=null) {
            rounds.add(line);
        }


        //Puzzle 1
//        for(String s : rounds){
//            if((s.charAt(0)=='A' && s.charAt(2)=='Y') || (s.charAt(0)=='B' && s.charAt(2)=='Z') || (s.charAt(0)=='C' && s.charAt(2)=='X')){
//                points+=6;
//            }
//            else if(s.charAt(0) == 'C' && s.charAt(2) == 'Z' || s.charAt(0) == 'A' && s.charAt(2) == 'X' || s.charAt(0) == 'B' && s.charAt(2) == 'Y'){
//                points+=3;
//            }
//            if(s.charAt(2)=='X'){
//                points+=1;
//            }
//            else if(s.charAt(2)=='Y'){
//                points+=2;
//            }
//            else{
//                points+=3;
//            }
//        }

        //Puzzle 2

        for(String s : rounds){
            //indicates we need to tie
            if(s.charAt(2)=='Y'){
                points+=3;
                if(s.charAt(0)=='A'){
                    points+=1;
                }
                else if(s.charAt(0)=='B'){
                    points+=2;
                }
                else{
                    points+=3;
                }
            }
            //indicates we need to win
            else if(s.charAt(2)=='Z'){
                points+=6;
                if(s.charAt(0)=='A'){
                    points+=2;
                }
                else if(s.charAt(0)=='B'){
                    points+=3;
                }
                else{
                    points+=1;
                }
            }
            else {
                if (s.charAt(0) == 'A') {
                    points += 3;
                } else if (s.charAt(0) == 'B') {
                    points += 1;
                } else {
                    points += 2;
                }
            }
        }
        System.out.println(points);
    }
}