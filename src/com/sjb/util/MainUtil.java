package com.sjb.util;

import com.sjb.model.Model;

public class MainUtil {

	public static void main(String[] args) throws Exception {
		String url = MainUtil.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		url= url.substring(0, url.lastIndexOf("/")+1) + "range.properties";
		Model[] m = ProUtil.readRange(url);
		String[] files = ProUtil.getFile(url);
		System.out.println("01) 滤筒(膜)号:00000001");
		System.out.println("02) 跟 踪 率:0.99");
		System.out.println("03) 采样体积:" + m[0].getResult(4, 1) + "  L");
		System.out.println("04) 标况体积:"
				+ MathUtil.calNext(m[0].getResult(), 4, 1, 20) + "  L");
		System.out.println("05) 平均动压:" + m[1].getResult(4, 0) + "    Pa");
		System.out.println("06) 平均静压:" + m[2].getResult(1, 4) + " kPa");
		System.out.println("07) 平均烟温:" + m[3].getResult(2, 1) + "   ℃");
		System.out.println("08) 平均流速:" + m[4].getResult(2, 1) + "    m/s");
		System.out.println("09) 烟气流量:" + m[5].getResult(7, 0) + " m3/h");
		System.out.println("10) 标干流量:"
				+ MathUtil.calNext(m[5].getResult(), 7, 0, 200) + " m3/h");
		System.out.println("11) 累计采时:010m00s");
		System.out.println("12) 大 气 压:" + m[6].getResult(3, 2) + "  kPa");
		System.out.println("13) 平均全压:" + m[7].getResult(2, 2) + "  kPa");
		System.out.println("14) 计    压:" + m[8].getResult(2, 2) + "  kPa");
		System.out.println("15) 计    温:" + m[9].getResult(3, 1) + "   ℃");
		System.out.println("16) 烟道截面:" + files[0] + "㎡");
		System.out.println("17) 采嘴直径:" + files[1] + "    mm");
		System.out.println("18) 含 湿 量:" + files[2] + "    %");
		System.out.println("19) 皮托管系数:0.84");
	}
}
