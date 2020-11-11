package filePrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedHashMap;
import java.util.Map;
public class CommonWords {
	 //******Common words from two files*************//
	public static void main(String[] args) {
	BufferedReader br=null;
	   Map<String,Integer> m=new LinkedHashMap<String,Integer>();
	try{
	br=new BufferedReader(new FileReader("C:\\inputfile\\firstFile.txt"));
	String line="";
	while((line=br.readLine())!=null){
	String[] splittedWords=line.split(" ");
	for(String eachWord:splittedWords){
	if(m.containsKey(eachWord)){
	m.put(eachWord, m.get(eachWord)+1);
	}else{
	m.put(eachWord, 1);
	}
	}
	}

	br=new BufferedReader(new FileReader("C:\\inputfile\\secondFile.txt"));
	String line1="";
	while((line1=br.readLine())!=null){
	String[] splittedWords1=line1.split(" ");
	for(String eachWord:splittedWords1){
	if(m.containsKey(eachWord)){
	m.put(eachWord, m.get(eachWord)+1);
	}else{
	m.put(eachWord, 1);
	}
	}
	}
	System.out.println(m);
	System.out.println("two files are common");

	/*for(Map.Entry<String, Integer> m1:m.entrySet()){
	if(m1.getValue() >1)
	{
	System.out.println(m1.getKey() +"==="+m1.getValue());
	}*/
	//}
	}catch(Exception e){
	e.printStackTrace();
	}

	}

	}


