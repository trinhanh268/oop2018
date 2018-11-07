package week9;
import java.io.*;
import java.util.*;

public class Utils {
    public static String readContentFromFile(String path)
    {
        File f = new File(path);
        FileReader fr = null;
        String a = "";
        String line = "";
    try{
        fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        while((line = br.readLine())!=null){
            a+=line;
        }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return a;
    }
    public static void writeContentToFile(String path)
    {
        File f = new File(path);
        try {
            FileWriter fw = new FileWriter(f);
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            fw.write(a);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void cwriteContenttoFile(String path){
        File f = new File(path);
        try {
            FileWriter fw = new FileWriter(f,true);
            Scanner input = new Scanner(System.in);
            fw.write(input.nextLine());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String filename){
        File f = new File(folderPath+"/"+filename);
        try {
            FileReader fr = new FileReader(f);
            System.out.println("Success");
          } catch (FileNotFoundException e) {
            System.out.println("Cannot find file: "+ filename);
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(Utils.readContentFromFile("week_9.txt"));
       Utils.writeContentToFile("week_9.txt");
      File f = Utils.findFileByName("C:\\Users\\Trinh Duc Anh\\Documents\\NetBeansProjects\\Da\\src","week_9.txt");
    }
}
