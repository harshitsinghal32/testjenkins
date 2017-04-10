import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import org.apache.log4j.Logger;


public class testjenkin
{
	private static final Logger logger = Logger.getLogger(testjenkin.class);
    public static void main( String[] args )
    {
    	logger.error("ITS ALIVE!!!!!!!");
        System.out.println("Hello World!");
    }
    
    @RequestMapping(value = "/test/jenkins", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getBill() {
    	System.out.println("1234567890");
		return null;
	}

}