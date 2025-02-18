package Lab1_CDI;

import Lab1_CDI.Component.DataSaverComponent;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Laboratory1 {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        try {
            DataSaverComponent dataSaverComponent = container.select(DataSaverComponent.class).get();
            Object data = new YourDataObject("Веселков", 21);
            String filePath = "C:\\Users\\fly12\\OneDrive\\Desktop\\outasdput.json";
            dataSaverComponent.save(data, filePath);
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally {
            weld.shutdown();
        }
    }
}
