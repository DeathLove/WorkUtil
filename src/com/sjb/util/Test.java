package com.sjb.util;

public class Test {

	public static void main(String[] args) {
		
		/*String[] r = "-100@@100".split("@@");
		Double a = Double.valueOf(r[1]) - Double.valueOf(r[0]);
		for (int i = 0; i < 50; i++) {
			Double result = Double.valueOf(r[0]) + Math.random() * a;
			System.out.println(MathUtil.format1(result, 1));
		}*/
		
//		System.out.println(MathUtil.format1(8700.0, 7, 0));
		String url = "/F:/BaiduNetdiskDownload/util_1_0.jar";
		url= url.substring(0, url.lastIndexOf("/")+1) + "range.properties";
		System.out.println(url);
	}
}
