package Day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader;
		int result = 0;
		int score = 0;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\adamc\\eclipse-workspace\\Day04\\src\\Day04\\input.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				
				String[] parts = line.split(",");
				String[] firstPair = parts[0].split("-");
				String[] secondPair = parts[1].split("-");
				
				int firstX = Integer.valueOf(firstPair[0]);
				int firstY = Integer.valueOf(firstPair[1]);
				
				int secondX = Integer.valueOf(secondPair[0]);
				int secondY = Integer.valueOf(secondPair[1]);
				
				if(firstX >= secondX && firstX <= secondY || firstY >= secondX && firstY <= secondY) {
					result++;
				}
				
				if(secondX >= firstX && secondX <= firstY || secondY >= firstX && secondY <= firstY) {
					result++;
				}
			
				if(result >= 1) {
					score++;
				}
				result = 0;
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Answer is: " + score);
		
	}
	
}