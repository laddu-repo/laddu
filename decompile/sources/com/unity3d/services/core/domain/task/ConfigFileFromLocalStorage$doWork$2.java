package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.properties.SdkProperties;
import gf.c0;
import he.a;
import he.k;
import he.y;
import java.io.File;
import java.util.concurrent.CancellationException;
import le.c;
import ne.e;
import ne.j;
import org.json.JSONObject;
import se.h;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ConfigFileFromLocalStorage$doWork$2 extends j implements p {
    final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, c cVar) {
        super(2, cVar);
        this.$params = params;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Throwable a10;
        if (this.label == 0) {
            a.f(obj);
            ConfigFileFromLocalStorage.Params params = this.$params;
            try {
                File file = new File(SdkProperties.getLocalConfigurationFilepath());
                if (!file.exists()) {
                    b10 = params.getDefaultConfiguration();
                } else {
                    b10 = new Configuration(new JSONObject(h.q(file)));
                }
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable th) {
                b10 = a.b(th);
            }
            if ((b10 instanceof he.j) && (a10 = k.a(b10)) != null) {
                b10 = a.b(a10);
            }
            return new k(b10);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
