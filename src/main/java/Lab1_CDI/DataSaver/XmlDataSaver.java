package Lab1_CDI.DataSaver;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


import java.io.File;


@Named("XML")
@Dependent

@Alternative
public class XmlDataSaver implements IDataSaver {

    @Override
    public void save(Object data, String filePath) throws Exception {
        try {
            JAXBContext context = JAXBContext.newInstance(data.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(data, new File(filePath));
            System.out.println("Data saved in XML format.");
        } catch (JAXBException e) {
            e.printStackTrace();
            throw new Exception("Error saving XML");
        }
    }
}
