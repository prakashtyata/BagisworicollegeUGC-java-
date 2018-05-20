package com.bagiswori.deployer;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

/**
 * Deploy the build war file
 * 
 * @author RajaramPakur
 *
 */
public class WarDeploy {

	static File sourceDir = new File("D:\\eclipse-workspace\\mis-bagiswori-college\\target\\mis-bagiswori-college.war");

	static File destinationDir = new File("C:\\apache-tomcat-8.5.20\\webapps\\mis-bagiswori-college.war");

	static String binDir = "C:\\apache-tomcat-8.5.20\\bin\\";

	public static void main(String[] args) {
		logsDelete();
		try {
			FileUtils.copyFile(sourceDir, destinationDir);
			Runtime.getRuntime().exec("cmd.exe /c start startup", null, new File(binDir));
			TimeUnit.SECONDS.sleep(3);
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		} catch (Exception e) {
			System.out.println("Something is wrong");
		}
	}

	public static void logsDelete() {
		webappsDelete();
		File file = new File("C:\\apache-tomcat-8.5.20\\logs\\");
		String[] myFiles;
		if (file.isDirectory()) {
			myFiles = file.list();
			for (int i = 0; i < myFiles.length; i++) {
				File myFile = new File(file, myFiles[i]);
				myFile.delete();
			}
		}

	}

	public static void webappsDelete() {
		File file = new File("C:\\apache-tomcat-8.5.20\\webapps\\");
		String[] myFiles;
		if (file.isDirectory()) {
			myFiles = file.list();
			for (int i = 0; i < myFiles.length; i++) {
				File myFile = new File(file, myFiles[i]);
				myFile.delete();
			}
		}

	}
}
