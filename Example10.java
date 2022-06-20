// Exanmple of BufferedOutput Stream for reading into a file

import java.io.*;
public class Example10{
public static void main(String args[]){
try {
FileInputStream fin = new FileInputStream("D:/Mihir/OOPJ Programs/Demo12/output.dat");
BufferedInputStream bin = new BufferedInputStream(fin);
int i;
while((i = bin.read())!=-1){
System.out.print((char)i);
}
bin.close();
fin.close();
}
catch(Exception e){
System.out.println(e);
}
}
}

