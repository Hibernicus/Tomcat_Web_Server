package user;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class UserData {

    String username;
    

    public void setUsername(String value)
    {
	try {
 
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
 	
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("AllUsers");
		doc.appendChild(rootElement);

		Element user = doc.createElement("User");
		rootElement.appendChild(user);

		Element name = doc.createElement("Name");
		name.appendChild(doc.createTextNode(value));
		user.appendChild(name);

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("AllUsers.xml"));
		transformer.transform(source, result);
		username = "File saved!";
	}catch (ParserConfigurationException pce) {
		pce.printStackTrace();
		username = value;
	} catch (TransformerException tfe) {
		tfe.printStackTrace();
		username = value;
	}
 
    }

    public String getUsername(){ 
	return username; 
    }

    
}
