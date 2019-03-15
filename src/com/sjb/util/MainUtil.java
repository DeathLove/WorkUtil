package com.sjb.util;

import com.sjb.model.Model;

public class MainUtil {

	public static void main(String[] args) throws Exception {
		String url = MainUtil.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		url= url.substring(0, url.lastIndexOf("/")+1) + "range.properties";
		Model[] m = ProUtil.readRange(url);
		String[] files = ProUtil.getFile(url);
		System.out.println("01) ��Ͳ(Ĥ)��:00000001");
		System.out.println("02) �� �� ��:0.99");
		System.out.println("03) �������:" + m[0].getResult(4, 1) + "  L");
		System.out.println("04) ������:"
				+ MathUtil.calNext(m[0].getResult(), 4, 1, 20) + "  L");
		System.out.println("05) ƽ����ѹ:" + m[1].getResult(4, 0) + "    Pa");
		System.out.println("06) ƽ����ѹ:" + m[2].getResult(1, 4) + " kPa");
		System.out.println("07) ƽ������:" + m[3].getResult(2, 1) + "   ��");
		System.out.println("08) ƽ������:" + m[4].getResult(2, 1) + "    m/s");
		System.out.println("09) ��������:" + m[5].getResult(7, 0) + " m3/h");
		System.out.println("10) �������:"
				+ MathUtil.calNext(m[5].getResult(), 7, 0, 200) + " m3/h");
		System.out.println("11) �ۼƲ�ʱ:010m00s");
		System.out.println("12) �� �� ѹ:" + m[6].getResult(3, 2) + "  kPa");
		System.out.println("13) ƽ��ȫѹ:" + m[7].getResult(2, 2) + "  kPa");
		System.out.println("14) ��    ѹ:" + m[8].getResult(2, 2) + "  kPa");
		System.out.println("15) ��    ��:" + m[9].getResult(3, 1) + "   ��");
		System.out.println("16) �̵�����:" + files[0] + "�O");
		System.out.println("17) ����ֱ��:" + files[1] + "    mm");
		System.out.println("18) �� ʪ ��:" + files[2] + "    %");
		System.out.println("19) Ƥ�й�ϵ��:0.84");
	}
}
