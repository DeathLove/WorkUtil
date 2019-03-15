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
		// 使用ClassLoader加载properties配置文件生成对应的输入流
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				fileUrl));
		// 使用properties对象加载输入流
		properties.load(bufferedReader);
		// 获取key对应的value值
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
		// 使用ClassLoader加载properties配置文件生成对应的输入流
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				fileUrl));
		// 使用properties对象加载输入流
		properties.load(bufferedReader);
		// 获取key对应的value值
		for (int i = 1; i <= 3; i++) {
			String file = properties.getProperty("file" + i);
			str[i - 1] = file;
		}
		return str;
	}
}
