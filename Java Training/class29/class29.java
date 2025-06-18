package class29;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class class29 {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");

           FileWriter writeFile = new FileWriter("new.txt");

            // if(file.createNewFile()){
            //     System.out.println(" File Created : "+ file.getName());
            // }else
            // {
            //   System.out.println("File already exists. ");
            // }
            writeFile.write(" This File Is Created By Anand Patel "+"\n");
            writeFile.write(" Ankit----->An**li ");

            writeFile.close();

            FileReader readfile = new FileReader("new.txt");
            Scanner sc = new Scanner(readfile);

            while(sc.hasNextLine()){
                String Data = sc.nextLine();
                System.out.println(Data);
            }
            sc.close();

            if(file.delete())
            {
                System.out.println("Deleted the file "+ file.getName());
            }else
            {
                System.out.println("Failed To deleted The File "+ file.getName());

            }
            
        } catch (Exception e) {
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }


}
