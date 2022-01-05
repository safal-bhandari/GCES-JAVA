import java.io.*;
class MergeFileFromDesktop {
 
    public static void main(String[] args) throws IOException
    {
        File dir = new File("/home/sujit/Desktop/");
        PrintWriter pw = new PrintWriter("file.txt");
        String[] fileNames = dir.list();
        for (String fileName : fileNames) {
            pw.println(fileName);
            pw.flush();
        }
        System.out.println("Reading from all files"+" in directory " + dir.getName() + " Completed");
    }
}
