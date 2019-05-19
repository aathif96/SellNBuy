package bankpayment.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyHandler {

	  private static final Logger logger = LoggerFactory.getLogger(PropertyHandler.class);
	  
	  private PropertyHandler(){
	  
	  }
	  
	  public static String getProperty(String key)
	  {
			InputStream input = null;
			try {

				input =  new PropertyHandler().getClass().getClassLoader().getResourceAsStream("application.properties");
				Properties prop = new Properties();
				prop.load(input);
				String value = prop.getProperty(key);
			    if (value != null) {
			      return value.trim();
			    }
			    logger.error("Cannot find property : " + key);
			    return "";

			} catch (IOException e) {
				logger.error("Properties File Not Found " + e);
				return "";
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						logger.error("Properties File Not Found " + e);
						 return "";
					}
				}
			}

	  }

}
