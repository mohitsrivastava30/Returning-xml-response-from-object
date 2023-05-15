package Controller;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamResult;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Employee;

@RestController
public class MyController {
	 
	    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_XML_VALUE)
	    
	    public String getMyObjectAsXml(@RequestBody Employee employee) throws JAXBException {

	    	StringWriter sw = new StringWriter();
	    	
	        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
	        Marshaller marshaller = jaxbContext.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	        marshaller.marshal(employee, new StreamResult(sw));

	        return sw.toString();
	    }
	

}
