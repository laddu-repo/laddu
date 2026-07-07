package c6;

import android.content.Context;
import androidx.lifecycle.j1;
import g8.p;
import hb.s;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f1969f = o.h("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final h6.a f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1971b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1972c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1973d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f1974e;

    public d(Context context, h6.a aVar) {
        this.f1971b = context.getApplicationContext();
        this.f1970a = aVar;
    }

    public abstract Object a();

    public final void b(b6.c cVar) {
        synchronized (this.f1972c) {
            try {
                if (this.f1973d.remove(cVar) && this.f1973d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f1972c) {
            try {
                Object obj2 = this.f1974e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f1974e = obj;
                    ((p) ((j1) this.f1970a).A).execute(new s(this, new ArrayList(this.f1973d), 1, false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
