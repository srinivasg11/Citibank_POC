package com.util;

import java.io.*;
import java.util.*;

public class ReadPropertiesFileTest {
	public Properties readPropertiesFile(String filename) {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream("resources/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
			}
		}
		return prop;
	}
}