package inputoutputlab;

import java.io.*;
import java.util.*;

/**
 *
 */
public class InputOutputLab {

    public static void main(String[] args) throws IOException {

//        readFile();
        readFileToList2();
//         readFileToList();
//        writeFile();
//        readFile2();

/// put more code here
//         boolean append = false;
//         file = null;
//         
//	  File file2 = new File(File.separatorChar + "temp" + File.separatorChar
//                + "Lab1.txt");	
//     
//	  PrintWriter out = new PrintWriter(
//						new BufferedWriter(
//						new FileWriter(file2, append)));
//	  
//	
//          
//          out.print("John Porter");
//           System.out.println("Wrote file to: " + file2.getAbsolutePath());
//	
//	out.close();
// John Porter
//2020 Greenfield Ave.
//Milwaukee, WI 27300
//Ann Thompson
//1010 Franklin Road
//Chicago, IL 34400
//Peter Skalsky
//1200 Moorland Road
//Brookfield, WI 53700
    }

    public static void readFile() {
        File file = new File(File.separatorChar + "temp" + File.separatorChar
                + "Lab2.txt");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();  // strips out any carriage return chars
            }

        } catch (IOException ioe) {
            System.out.println("Problem with reading a file.");
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }
//         br.close();
    }

    public static void writeFile() throws IOException {
        boolean append = false;

        File file2 = new File(File.separatorChar + "temp" + File.separatorChar
                + "Lab1.txt");

        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file2, append)));

        out.print("John Porter");
        System.out.println("Wrote file to: " + file2.getAbsolutePath());

        System.out.println("Absolute Path: " + file2.getAbsolutePath());
        System.out.println("Canonical Path: " + file2.getCanonicalPath()); // what's the difference?

        out.close();
    }

    public static void readFileToList() {
        File file = new File(File.separatorChar + "temp" + File.separatorChar
                + "Lab2.txt");

        List<String> list = new ArrayList<>();

//        list.add("A");
//        list.add("B");
//
//        for (String s : list) {
//            System.out.println(s);
//        }
        List<List> list2 = new ArrayList<>();

//        list2.add(list);
//        list = null;
//        list.add("C");
//        list.add("D");
//        list2.add(list);
//        for (List l : list2) {
//            for (Object l1 : l) {
//                System.out.println(l1);
//            }
//
//        }
//        Array
//        List<ArrayList<>> list2 = new ArrayList<>(list);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));

            String line; // = br.readLine();

            int lineCount = 0;
//            list.add(line);
            do {
//                System.out.println(line);
                line = br.readLine();
                lineCount++;
                if (lineCount <= 3) {
                    list.add(line);
                } else {
                    list2.add(list);
                    list = new ArrayList<>();
                    lineCount = 1;
                    list.add(line);
                }

            } while (line != null);

        } catch (IOException ioe) {
            System.out.println("Problem with reading a file.");
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }

        for (List l : list2) {
            for (Object l1 : l) {
                System.out.println(l1);
            }

        }
        System.out.println("---------------------------------------");
        System.out.println(list2.get(1).get(0)+": "+list2.get(1).get(2));
        String line3 = (String)list2.get(1).get(2);
        String[] listOfStrings = line3.split(",");
        for(String s: listOfStrings){
            System.out.println(s.trim());
        }
        
    }
    
      public static void readFileToList2() {
        File file = new File(File.separatorChar + "temp" + File.separatorChar
                + "Lab2.txt");

        List<String> list = new ArrayList<>();

//        list.add("A");
//        list.add("B");
//
//        for (String s : list) {
//            System.out.println(s);
//        }
        List<List> list2 = new ArrayList<>();

//        list2.add(list);
//        list = null;
//        list.add("C");
//        list.add("D");
//        list2.add(list);
//        for (List l : list2) {
//            for (Object l1 : l) {
//                System.out.println(l1);
//            }
//
//        }
//        Array
//        List<ArrayList<>> list2 = new ArrayList<>(list);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));

            String line; // = br.readLine();

            int lineCount = 0;
//            list.add(line);
            do {
//                System.out.println(line);
                line = br.readLine();
                lineCount++;
                if (lineCount <= 3) {
                    list.add(line);
                } else {
                    list2.add(list);
                    list = new ArrayList<>();
                    lineCount = 1;
                    list.add(line);
                }

            } while (line != null);

        } catch (IOException ioe) {
            System.out.println("Problem with reading a file.");
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }

        for (List l : list2) {
            for (Object l1 : l) {
                System.out.println(l1);
            }

        }
        System.out.println("---------------------------------------");
        System.out.println(list2.get(1).get(0)+": "+list2.get(1).get(2));
        String line3 = (String)list2.get(1).get(2);
        String[] listOfStrings = line3.split(",");
        for(String s: listOfStrings){
            System.out.println(s.trim());
        }
        
    }

    public static void readFile2() {
        File file = new File(File.separatorChar + "temp" + File.separatorChar
                + "Lab2.txt");

//        BufferedReader br = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();  // strips out any carriage return chars
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File: " + file.getAbsolutePath() + " not found.");
        } catch (IOException ioe) {
            System.out.println("Problem with reading a file.");
        }
//         br.close();
    }
}
