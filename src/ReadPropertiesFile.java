import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException
	{
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("./ScreenShots//prortiesFile.properties");
        prop.load(fis);
        
        System.out.println(prop);
        prop.getProperty("name");
        System.out.println(prop.getProperty("name"));
        prop.setProperty("nag","8888");
        FileOutputStream fos=new FileOutputStream("./ScreenShots//prortiesFile.properties");
        prop.store(fos, " nag added??? ");
	}

}
