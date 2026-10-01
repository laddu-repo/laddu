package com.unity3d.ads.core.domain;

import df.m;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        k.e(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String url) {
        k.e(url, "url");
        String invoke = this.removeUrlQuery.invoke(url);
        if (invoke != null) {
            String f02 = m.f0('/', invoke, invoke);
            if (m.J(f02, '.')) {
                String f03 = m.f0('.', f02, f02);
                if (f03.length() != 0) {
                    return f03;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
