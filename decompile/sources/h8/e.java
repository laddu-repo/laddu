package h8;

import android.content.Context;
import androidx.lifecycle.j1;
import com.google.android.datatransport.cct.CctBackendFactory;
import j4.b0;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f6001a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f6002b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6003c;

    public e(Context context, j1 j1Var) {
        b0 b0Var = new b0((Object) context, false);
        this.f6003c = new HashMap();
        this.f6001a = b0Var;
        this.f6002b = j1Var;
    }

    public final synchronized f a(String str) {
        if (this.f6003c.containsKey(str)) {
            return (f) this.f6003c.get(str);
        }
        CctBackendFactory m9 = this.f6001a.m(str);
        if (m9 == null) {
            return null;
        }
        j1 j1Var = this.f6002b;
        f create = m9.create(new b((Context) j1Var.f949y, (p8.a) j1Var.f950z, (p8.a) j1Var.A, str));
        this.f6003c.put(str, create);
        return create;
    }
}
