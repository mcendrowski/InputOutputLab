/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MCENDROWSKI
 */
public class ReadFileToList {

    public static void main(String[] args) {
        readFileToList2();
    }

    public static void readFileToList2() {
        File file = new File(File.separatorChar + "temp" + File.separatorChar
                + "Lab2.txt");

        List<String> lines = new ArrayList<>();

        List<List> list2 = new ArrayList<>();

        Map<Integer, MailingAddress> map = new HashMap<>();

//        BufferedReader br;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine();

//            int lineCount = 0;
            while (line != null) {
//                System.out.println(line);

                lines.add(line);
                line = br.readLine();
//                lineCount++;
//                if (lineCount <= 3) {
//                    lines.add(line);
//                } else {
//                    list2.add(lines);
//                    lines = new ArrayList<>();
//                    lineCount = 1;
//                    lines.add(line);
//                }

            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File: " + file.getAbsolutePath() + " not found.");
        } catch (IOException ioe) {
            System.out.println("Problem with reading a file.");
        }

        for (String s : lines) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------");
        List<List<String>> listOfRecords = createRecordList(lines,3);
        
        MailingAddress ma;
        Map<String,String> mapOfFields;
        Map<Integer,Map> mapOfAddresses = new HashMap<>();
//       for (List l: listOfRecords){
//         for (int i=0;i<listOfRecords.size();i++){  
//           ma = recordToMailingAddress(listOfRecords.get(i),i+1);
////           ma = recordToMailingAddress(l,1);
//           mapOfFields = mailingAddressToMap(ma);
//           mapOfAddresses.put(Integer.parseInt(mapOfFields.get("mailingId")),mapOfFields);
////           System.out.println(l);
//           
//       }
//       System.out.println("-------------------------------------------------");
////        System.out.println(mapOfAddresses.get(2).get("firstName")+" "+mapOfAddresses.get(2).get("lastName")+" state: "+mapOfAddresses.get(2).get("state"));
//       
//         System.out.println(mapOfAddresses.get(1).get("state"));
       
       System.out.println("-------------------------------------------------");
       ma = recordToMailingAddress(listOfRecords,2);
        
        System.out.println(ma);
        System.out.println(ma.getFirstName()+" "+ma.getLastName()+" state: "+ma.getState());
        
//       Map<Integer,Map> mapOfAddresses = new HashMap<>();
        
        
       
        mapOfFields = mailingAddressToMap(ma);
        
        mapOfAddresses.put(Integer.parseInt(mapOfFields.get("mailingId")),mapOfFields);
        
        Set<String> keys = mapOfFields.keySet();
        
        for(String key: keys){
            System.out.println(key);
        }
        
        System.out.println("\n--------------- looping through the keys ----------------------------\n");
        for(String key : keys) {
            String emp = mapOfFields.get(key);
            System.out.println(emp.toString());
        }
        
         System.out.println("\n--------------- looping through the keys but from collection ----------------------------\n");
        Collection<String> keys2 = mapOfFields.keySet();
         for(String key : keys2) {
            String emp = mapOfFields.get(key);
            System.out.println(emp.toString());
        }
        
        System.out.println("\n--------------- looping through values ---------------------------------\n");
        
        Collection<String> values = mapOfFields.values();
        for(String value: values){
            System.out.println(value);
        }
        
        
//        map.put(mapOfFields.g, ma)
        
        
        

//        try {
//            br = new BufferedReader(new FileReader(file));
//
//            String line; // = br.readLine();
//
//            int lineCount = 0;
////            lines.add(line);
//            do {
////                System.out.println(line);
//                line = br.readLine();
//                lineCount++;
//                if (lineCount <= 3) {
//                    lines.add(line);
//                } else {
//                    list2.add(lines);
//                    lines = new ArrayList<>();
//                    lineCount = 1;
//                    lines.add(line);
//                }
//
//            } while (line != null);
//
//        } catch (IOException ioe) {
//            System.out.println("Problem with reading a file.");
//        } finally {
//            try {
//                br.close();
//            } catch (Exception e) {
//
//            }
//        }
//        for (List l : list2) {
//            for (Object l1 : l) {
//                System.out.println(l1);
//            }
//
//        }
//        System.out.println("---------------------------------------");
//        System.out.println(list2.get(1).get(0)+": "+list2.get(1).get(2));
//        String line3 = (String)list2.get(1).get(2);
//        String[] listOfStrings = line3.split(",");
//        for(String s: listOfStrings){
//            System.out.println(s.trim());
//        }
    }

    public static List<List<String>> createRecordList(List<String> list, int listSize) {

        List<List<String>> recordList = new ArrayList<>();
        List<String> lineList = new ArrayList<>();

        lineList.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {

            lineList.add(list.get(i));
            if (i % 3 == 2) {
                recordList.add(lineList);
                lineList = new ArrayList<>();
            }

        }
        return recordList;
    }
    public static Map recordListToMap(List<List<String>> list){
        Map<Integer,MailingAddress> map = new HashMap<>();
        return map;
    }
    
//    public static MailingAddress recordToMailingAddress(List<List<String>> list,int mailingNumber){
        public static MailingAddress recordToMailingAddress(List<List<String>> list,int mailingNumber){
        MailingAddress ma = new MailingAddress();
        String[] rowElements;
        String row1;        
        row1= list.get(mailingNumber-1).get(0);
//        row1 =lines.get(mailingNumber-1).get(0);
        rowElements = row1.split(" ");        
        ma.setFirstName(rowElements[0].trim());
        ma.setLastName(rowElements[1].trim());
        
        String row2;        
        row2= list.get(mailingNumber-1).get(1);
        rowElements = row2.split(" ");
        
        int numberOfElements = rowElements.length;
        String street="";
        for (int i=0;i<numberOfElements-2;i++){
            street+=rowElements[i].trim()+" ";
        }
        street+=rowElements[numberOfElements-2].trim();        
       
        ma.setStreet(street);
        ma.setAddress(rowElements[numberOfElements-1].trim());
        
        String row3;        
        row3= list.get(mailingNumber-1).get(2);
        rowElements = row3.split(" ");
        
        ma.setCity(rowElements[0].replace(",", "").trim());
        ma.setState(rowElements[1].trim());
        ma.setZipcode(rowElements[2].trim());
        ma.setMailingId(mailingNumber);
        
        return ma;
    }
    public static Map<String,String> mailingAddressToMap(MailingAddress ma){
        Map<String,String> map = new HashMap<>();
        
        map.put("mailingId", Integer.toString(ma.getMailingId()));
        map.put("firstName", ma.getFirstName());
        map.put("lastName", ma.getLastName());
        map.put("street", ma.getStreet());
        map.put("address", ma.getAddress());
        map.put("city", ma.getCity());
        map.put("state", ma.getState());
        map.put("zipcode", ma.getZipcode());
        
        return map;
    }
}
