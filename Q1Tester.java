package lab6;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Q1Tester {
		public static void main(String[] args) {
			Map<String, Integer> hashMap = new HashMap<String, Integer>();
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader("story.txt"));
			} 
			catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			String ln = null;
			try {
				while((ln = br.readLine()) != null) {
					String[] tokens = ln.split(" ");
					for(String token: tokens) {
						if(hashMap.containsKey(token)) {
							int value = hashMap.get(token);
							hashMap.put(token, ++value);
						} 
						else {
							hashMap.put(token, 1);
						}
					}
				}
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
			for(Entry<String, Integer> item : entrySet) {
				System.out.println(item.getKey() + " appear " + item.getValue() + " times ");
			}
		}

	}
