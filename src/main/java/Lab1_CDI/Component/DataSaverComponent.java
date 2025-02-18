package Lab1_CDI.Component;

import Lab1_CDI.DataSaver.Annotation.JSON;
import Lab1_CDI.DataSaver.Annotation.YAML;
import Lab1_CDI.DataSaver.IDataSaver;
import Lab1_CDI.DataSaver.Annotation.XML;
import Lab1_CDI.Interceptor.LoggingInterceptor;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptors;


@Interceptors(LoggingInterceptor.class)
public class DataSaverComponent {

    @Inject
//    @JSON
//    @XML
//    @YAML
    @Alternative
    private IDataSaver dataSaver;

    public void save(Object data, String filePath) throws Exception {
        dataSaver.save(data, filePath);
    }


}
