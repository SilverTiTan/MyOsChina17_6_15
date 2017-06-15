package com.jiyun.myoschina17_6_15.model.http;

import java.io.UnsupportedEncodingException;

public interface MyCallBack {
	void onSucess(String strSucess) throws UnsupportedEncodingException;
	void onFaile(String strError);

}
