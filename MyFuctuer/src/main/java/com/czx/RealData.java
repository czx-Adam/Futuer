/**
 * 
 */
package com.czx;

/**
 * @author -半藏-
 *
 */
public class RealData implements Data{

	protected final String result;
	
	/**
	 * @param queryStr
	 */
	public RealData(String queryStr) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<10; i++) {
			sb.append(queryStr);
			try {
				//执行某些操作
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
		result = sb.toString();
	}
	public String getResult() {
		return result;
	}

}
