package com.bagiswori.core.web.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WebsiteUtils {

	public static void copyFile(String sourcePath, String destinationPath) throws IOException {
		File sourceFile = new File(sourcePath);
		FileUtils.copyFileToDirectory(sourceFile, new File(destinationPath));
	}
	
	public static void reverseByDate(Object objectList) {
		
	}
	
	public static void main(String[] args) throws IOException {
		String sourcePath = "D://eclipse-workspace/mis-bagiswori-college.zip";
		String destinationPath = "D://eclipse-workspace/mis-bagiswori-college/src/main/webapp/resources/events/file/";
		copyFile(sourcePath, destinationPath);
	}
	
	

}
