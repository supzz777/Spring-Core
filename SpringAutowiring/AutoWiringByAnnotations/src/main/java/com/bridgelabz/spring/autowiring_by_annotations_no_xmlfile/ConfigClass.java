package com.bridgelabz.spring.autowiring_by_annotations_no_xmlfile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration /*this annotation will tell the spring that this is a configuration class.
 				this acts as a xml file.*/
@ComponentScan(basePackages = "com.bridgelabz.spring.autowiring_by_annotations_no_xmlfile")
public class ConfigClass
{
	

}
