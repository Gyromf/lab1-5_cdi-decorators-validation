package Lab1_CDI.DataSaver;

import Lab1_CDI.DataSaver.Annotation.YAML;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import java.io.FileWriter;
import java.io.IOException;


@Named("YAML")
@Dependent


@Alternative
public class YamlDataSaver implements IDataSaver {

    @Override
    public void save(Object data, String filePath) throws Exception {
        Yaml yaml = new Yaml(new DumperOptions());
        try (FileWriter writer = new FileWriter(filePath)) {
            yaml.dump(data, writer);
            System.out.println("Data saved in YAML format.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("Error saving YAML");
        }
    }
}
