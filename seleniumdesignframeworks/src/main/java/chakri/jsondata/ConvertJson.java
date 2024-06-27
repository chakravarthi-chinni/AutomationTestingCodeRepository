package chakri.jsondata;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJson {
	
	public List<HashMap<String, String>> jsonConvertToString() throws IOException {
		String jsontoString=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\main\\java\\chakri\\jsondata\\data.json"),
				StandardCharsets.UTF_8);
		
		ObjectMapper obj=new ObjectMapper();
		List<HashMap<String, String>> mapper=obj.readValue(jsontoString,new TypeReference<List<HashMap<String, String>>>(){});
		
		return mapper;
		
	}

}
