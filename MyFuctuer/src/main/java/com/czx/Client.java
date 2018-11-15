/**
 * 
 */
package com.czx;

/**
 * @author -半藏-
 *
 */
public class Client {

	public Data request(final String queryStr) {
		final FutureData futureData = new FutureData();
		//用一个线程来创建futureData
		new Thread( () ->  {
			RealData realData = new RealData(queryStr);
			futureData.setRealData(realData);
		}).start();
		return futureData;
	}
}
