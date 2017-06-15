package com.jiyun.myoschina17_6_15.model.http;

public class ParsingFactory {
	private static final int OKHTTP = 1;
	private static final int RETROFIT = 2;
	private static final int TYPE = RETROFIT;

	public static IHttp initParsing() {
		IHttp iHttp = null;
		switch (TYPE) {
		case OKHTTP:
			break;
		case RETROFIT:
			iHttp = new RetrofitImple();
			break;
		}
		return iHttp;

	}

}
