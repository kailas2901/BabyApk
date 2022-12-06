import java.io.*;
class CreateFileFolder{

public static void main(String[]args) throws IOException{


File f2 = new File("file2");
File f3 = new File("file2/file1.txt");


f2.mkdir();
f3.createNewFile();

FileWriter fw = new FileWriter(f3);
fw.write("Hello guys");
fw.flush();
fw.close();
System.out.println("text inserted");

System.out.println("Folder and File created");

}

}