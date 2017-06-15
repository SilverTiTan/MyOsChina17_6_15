package com.jiyun.myoschina17_6_15.model.http;

import java.io.File;
import java.util.Map;

import okhttp3.RequestBody;

public interface IHttp {
	void get(String url, Map<String, String> map, MyCallBack myCallBack);

	void gets(String url, Map<String, String> map, MyCallBack myCallBack);

	void getCookie(String url, Map<String, String> map, MyCallBack myCallBack);

	void post(String url, Map<String, String> map, MyCallBack myCallBack);

	void filed(String url, Map<String, RequestBody> map, String fileKey,
               File file, MyCallBack myCallBack);
}
