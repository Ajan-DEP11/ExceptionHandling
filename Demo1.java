import java.io.BufferedOutputStream;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        writeFile2();
        writeFile1();
        
        

    }

    public static void writeFile2(){
        File file = new File("Something2.txt");

        try{
            file.createNewFile();
            FileOutputStream fis = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fis);
            try{
                String content = "Tiskdhlkkn;bf;BJBJFBjk";
                bos.write(content.getBytes());
            }finally{
                bos.close();
            }
        }catch(IOException e){
            e.printStackTrace();

        }
    }

     public static void writeFile1(){
        File file = new File("Something1.txt");

        try{
            file.createNewFile();
            FileOutputStream fis = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fis);
            try{
                String content = "Tiskdhlkkn;bf;BJBJFBjk";
                bos.write(content.getBytes());
            }finally{
                bos.close();
            }
        }catch(IOException e){
            e.printStackTrace();

        }
    }
}
