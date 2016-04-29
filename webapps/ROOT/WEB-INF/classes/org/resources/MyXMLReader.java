package org.resources;
import java.io.*;
import java.awt.Desktop;
//import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.lang.reflect.Field;
import java.util.*;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.text.WordUtils;

public class MyXMLReader {

	public boolean hit = false;
	public NodeList nList;
	public Element eElement;
	public int count = 0;
	public VarStore vStore;
	public ArrayList<VarStore> vars;
	public String[] nodes = new String[]{"sub", "mLevel", "eLevel", "iLevel", "cc", 
						"fs", "m_topic", "e_topic", "i_topic", "m_tag", 
						"e_tag", "i_tag", "u_tag", "seal_tag", "smsc_tag", 
						 "ecm_tag", "regards_tag"};

/*114240
-1101076713
-1330109921
-1215593317
3168
3277
783968989
-2021093163
1528921561
103608520
96220352
99914436
110996688
882996824
-99895291
-1913514262
-229088273
*/

	
	public MyXMLReader(){
 		vars = new ArrayList<VarStore>();
		

		try {
			File fXmlFile = new File("Resources.xml");
        
        		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        		Document doc = dBuilder.parse(fXmlFile);
        		doc.getDocumentElement().normalize();
        		nList = doc.getElementsByTagName("Resource");
       			

      		} catch (Exception e) {
         		System.out.print(e);
      		}
		//elemList();
		
	}

	public void elemList(){
		this.elemList("all", "mLevel", "all", "m_topic", "all", "m_tag", "all");
	}

