package Lab1_CDI.DataSaver;

public interface IDataSaver {
    void save(Object data, String filePath) throws Exception;
}
