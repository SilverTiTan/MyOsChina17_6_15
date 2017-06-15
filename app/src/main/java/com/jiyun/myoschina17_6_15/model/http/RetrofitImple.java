package com.jiyun.myoschina17_6_15.model.http;

import java.io.File;
import java.util.Map;

import okhttp3.RequestBody;

public class RetrofitImple implements IHttp {

	@Override
	public void get(String url, Map<String, String> map, MyCallBack myCallBack) {

	}

	@Override
	public void gets(String url, Map<String, String> map, MyCallBack myCallBack) {

	}

	@Override
	public void getCookie(String url, Map<String, String> map,
                          MyCallBack myCallBack) {

	}

	@Override
	public void post(String url, Map<String, String> map, MyCallBack myCallBack) {
		// TODO Auto-generated method stub

	}

	@Override
	public void filed(String url, Map<String, RequestBody> map, String fileKey,
                      File file, MyCallBack myCallBack) {
		// TODO Auto-generated method stub

	}

}
