package com.unity3d.services.core.configuration;

import android.content.Context;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.services.core.di.ServiceProvider;
import gf.c0;
import he.y;
import kotlin.jvm.internal.x;
import le.c;
import ne.e;
import ne.j;
import okhttp3.HttpUrl;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.configuration.AdsSdkInitializer$create$1", f = "AdsSdkInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AdsSdkInitializer$create$1 extends j implements p {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsSdkInitializer$create$1(Context context, c cVar) {
        super(2, cVar);
        this.$context = context;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AdsSdkInitializer$create$1(this.$context, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AdsSdkInitializer$create$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            ((OrientationRepository) ServiceProvider.INSTANCE.getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OrientationRepository.class))).invoke();
            try {
                o9.a.a(this.$context);
            } catch (Throwable unused) {
            }
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
