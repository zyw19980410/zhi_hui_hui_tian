package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Network disconnection callback function original shape 
 * \else
 * 网络断线处理接口
 * \endif
 */
public interface CB_fDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * Callback function when network disconnect
	 * @param lLoginID login handle, return from {@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param pchDVRIP ip of device
	 * @param nDVRPort port of device
	 * \else
	 * 网络断线回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param pchDVRIP 设备IP
	 * @param nDVRPort 设备端口
	 * \endif
	 */
	public void invoke(long lLoginID, String pchDVRIP, int nDVRPort);
}
