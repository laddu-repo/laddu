package p6;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10596a;

    /* renamed from: b, reason: collision with root package name */
    public final he.m f10597b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10598c;

    public i(he.f fVar, he.m mVar, boolean z10) {
        this.f10596a = fVar;
        this.f10597b = mVar;
        this.f10598c = z10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [he.f, java.lang.Object] */
    @Override // p6.f
    public final g a(Object obj, o oVar) {
        Uri uri = (Uri) obj;
        if (!kotlin.jvm.internal.k.a(uri.getScheme(), "http") && !kotlin.jvm.internal.k.a(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        return new l(uri.toString(), oVar, this.f10596a, this.f10597b, this.f10598c);
    }
}
