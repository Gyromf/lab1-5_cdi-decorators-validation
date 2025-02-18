package Lab1_CDI.DataSaver;

import Lab1_CDI.DataSaver.Annotation.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

import java.io.File;
import java.io.IOException;

@Named("JSON")
@Dependent


@Alternative
public class JsonDataSaver implements IDataSaver {

    @Override
    public void save(Object data, String filePath) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath), data);
            System.out.println("Data saved in JSON format.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("Error saving JSON");
        }
    }
}
