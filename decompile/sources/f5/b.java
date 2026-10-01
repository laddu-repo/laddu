package f5;

import androidx.lifecycle.i;
import androidx.lifecycle.x;
import db.c1;
import db.h1;
import db.i0;
import db.k0;
import e5.g;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.UUID;
import ua.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5018a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5019b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5020c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5021d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5022e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5023f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f5024g;

    /* renamed from: h, reason: collision with root package name */
    public Cloneable f5025h;

    public b(g gVar, i iVar) {
        this.f5021d = gVar;
        this.f5022e = iVar;
        this.f5023f = new f(12);
        this.f5024g = new LinkedHashMap();
        this.f5020c = true;
    }

    public void a() {
        g gVar = (g) this.f5021d;
        if (gVar.getLifecycle().b() == x.f992y) {
            if (!this.f5018a) {
                ((i) this.f5022e).invoke();
                gVar.getLifecycle().a(new a(this, 0));
                this.f5018a = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public b(UUID uuid) {
        this();
        this.f5021d = uuid;
    }

    public b() {
        this.f5023f = h1.D;
        this.f5019b = true;
        i0 i0Var = k0.f4008y;
        this.f5024g = c1.B;
    }
}
