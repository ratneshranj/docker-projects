/**
 * 
 */
package com.docker.git;

/**
 * @author server
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		for(int i=0;i<10;i++) {
			System.out.println("Hello World "+i);
			Thread.sleep(10000);
		}
	}

}
