package org.ingomohr.transientexample;

import java.io.Serializable;

public class MyData implements Serializable {

	private static final long serialVersionUID = 2767134758555785567L;

	public int myInt;

	public String s;

	public transient String ts;

	public final transient String fts = "fts";

	public static transient String sts;

	@Override
	public String toString() {
		return "MyData [myInt=" + myInt + ", s=" + s + ", ts=" + ts + ", fts=" + fts + "]";
	}

}
