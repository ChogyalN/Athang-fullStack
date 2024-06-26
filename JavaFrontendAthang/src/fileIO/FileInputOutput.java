package fileIO;

import java.io.*;
public class FileInputOutput {

    public static void main(String[] args) {
        FileInputOutput fo = new FileInputOutput();
        fo.execute();
    }

    private void execute() {
        createFile();
        //writeIntoFile();
        // updateFile();
        readFromFile();
//        deleteFile();
    }

    private void deleteFile() {
        File myFile = new File("01-athang-fileIO.txt");
        myFile.delete();
    }

    private void readFromFile() {
        File myFile = new File("01-athang-fileIO.txt");
        try {
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateFile() {
        File myFile = new File("01-athang-fileIO.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(myFile, true);
            fileWriter.write("This is the second sentence written in the file. \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void writeIntoFile() {
        File myFile = new File("01-athang-fileIO.txt");
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(myFile);
            fileWriter.write("Chogyal \n");
            fileWriter.write("Changzamtok \n");
            fileWriter.write("17398529 \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void createFile() {
        File myFile = new File("01-athang-fileIO.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("File is created!!");
            }else{
                System.out.println("File IO java - Athang");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
