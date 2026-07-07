package okhttp3.internal.platform;

import a5.b;
import android.content.Context;
import de.i;
import java.util.List;
import pd.p;
import pf.d;
import pf.e;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformInitializer implements b {
    @Override // a5.b
    public final List a() {
        return p.f10551v;
    }

    @Override // a5.b
    public final Object b(Context context) {
        i.e(context, "context");
        e eVar = e.f10613a;
        Object obj = e.f10613a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f10613a;
    }
}
