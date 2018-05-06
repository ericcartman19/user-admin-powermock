package com.valoyes.useradminservice.util;

/**
 * La clase es final porque no queremos que nadie pueda heredarla o
 * override los metodos
 *
 */
public final class IDGenerator {
	
	private static int i;
	
	public static final int generateID() {
		return i++;
	}
	
}
