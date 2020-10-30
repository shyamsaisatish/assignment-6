package lab6;
import java.util.*;
import java.io.*;
public class Q3Tester {
	public static void main(String[] args) {
		double maximum = 0.0;
		int value = 0;
		List<String> list = new ArrayList<>();
		try {
			Scanner s = new Scanner(new FileReader("data.txt"));
			String line = null;
			while (s.hasNext()) {
				line = s.nextLine();
				list.add(line);
			}
			for (int i = 0; i < list.size(); i++) {
				value = Double.compare(Double.parseDouble(list.get(i)), maximum);
				if (value > 0) {
					maximum = Double.parseDouble(list.get(i));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(maximum);

	}
}
