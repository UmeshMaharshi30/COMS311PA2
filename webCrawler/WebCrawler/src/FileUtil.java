import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "sample.txt";
		FileUtil fileUtil = new FileUtil();
		ArrayList<String> strings = fileUtil.readFile(filename);
		for (String string : strings) {
			System.out.println(string);
		}
	}
	
	public ArrayList<String> readFile(String fileLocation) {
		
		ArrayList<String> fileLines = new ArrayList<String>();
		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileLocation))) {
			String line;
			while ((line = br.readLine()) != null) {
			    fileLines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileLines;
	}

}
