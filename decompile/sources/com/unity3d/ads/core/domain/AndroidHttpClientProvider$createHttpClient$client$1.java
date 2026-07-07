package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1", f = "AndroidHttpClientProvider.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHttpClientProvider$createHttpClient$client$1 extends j implements p {
    final /* synthetic */ HttpClientSelection $selectedHttpClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpClientSelection.values().length];
            try {
                iArr[HttpClientSelection.OKHTTP3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpClientSelection.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$createHttpClient$client$1(HttpClientSelection httpClientSelection, AndroidHttpClientProvider androidHttpClientProvider, c cVar) {
        super(2, cVar);
        this.$selectedHttpClient = httpClientSelection;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidHttpClientProvider$createHttpClient$client$1(this.$selectedHttpClient, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidHttpClientProvider$createHttpClient$client$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers iSDKDispatchers;
        Context context;
        ISDKDispatchers iSDKDispatchers2;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.$selectedHttpClient.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    iSDKDispatchers = this.this$0.dispatchers;
                    return new LegacyHttpClient(iSDKDispatchers);
                }
                AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
                context = androidHttpClientProvider.context;
                iSDKDispatchers2 = this.this$0.dispatchers;
                HttpClientSelection httpClientSelection = this.$selectedHttpClient;
                this.label = 1;
                obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers2, httpClientSelection, this);
                me.a aVar = me.a.f8833x;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                return this.this$0.getOkHttp3Client();
            }
        }
        return (HttpClient) obj;
    }
}
