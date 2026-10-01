package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import gf.f0;
import gf.y;
import ie.i;
import ie.s;
import java.util.Map;
import kotlin.jvm.internal.k;
import le.c;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClientProvider httpClientProvider;
    private final y ioDispatcher;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidExecuteAdViewerRequest(y ioDispatcher, HttpClientProvider httpClientProvider, GetCachedAsset getCachedAsset) {
        k.e(ioDispatcher, "ioDispatcher");
        k.e(httpClientProvider, "httpClientProvider");
        k.e(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        boolean z10;
        Map map;
        int i6;
        int i10;
        int i11;
        int i12;
        Map headersMap;
        String str = (String) i.m0(1, objArr);
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
            Map map2 = s.f6847x;
            if (i13 != 1 && i13 != 2) {
                if (i13 == 3) {
                    String str2 = (String) i.m0(2, objArr);
                    JSONArray jSONArray = (JSONArray) i.m0(3, objArr);
                    Integer num = (Integer) i.m0(4, objArr);
                    Integer num2 = (Integer) i.m0(5, objArr);
                    if (jSONArray != null && (headersMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) != null) {
                        map2 = headersMap;
                    }
                    if (num != null) {
                        i11 = num.intValue();
                    } else {
                        i11 = 30000;
                    }
                    if (num2 != null) {
                        i12 = num2.intValue();
                    } else {
                        i12 = 30000;
                    }
                    return new HttpRequest(str, null, requestType, str2, map2, null, null, null, null, i11, i12, 0, 0, false, null, null, 0, 129506, null);
                }
                throw new RuntimeException();
            }
            JSONArray jSONArray2 = (JSONArray) i.m0(2, objArr);
            Integer num3 = (Integer) i.m0(3, objArr);
            Integer num4 = (Integer) i.m0(4, objArr);
            if (jSONArray2 == null || (map = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
                map = map2;
            }
            if (num3 != null) {
                i6 = num3.intValue();
            } else {
                i6 = 30000;
            }
            if (num4 != null) {
                i10 = num4.intValue();
            } else {
                i10 = 30000;
            }
            return new HttpRequest(str, null, requestType, null, map, null, null, null, null, i6, i10, 0, 0, false, null, null, 0, 129514, null);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, c cVar) {
        return f0.J(this.ioDispatcher, new AndroidExecuteAdViewerRequest$invoke$2(objArr, this, requestType, null), cVar);
    }
}
