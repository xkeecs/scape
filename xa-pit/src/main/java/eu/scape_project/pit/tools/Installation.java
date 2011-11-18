package eu.scape_project.pit.tools;

import java.net.URL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType( XmlAccessType.FIELD )
public class Installation {

	String type;
	
	URL url;
	
	String md5;
	
}
