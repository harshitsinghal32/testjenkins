import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class testjenkin
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
    }
    
    @RequestMapping(value = "/test/jenkins", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getBill() {
    	System.out.println("1234567890");
		return null;
	}

}