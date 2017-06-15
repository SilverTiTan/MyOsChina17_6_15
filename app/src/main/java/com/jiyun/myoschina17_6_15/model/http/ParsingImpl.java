package com.jiyun.myoschina17_6_15.model.http;

import java.util.Map;

public class ParsingImpl implements IParsing {

	@Override
	public void get(String url, Map<String, String> map, MyCallBack myCallBack) {
    ParsingFactory.initParsing().get(url, map, myCallBack);
	}

	@Override
	public void gets(String url, Map<String, String> map, MyCallBack myCallBack) {
		ParsingFactory.initParsing().gets(url, map, myCallBack);

	}

	@Override
	public void getCookie(String url, Map<String, String> map,
                          MyCallBack myCallBack) {
		ParsingFactory.initParsing().getCookie(url, map, myCallBack);

	}

	@Override
	public void post(String url, Map<String, String> map, MyCallBack myCallBack) {
		// TODO Auto-generated method stub

	}

}
