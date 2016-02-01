/*
 * Copyright (C) 2016 willson.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author willson
 */
public class Data {
    private final File file;
    private final String fileName;
    private final Scanner scanner;
    private final String separator;
    private String[] format;
    private HashMap<Integer, Record> map=new HashMap();
    
    public Data(String FileNamein) throws Exception{
        this(FileNamein,"\t");
    }
    
    public Data(String fileNamein,String separatorin) throws Exception{
        this(new File(fileNamein),separatorin);
    }
    
    public Data(File filein,String separatorin) throws FileNotFoundException{
        scanner = new Scanner(filein);
        file = filein;
        separator = separatorin;
        fileName = filein.getName();
        
        //System.out.println("data init done.");
        
        if(!scanner.hasNextLine()){
            System.err.println("LESS THAN ONE LINE!");
        }
        
        //System.out.println("read format");
        format=scanner.nextLine().toLowerCase().split(separator);
        //System.out.print("read format done\r\nformat = ");
        //for (String format1 : format) {
        //    System.out.print(format1+"\t");
        //}
        //System.out.println();
        
        while(scanner.hasNextLine()){
            //System.out.println(mapSize());
            //String[] dat = scanner.nextLine().split(separator);
            //System.out.print("data = ");
            //for(String i : dat){
            //    System.out.print(i +'\t');
            //}
            //System.out.print("\r\ndata end.\r\n");
            
            map.put(mapSize(), new Record(format,scanner.nextLine().split(separator),mapSize()));
            //break;
        }
        /*
        Set<Entry<Integer,Record>> set = map.entrySet();
        for(Entry<Integer,Record> i :set){
            System.out.println(i.getKey());
            Set<Entry<String,String>> se = i.getValue().getRecMap().entrySet();
            for(Entry<String,String> j:se){
                System.out.println(j.getKey()+j.getValue());
            }
        }*/
    }
    
    public Record getByV_K(String value,String key){
        Set<Entry<Integer,Record>> set = map.entrySet();
        for(Entry<Integer,Record> i:set){
            if(i.getValue().getValue(key).equals(value)){
                return i.getValue();
            }
        }
        return null;
    }
    
    public File getFile(){
        return file;
    }

    public final int mapSize(){
        if(map!=null){
            return map.size();
        }
        else{
            return 0;
        }
    }
    
    public HashMap getMap(){
        return map;
    }
    
    public String[] getFormat(){
        return format;
    }
    
    public Record getRecord(int order){
        if(map!=null){
            if(!map.containsKey(order)){
                return (Record)null;
            }
            return map.get(order);
        }
        return null;
    }
    
    public int getOrder(Record input){
        Set<Entry<Integer,Record>> set = map.entrySet();
        for(Entry<Integer, Record> temp:set){
            if(temp.getValue()==input){
                return temp.getKey();
            }
        }
        
        System.err.println("NO RECORD");
        return -1;
    }
    
    public void add(Record in){
        add(in,map.size());
    }
    
    public void add(Record in,int order){
        map.put(order, in);
    }
}
