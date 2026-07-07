package lg;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.k1;
import cb.m;
import cb.n;
import cf.o;
import com.google.firebase.messaging.FirebaseMessaging;
import com.unity3d.services.UnityAdsConstants;
import db.k0;
import i4.t;
import i4.u0;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import jb.g;
import k6.e;
import kotlin.jvm.internal.k;
import qb.h;
import r1.e0;
import r1.q0;
import ua.i;
import ve.l;
import x.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {
    public static int d(int i6, int i10) {
        boolean z10;
        long j = i6 + i10;
        int i11 = (int) j;
        if (j == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i11;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i6 + ", " + i10 + ")");
    }

    public static qb.b e(String str, String str2) {
        lc.a aVar = new lc.a(str, str2);
        qb.a a10 = qb.b.a(lc.a.class);
        a10.f11148c = 1;
        a10.f11152g = new b2.d(aVar);
        return a10.b();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [k6.e, java.lang.Object] */
    public static e f(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static k1 g(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    k.b(newInstance);
                    return (k1) newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                }
            }
            throw new RuntimeException("Cannot create an instance of " + cls);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    public static final void h(BufferedReader bufferedReader, l lVar) {
        try {
            Iterator it = new cf.a(new o(bufferedReader, 3)).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jb.b.j(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static qb.b i(String str, u0 u0Var) {
        qb.a a10 = qb.b.a(lc.a.class);
        a10.f11148c = 1;
        a10.a(h.a(Context.class));
        a10.f11152g = new b2.b(10, str, u0Var);
        return a10.b();
    }

    public static final FirebaseMessaging j() {
        FirebaseMessaging firebaseMessaging;
        k7.c cVar = FirebaseMessaging.f2839l;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(g.c());
        }
        k.d(firebaseMessaging, "getInstance()");
        return firebaseMessaging;
    }

    public static q0 k(q0 q0Var, q0 q0Var2) {
        if (q0Var != null) {
            r1.o oVar = q0Var.f11684a;
            if (q0Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i6 = 0; i6 < oVar.f11592a.size(); i6++) {
                    if (q0Var2.a(oVar.b(i6))) {
                        int b10 = oVar.b(i6);
                        u1.c.g(!false);
                        sparseBooleanArray.append(b10, true);
                    }
                }
                u1.c.g(!false);
                return new q0(new r1.o(sparseBooleanArray));
            }
        }
        return q0.f11682b;
    }

    public static cb.l l(cb.l lVar) {
        if (!(lVar instanceof n)) {
            if (lVar instanceof m) {
                return lVar;
            }
            if (lVar instanceof Serializable) {
                return new m(lVar);
            }
            return new n(lVar);
        }
        return lVar;
    }

    public static int m(int i6) {
        int i10 = i6 % 65536;
        if (i10 >= 0) {
            return i10;
        }
        return i10 + 65536;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e2, code lost:
    
        r0 = android.support.v4.media.session.b.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        c9.a.c(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d5.h p(g5.a r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.c.p(g5.a, java.lang.String):d5.h");
    }

    public static final String q(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        k.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static void r(r1.u0 u0Var, t tVar) {
        int i6 = tVar.f6556b;
        long j = tVar.f6557c;
        k0 k0Var = tVar.f6555a;
        if (i6 == -1) {
            if (u0Var.n0(20)) {
                u0Var.P0(k0Var);
                return;
            } else {
                if (!k0Var.isEmpty()) {
                    u0Var.z((e0) k0Var.get(0));
                    return;
                }
                return;
            }
        }
        if (u0Var.n0(20)) {
            u0Var.R(k0Var, tVar.f6556b, j);
        } else if (!k0Var.isEmpty()) {
            u0Var.o((e0) k0Var.get(0), j);
        }
    }

    public static void s(View view, i iVar) {
        ia.a aVar = iVar.f13000y.f12980c;
        if (aVar != null && aVar.f6710a) {
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f3 += ((View) parent).getElevation();
            }
            ua.g gVar = iVar.f13000y;
            if (gVar.f12989m != f3) {
                gVar.f12989m = f3;
                iVar.x();
            }
        }
    }

    public abstract boolean a(x.g gVar, x.c cVar, x.c cVar2);

    public abstract boolean b(x.g gVar, Object obj, Object obj2);

    public abstract boolean c(x.g gVar, f fVar, f fVar2);

    public abstract void n(f fVar, f fVar2);

    public abstract void o(f fVar, Thread thread);
}
