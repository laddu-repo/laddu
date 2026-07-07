package com.unity3d.ads.core.data.datasource;

import java.io.File;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface CacheDataSource {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, c cVar, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 4) != 0) {
                    str2 = null;
                }
                String str3 = str2;
                if ((i6 & 8) != 0) {
                    num = Integer.MAX_VALUE;
                }
                return cacheDataSource.getFile(file, str, str3, num, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    Object getFile(File file, String str, String str2, Integer num, c cVar);
}
