package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CachedFile;
import le.c;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface CacheRepository {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i6, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    jSONArray = null;
                }
                if ((i10 & 4) != 0) {
                    i6 = 0;
                }
                return cacheRepository.getFile(str, jSONArray, i6, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }

    Object clearCache(c cVar);

    Object doesFileExist(String str, c cVar);

    Object getCacheSize(c cVar);

    Object getFile(String str, JSONArray jSONArray, int i6, c cVar);

    Object getWebviewFile(String str, String str2, c cVar);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, c cVar);
}