	public void elemList(String subject, String subLev, String level, 
							String subTopic, String topic, String subTag, String tag){
	  
	  for (int temp = 0; temp < nList.getLength(); temp++) {
		vStore = new VarStore();
 		Node nNode = nList.item(temp);
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                	eElement = (Element) nNode;
			enLists("sub", subject);
			if(getHit()){
				setHit(false);
				enLists(subLev, level);
			}
			if(getHit() && count ==2){
				setHit(false);
				enLists(subTopic, topic);
			}
			
			if(getHit() && count ==3){
				setHit(false);
				enLists(subTag, tag);
			}
			
		}			
		count = 0;		
          }
	  
	}

	public void enLists(String nName, String nValue){
		
		NodeList topList = eElement.getElementsByTagName(nName);
			NodeList tList;
			for(int t = 0; t < topList.getLength(); t++){
				tList = eElement.getElementsByTagName(nName).item(t).getChildNodes();
				Node topValue = (Node) tList.item(0);
				if(topValue.getNodeValue().toLowerCase().equals(nValue.toLowerCase())){
					
					count++;
					
					setHit(true);
					break;	
				}			
			}
			if(count == 4){
				//System.out.println(getTagValue("resource_name", eElement));
				vStore.setResName(FilenameUtils.getBaseName(getTagValue("resource_name", eElement)));
				vStore.setResExt(FilenameUtils.getExtension(getTagValue("resource_name", eElement)));
				vStore.setResPath((getTagValue("name", eElement)));
				vStore.setDescription((getTagValue("description", eElement)));
				for(int tags = 0; tags < nodes.length; tags++){
					setVariables(nodes[tags]);
				}
					vars.add(vStore);
				
			}
					
	}

	public void setVariables(String nodeName){

		
			int nN = nodeName.hashCode();
			
			NodeList vList = eElement.getElementsByTagName(nodeName);
			NodeList varList;
			for(int t = 0; t < vList.getLength(); t++){
				varList = eElement.getElementsByTagName(nodeName).item(t).getChildNodes();
				Node vValue = (Node) varList.item(0);
			   try{
				switch(nN){
			              case 114240: 
					String titleCase = WordUtils.capitalize(vValue.getNodeValue());
					vStore.subjects.add(titleCase);
				      break;

				      case -1101076713: 
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					vStore.maths_levels.add(titleCase);
				      break;

				      case -1330109921: 
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					vStore.english_levels.add(titleCase);
				      break;

				      case -1215593317: 
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.ict_levels.add(titleCase);
				      break;

				      case 3168:  
					
					 vStore.core_codes.add(vValue.getNodeValue());
				      break;

				      case 3277:  
					
					 vStore.fs_codes.add(vValue.getNodeValue());
				      break;

				      case 783968989:  
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.maths_topics.add(titleCase);
				      break;

				      case -2021093163:  
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.english_topics.add(titleCase);
				      break;

				      case 1528921561:  
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.ict_topics.add(titleCase);
				      break;

				      case 103608520:  
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.maths_tags.add(titleCase);
				      break;

				      case 96220352:  
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.english_tags.add(titleCase);
				      break;

				      case 99914436:  
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.ict_tags.add(titleCase);
				      break;

				      case 110996688:  
					titleCase = WordUtils.capitalize(vValue.getNodeValue());
					 vStore.user_tags.add(titleCase);
				      break;

				      case 882996824:  
					
					 vStore.seal.add(vValue.getNodeValue());
				      break;

				      case -99895291:  
					
					 vStore.smsc.add(vValue.getNodeValue());
				      break;

				      case -1913514262:  
					
					 vStore.ecm.add(vValue.getNodeValue());
				      break;

				      case -229088273:  
					
					 vStore.regards.add(vValue.getNodeValue());
				      break;

				}
			   }catch(Exception eks){}
			}
		
	}

	public void setHit(boolean b){
		hit = b;
	}

	public boolean getHit(){
		return hit;
	}

	
	private static String getTagValue(String sTag, Element e) {
    		NodeList nlList = e.getElementsByTagName(sTag).item(0).getChildNodes();
 		Node nValue = (Node) nlList.item(0);
 		return nValue.getNodeValue();
  	} // maybe make another version of this for another node list 

	/*public static void main(String args[]){
		MyXMLReader mx = new MyXMLReader();
		System.out.println(""+mx.vars.size());
		// need to make sure that mx.vars.size() is not null
		for(int v = 0; v < mx.vars.get(0).core_codes.size(); v++){ 
			System.out.println(mx.vars.get(0).core_codes.get(v));
		}
	}*/

	public class VarStore{

		public String resource_name;
		public String resource_ext;
		public String resource_path;
		public ArrayList<String> subjects;
		public ArrayList<String> maths_levels;
		public ArrayList<String> english_levels;
		public ArrayList<String> ict_levels;
		public ArrayList<String> core_codes;
		public ArrayList<String> fs_codes;
		public ArrayList<String> maths_topics;
		public ArrayList<String> english_topics;
		public ArrayList<String> ict_topics;
		public ArrayList<String> maths_tags;
		public ArrayList<String> english_tags;
		public ArrayList<String> ict_tags;
		public ArrayList<String> user_tags;
		public ArrayList<String> seal;
		public ArrayList<String> smsc;
		public ArrayList<String> ecm;
		public ArrayList<String> regards;
		public String description;

		public VarStore(){
			subjects = new ArrayList<String>();
			maths_levels = new ArrayList<String>();
			english_levels = new ArrayList<String>();
			ict_levels = new ArrayList<String>();
			core_codes = new ArrayList<String>();
			fs_codes = new ArrayList<String>();
			maths_topics = new ArrayList<String>();
			english_topics = new ArrayList<String>();
			ict_topics = new ArrayList<String>();
			maths_tags = new ArrayList<String>();
			english_tags = new ArrayList<String>();
			ict_tags = new ArrayList<String>();
			user_tags = new ArrayList<String>();
			seal = new ArrayList<String>();
			smsc = new ArrayList<String>();
			ecm = new ArrayList<String>();
			regards = new ArrayList<String>();
		}	


		public void setResName(String resName){
			resource_name = resName;
		}

		public String getResName(){
			return resource_name;
		}

		public void setResPath(String resPath){
			resource_path = resPath;
		}

		public String getResPath(){
			return resource_path;
		}

		public void setResExt(String ex){
			resource_ext = ex;
		}

		public String getResExt(){
			return resource_ext;
		}

		public void setDescription(String desc){
			description = desc;
		}

		public String getDescription(){
			return description;
		}
	}
}
	
