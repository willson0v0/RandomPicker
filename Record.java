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

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author willson
 */
public class Record {
    
    private HashMap<String ,String> recMap = new HashMap();
    private int order=-1;
    private String[] format;
    private String[] values;
    
    public Record(){
        this.recMap=null;
        this.order=-1;
        this.format=new String[]{};
        this.values=new String[]{};
    }
    
    public Record(HashMap mapIn){
        this.recMap=mapIn;
        this.order=-1;
        mapIn.keySet().toArray(format);
        mapIn.values().toArray(values);        
    }
    
    public Record(HashMap mapIn,int orderIn){
        this.recMap=mapIn;
        this.order=orderIn;
        mapIn.keySet().toArray(format);
        mapIn.values().toArray(values);
    }
    
    public Record(String[] in,boolean isFormat){
        this(in,isFormat,-1);
    }
    
    public Record(String[] in,boolean isFormat,int orderin){
        if(isFormat){
            this.format=in;
            int count=0;
            for(String i:in){
                this.recMap.put(i, "NO DATA");
                this.values[count]="NO DATA";
                count++;
            }
        }
        else{
            this.values=in;
            int count=0;
            for(String i:in){
                this.recMap.put("NO FORMAT", i);
                this.values[count]="NO DATA";
                count++;
            }
        }
        this.order=orderin;
    }
    
    public Record(String[] formatIn, String[] valuesIn,int orderin){
        this.format = formatIn;
        this.values = valuesIn;
        this.order=orderin;
        
        int shorter =formatIn.length<valuesIn.length ?formatIn.length:valuesIn.length;
        int longer = formatIn.length>valuesIn.length ?formatIn.length:valuesIn.length;
        boolean dataMissed = false;
        boolean formatMissed = false;
        //System.out.println(shorter+"\t"+longer);
        
        for(int i =0;i<longer;i++){
            //System.out.println(" rec for started :"+i);
            if(i<shorter){
                //System.out.println(formatIn[i]+ valuesIn[i]);
                recMap.put(formatIn[i], valuesIn[i]);
                
            }
            else if(shorter<formatIn.length){
                //System.out.println(formatIn[i]+ "\tNO DATA :"+(i-shorter));
                recMap.put(formatIn[i],"NO DATA :"+(i-shorter));
                dataMissed = true;
            }
            else{
                //System.out.println("NO FORMAT NAME :"+(i-longer)+"\t"+ valuesIn[i]);
                recMap.put("NO FORMAT NAME :"+(i-longer), valuesIn[i]);
                formatMissed = true;
            }
        }
        
        if(dataMissed){
            System.err.println("DATA LINE MISSING");
        }
        if(formatMissed){
            System.err.println("FORMAT LINE MISSING");
        }
        
        /*Set<Entry<String,String>> set = recMap.entrySet();
        for(Entry<String,String> i:set){
            System.out.println(i.getKey()+"\t"+i.getValue());
        }*/
    }
    
    public HashMap getRecMap(){
        return this.recMap;
    }
    
    public int getOrder(){
        if(order == -1){
            System.err.println("NO ORDER.RETUENED -1");
            return -1;
        }
        else{
            return order;
        }
    }
    
    public String[] getFormat(){
        return format;
    }
    
    public String[] getValues(){
        return values;
    }
    
    public void put(String key,String value){
        recMap.put(key, value);
    }
    
    public void delete(String key){
        recMap.remove(key);
    }
    
    public void deleteByValue(String value) throws Exception{
        Set<Entry<String, String>> temp = recMap.entrySet();
        for(Entry<String, String> i:temp){
            if(i.getValue() == null         ? value == null : i.getValue().equals(value)){
                recMap.remove(i.getKey());
                return;
            }
        }
        throw new Exception("NO SUCH VALUE!");
        
    }
    
    public String getValue(String key){
        if(recMap.containsKey(key)){
            return recMap.get(key);
        }
        else{
            return "NO DATA";
        }
    }
    
    public String getKey(String value){
        Set<Entry<String,String>> set=recMap.entrySet();
        
        for(Entry<String,String> temp:set){
            if(temp.getValue() == null ? value == null : temp.getValue().equals(value)){
                return temp.getKey();
            }
        }
        return "NO SUCH VALUE";
    }
}
