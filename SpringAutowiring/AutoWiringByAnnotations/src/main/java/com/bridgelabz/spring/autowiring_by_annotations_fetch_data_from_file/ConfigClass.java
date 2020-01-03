package com.bridgelabz.spring.autowiring_by_annotations_fetch_data_from_file;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration /*this annotation will tell the spring that this is a configuration class.
 				this acts as a xml file.*/
@ComponentScan(basePackages = "com.bridgelabz.spring.autowiring_by_annotations_fetch_data_from_file")
@PropertySource("classpath:college-info.properties")
public class ConfigClass
{
	

}
