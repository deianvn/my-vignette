package com.github.deianvn.my.vignette.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import timber.log.Timber

class DebugRetrofitInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        Timber.i(request.url().toString())
        return chain.proceed(request)
    }
}
