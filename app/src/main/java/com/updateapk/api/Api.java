package com.updateapk.api;

import java.io.InputStream;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by Administrator on 2018/3/12.
 */
public interface Api {

    /**
     * 不能解析成流
     * @param url
     * @return
     */

    @GET
    Observable<InputStream> update(@Url String url);
}
