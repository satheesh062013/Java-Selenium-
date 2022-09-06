package API_AutomationPractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Parser {

	public static void main(String[] args) throws IOException, ParseException 
	{
		//File f = new File("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\MavenProjectSession\\src\\test\\java\\API_AutomationPractise\\Respons.json");
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\API_AutomationPractise\\Respons.json");
		FileReader fr = new FileReader(f);
		JSONParser json = new JSONParser();
		Object obj = json.parse(fr);
		JSONObject jsonObj = (JSONObject) obj;
		
		Object value = jsonObj.get("data.id");
		System.out.println("Value of JSON Object: "+value);
	
	} 

}
