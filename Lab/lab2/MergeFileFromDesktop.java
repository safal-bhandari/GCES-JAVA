import java.io.*;
class MergeFileFromDesktop {
 
    public static void main(String[] args) throws IOException
    {
        File dir = new File("/home/sujit/Desktop/Collage Lab/Java/JavaCollageGces/Lab/");
        PrintWriter pw = new PrintWriter("output.txt");
        String[] fileNames = dir.list();
        for (String fileName : fileNames) {
            pw.println(fileName);
            pw.flush();
        }
        System.out.println("Reading from all files"+" in directory " + dir.getName() + " Completed");
    }
}
