package com.sjb.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.sjb.model.Model;

public class ProUtil {

	public static Model[] readRange(String fileUrl) throws IOException {
		Model[] models = new Model[10];
		Properties properties = new Properties();
		// ʹ��ClassLoader����properties�����ļ����ɶ�Ӧ��������
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				fileUrl));
		// ʹ��properties�������������
		properties.load(bufferedReader);
		// ��ȡkey��Ӧ��valueֵ
		for (int i = 1; i <= 10; i++) {
			String range = properties.getProperty("range" + i);
			Model m = new Model();
			m.setRange(range);
			models[i - 1] = m;
		}
		return models;
	}

	public static String[] getFile(String fileUrl) throws IOException {
		String[] str = new String[3];
		Properties properties = new Properties();
		// ʹ��ClassLoader����properties�����ļ����ɶ�Ӧ��������
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				fileUrl));
		// ʹ��properties�������������
		properties.load(bufferedReader);
		// ��ȡkey��Ӧ��valueֵ
		for (int i = 1; i <= 3; i++) {
			String file = properties.getProperty("file" + i);
			str[i - 1] = file;
		}
		return str;
	}
}
