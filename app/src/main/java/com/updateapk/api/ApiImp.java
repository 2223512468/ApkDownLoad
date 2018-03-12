package com.updateapk.api;

import java.io.InputStream;

import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by Administrator on 2018/3/12.
 */
public class ApiImp implements Api {

    private static ApiImp mApiImp;

    public static ApiImp get() {
        if (null == mApiImp) {
            mApiImp = new ApiImp();
        }
        return mApiImp;
    }

    private Api genApi() {
        return HttpService.instance().getApi();
    }

    @Override
    public Observable<InputStream> update(@Url String url) {
        return genApi().update(url);
    }
}
