package com.sjb.model;

import com.sjb.util.MathUtil;

public class Model {

	private String range;
	
	private Double result;

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
	
	public String getResult(int numSize, int size) {
		String[] r = range.split("@@");
		Double a = Double.valueOf(r[1]) - Double.valueOf(r[0]);
		this.result = Double.valueOf(r[0]) + Math.random() * a;
		return MathUtil.format1(result, numSize, size);
	}

	public Double getResult() {
		return result;
	}

}
