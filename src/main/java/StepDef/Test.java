package StepDef;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
public static void main(String[] args) {
	Map<Integer,String> ex =new HashMap<Integer,String>();
	ex.put(10,"java1");
	ex.put(50, "Oracle");
	ex.put(30, "python");
	ex.put(40, "C++");
	ex.put(60, "java");
	ex.put(20, "Automation");
    Set<Entry<Integer, String>> s = ex.entrySet();
    for(Entry<Integer, String> x:s){
     System.out.println(x.getKey());
     System.out.println(x.getValue());
    }
	
	
	
	
	
	}
	
}




		
	


