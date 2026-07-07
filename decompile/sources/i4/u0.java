package i4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements g1, u1.g, s9.a, s9.g, yb.a, t0.s, qb.d, m3.g, n8.e, cb.e, o5.q {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6567x;

    public /* synthetic */ u0(int i6) {
        this.f6567x = i6;
    }

    @Override // o5.q
    public void a(o5.o oVar, o5.r rVar, boolean z10) {
        switch (this.f6567x) {
            case 28:
                oVar.e(rVar);
                return;
            default:
                oVar.b(rVar);
                return;
        }
    }

    @Override // u1.g
    public void accept(Object obj) {
        l1 l1Var = (l1) obj;
        switch (this.f6567x) {
            case 1:
                l1Var.stop();
                return;
            case 2:
            default:
                l1Var.n();
                return;
            case 3:
                l1Var.c();
                return;
            case 4:
                l1Var.B();
                return;
        }
    }

    @Override // n8.e
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f6567x) {
            case 26:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        androidx.lifecycle.j1 a10 = g8.i.a();
                        a10.E(rawQuery.getString(1));
                        a10.A = q8.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a10.f950z = decode;
                        arrayList.add(a10.g());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                return db.k0.o(Integer.valueOf(((r2.h) obj).f11791x));
        }
    }

    @Override // s9.g
    public s9.n b(Object obj) {
        switch (this.f6567x) {
            case 12:
                ic.z zVar = (ic.z) obj;
                k7.c cVar = FirebaseMessaging.f2839l;
                zVar.getClass();
                ic.w wVar = new ic.w("S", "latestVersion");
                ic.x xVar = zVar.f6815h;
                synchronized (xVar) {
                    xVar.f6800b.d(wVar.f6797c);
                }
                s9.h hVar = new s9.h();
                zVar.a(wVar, hVar);
                s9.n nVar = hVar.f12263a;
                zVar.h();
                return nVar;
            case 24:
                return dg.b.j(null);
            default:
                return dg.b.j(null);
        }
    }

    @Override // i4.g1
    public Object c(b0 b0Var, s sVar, int i6) {
        switch (this.f6567x) {
            case 0:
                b0Var.getClass();
                throw new ClassCastException();
            case 2:
                b0Var.getClass();
                throw new ClassCastException();
            case 5:
                b0Var.getClass();
                throw new ClassCastException();
            case 7:
                b0Var.getClass();
                throw new ClassCastException();
            default:
                zb.d dVar = b0Var.f6305e;
                b0Var.s(sVar);
                dVar.getClass();
                return j5.l(new s1(-6));
        }
    }

    @Override // qb.d
    public Object d(c6.h hVar) {
        switch (this.f6567x) {
            case 21:
                return AbtRegistrar.a(hVar);
            default:
                Set z10 = hVar.z(lc.a.class);
                lc.c cVar = lc.c.f8327y;
                if (cVar == null) {
                    synchronized (lc.c.class) {
                        try {
                            cVar = lc.c.f8327y;
                            if (cVar == null) {
                                cVar = new lc.c(0);
                                lc.c.f8327y = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new lc.b(z10, cVar);
        }
    }

    @Override // s9.a
    public Object e(Task task) {
        int i6;
        Object obj;
        switch (this.f6567x) {
            case 10:
                i6 = 403;
                break;
            case 11:
                i6 = -1;
                break;
            default:
                s9.n nVar = (s9.n) task;
                synchronized (nVar.f12275a) {
                    w8.x.i("Task is not yet complete", nVar.f12277c);
                    if (!nVar.f12278d) {
                        if (!IOException.class.isInstance(nVar.f12280f)) {
                            Exception exc = nVar.f12280f;
                            if (exc == null) {
                                obj = nVar.f12279e;
                            } else {
                                throw new RuntimeException(exc);
                            }
                        } else {
                            throw ((Throwable) IOException.class.cast(nVar.f12280f));
                        }
                    } else {
                        throw new CancellationException("Task is already canceled.");
                    }
                }
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i6);
    }

    @Override // m3.g
    public boolean f(int i6, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // t0.s
    public w1 v(View v10, w1 w1Var) {
        kotlin.jvm.internal.k.e(v10, "v");
        l0.c f3 = w1Var.f12417a.f(519);
        kotlin.jvm.internal.k.d(f3, "getInsets(...)");
        v10.setPadding(f3.f8062a, f3.f8063b, f3.f8064c, f3.f8065d);
        return w1Var;
    }

    public /* synthetic */ u0(Object obj, int i6) {
        this.f6567x = i6;
    }

    public /* synthetic */ u0(String str, int i6, int i10, o oVar) {
        this.f6567x = 0;
    }

    public /* synthetic */ u0(String str, o oVar, int i6) {
        this.f6567x = i6;
    }
}
