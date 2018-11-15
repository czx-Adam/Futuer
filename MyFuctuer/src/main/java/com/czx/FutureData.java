/**
 * 
 */
package com.czx;

/**
 * @author -半藏-
 *
 */
public class FutureData implements Data{//是RealData的装饰类

	protected RealData readata = null;
	protected boolean isReady = false;
	
	public synchronized String getResult() {
		
		while(!isReady) {
			try {
				wait();//一直的等待，直到RealData注入完成
			}catch(InterruptedException e) {
				
			}
		}
		return readata.result;
	}

	public synchronized void setRealData(RealData realData) {

		if (isReady) {
			return ;
		}
		this.readata = realData;
		isReady = true;
		notifyAll();//RealData已完成注入，通知getResult
	}

}
