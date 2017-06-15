package com.jiyun.myoschina17_6_15.model.http;

import java.util.Map;

public interface IParsing {
	void get(String url, Map<String, String> map, MyCallBack myCallBack);

	void gets(String url, Map<String, String> map, MyCallBack myCallBack);

	void getCookie(String url, Map<String, String> map, MyCallBack myCallBack);

	void post(String url, Map<String, String> map, MyCallBack myCallBack);
}
