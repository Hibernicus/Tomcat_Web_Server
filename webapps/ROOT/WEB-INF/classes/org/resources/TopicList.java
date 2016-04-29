package org.resources;
import java.io.*;
import java.awt.Desktop;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.lang.reflect.Field;
import java.util.*;
import java.util.Arrays;


public class TopicList {

	
	public ArrayList<String> topics;
	public String [] sorted;
	public Element eElement;
	

	public TopicList(String subject, String type){
 		topics = new ArrayList<String>();
		

		try {	
			/*** search for a file in Tomcat bin folder e.g.
			     "English//topics.xml"
			using "topic" or "tag" as the "type" argument. ***/

			File fXmlFile = new File(new String(subject + "//" + type + "s.xml"));
        
        		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        		Document doc = dBuilder.parse(fXmlFile);
        		doc.getDocumentElement().normalize();

			/*** make a node list of "topic" or "tag" nodes***/
        		NodeList nList = doc.getElementsByTagName(type);

			/*** for each items in the node list
			     add the value of the "name" attribute to the ArrayList ***/

       			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                			eElement = (Element) nNode;
					topics.add(getTagValue("name", eElement));
				//start of new stuff
					/*** make a String array the same size as 
					and populate from the ArrayList - for sorting purposes
					***/
					
					sorted = new String[topics.size()];
					for(int s = 0; s < topics.size(); s++){
						sorted[s] = topics.get(s);
					}
					/*** clear the ArrayList ***/
					topics.clear();

					/*** sort the Array ***/
					Arrays.sort(sorted);

					/*** I have repopulated the ArrayList and I
					can't remember why - I must do something with this
					in the JSP where I am removing ArrayList.get(0) ***/

					for(int s = 0; s < sorted.length; s++){
						topics.add(sorted[s]);
					} // end of new stuff

				}
			}
      		} catch (Exception e) {
         		System.out.print(e);
      		}

	}

	public static String getTagValue(String sTag, Element e) {
    		NodeList nlList = e.getElementsByTagName(sTag).item(0).getChildNodes();
 		Node nValue = (Node) nlList.item(0);
 		return nValue.getNodeValue();
  	}	
}
	
