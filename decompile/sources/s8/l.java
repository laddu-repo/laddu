package s8;

import a2.k0;
import a2.n0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import c2.r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.playfy.tv.R;
import com.playfy.tv.activities.PlayerActivity;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import j2.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import n9.e1;
import r1.p1;
import v5.q;
import v5.s;
import v5.t;
import w2.e0;
import w4.i1;
import w4.o1;
import w4.q1;
import w4.r1;
import w8.x;
import x4.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements s9.a, t6.f, s9.c, w1.g, t, g5.b {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12250x;

    /* renamed from: y, reason: collision with root package name */
    public Object f12251y;

    /* renamed from: z, reason: collision with root package name */
    public Object f12252z;

    public /* synthetic */ l(int i6, Object obj, Object obj2) {
        this.f12250x = i6;
        this.f12251y = obj;
        this.f12252z = obj2;
    }

    public static int l(int i6, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i6; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        if (i11 + 1 > i10) {
            return i12 + 1;
        }
        return i12;
    }

    public void A(p1 p1Var) {
        Handler handler = (Handler) this.f12251y;
        if (handler != null) {
            handler.post(new m8.c(13, this, p1Var));
        }
    }

    public void B(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f12251y)) {
            hashMap = new HashMap((Map) this.f12251y);
        }
        synchronized (((Map) this.f12252z)) {
            hashMap2 = new HashMap((Map) this.f12252z);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((s9.h) entry2.getKey()).b(new r(status));
            }
        }
    }

    public void a(Object obj, String str) {
        ((ArrayList) this.f12251y).add(str + "=" + String.valueOf(obj));
    }

    public void b(i1 i1Var, b2.j jVar) {
        v.l lVar = (v.l) this.f12251y;
        r1 r1Var = (r1) lVar.get(i1Var);
        if (r1Var == null) {
            r1Var = r1.a();
            lVar.put(i1Var, r1Var);
        }
        r1Var.f14002c = jVar;
        r1Var.f14000a |= 8;
    }

    @Override // w1.g
    public w1.h c() {
        return new w1.m((Context) this.f12251y, ((d0.g) this.f12252z).c());
    }

    public void d() {
        int[] iArr = (int[]) this.f12251y;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f12252z = null;
    }

    @Override // s9.a
    public Object e(Task task) {
        b bVar = (b) this.f12251y;
        Bundle bundle = (Bundle) this.f12252z;
        bVar.getClass();
        if (!task.h()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.f();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return bVar.a(bundle).k(h.f12241z, d.A);
        }
        return task;
    }

    @Override // t6.f
    public t6.b f(t6.a aVar) {
        t6.d dVar = (t6.d) ((e1) this.f12252z).h(aVar);
        if (dVar != null) {
            return new t6.b(dVar.f12618a, dVar.f12619b);
        }
        return null;
    }

    public void g(a2.h hVar) {
        synchronized (hVar) {
        }
        Handler handler = (Handler) this.f12251y;
        if (handler != null) {
            handler.post(new m8.c(14, this, hVar));
        }
    }

    public void h(int i6) {
        int[] iArr = (int[]) this.f12251y;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i6, 10) + 1];
            this.f12251y = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i6 >= iArr.length) {
            int length = iArr.length;
            while (length <= i6) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f12251y = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f12251y;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View i(int i6, int i10, int i11, int i12) {
        int i13;
        s3.d dVar = (s3.d) this.f12252z;
        q1 q1Var = (q1) this.f12251y;
        int h4 = q1Var.h();
        int n10 = q1Var.n();
        if (i10 > i6) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i6 != i10) {
            View s = q1Var.s(i6);
            int b10 = q1Var.b(s);
            int C = q1Var.C(s);
            dVar.f12056b = h4;
            dVar.f12057c = n10;
            dVar.f12058d = b10;
            dVar.f12059e = C;
            if (i11 != 0) {
                dVar.f12055a = i11;
                if (dVar.a()) {
                    return s;
                }
            }
            if (i12 != 0) {
                dVar.f12055a = i12;
                if (dVar.a()) {
                    view = s;
                }
            }
            i6 += i13;
        }
        return view;
    }

    public synchronized Map j() {
        try {
            if (((Map) this.f12252z) == null) {
                this.f12252z = Collections.unmodifiableMap(new HashMap((HashMap) this.f12251y));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f12252z;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #6 {all -> 0x00b9, blocks: (B:61:0x00b8, B:62:0x00bb, B:63:0x00d3), top: B:59:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb A[Catch: all -> 0x00b9, TryCatch #6 {all -> 0x00b9, blocks: (B:61:0x00b8, B:62:0x00bb, B:63:0x00d3), top: B:59:0x00b6 }] */
    @Override // g5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g5.a k(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.l.k(java.lang.String):g5.a");
    }

    public String m(String str) {
        String str2 = (String) this.f12252z;
        Resources resources = (Resources) this.f12251y;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void n() {
        ((SparseIntArray) this.f12251y).clear();
    }

    public boolean o(View view) {
        s3.d dVar = (s3.d) this.f12252z;
        q1 q1Var = (q1) this.f12251y;
        int h4 = q1Var.h();
        int n10 = q1Var.n();
        int b10 = q1Var.b(view);
        int C = q1Var.C(view);
        dVar.f12056b = h4;
        dVar.f12057c = n10;
        dVar.f12058d = b10;
        dVar.f12059e = C;
        dVar.f12055a = 24579;
        return dVar.a();
    }

    @Override // s9.c
    public void onComplete(Task task) {
        ((Map) ((l) this.f12252z).f12252z).remove((s9.h) this.f12251y);
    }

    @Override // t6.f
    public void p(t6.a aVar, Bitmap bitmap, Map map) {
        int i6;
        int e10 = a8.b.e(bitmap);
        e1 e1Var = (e1) this.f12252z;
        synchronized (((ob.a) e1Var.f13171g)) {
            i6 = e1Var.f13166b;
        }
        if (e10 <= i6) {
            ((e1) this.f12252z).l(aVar, new t6.d(bitmap, map, e10));
        } else {
            ((e1) this.f12252z).m(aVar);
            ((y) this.f12251y).u(aVar, bitmap, map, e10);
        }
    }

    @Override // t6.f
    public void q(int i6) {
        int i10;
        if (i6 >= 40) {
            ((e1) this.f12252z).p(-1);
            return;
        }
        if (10 <= i6 && i6 < 20) {
            e1 e1Var = (e1) this.f12252z;
            synchronized (((ob.a) e1Var.f13171g)) {
                i10 = e1Var.f13167c;
            }
            e1Var.p(i10 / 2);
        }
    }

    public void r(int i6, int i10) {
        int[] iArr = (int[]) this.f12251y;
        if (iArr != null && i6 < iArr.length) {
            int i11 = i6 + i10;
            h(i11);
            int[] iArr2 = (int[]) this.f12251y;
            System.arraycopy(iArr2, i6, iArr2, i11, (iArr2.length - i6) - i10);
            Arrays.fill((int[]) this.f12251y, i6, i11, -1);
            ArrayList arrayList = (ArrayList) this.f12252z;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    o1 o1Var = (o1) ((ArrayList) this.f12252z).get(size);
                    int i12 = o1Var.f13976x;
                    if (i12 >= i6) {
                        o1Var.f13976x = i12 + i10;
                    }
                }
            }
        }
    }

    public void s(int i6, int i10) {
        int[] iArr = (int[]) this.f12251y;
        if (iArr != null && i6 < iArr.length) {
            int i11 = i6 + i10;
            h(i11);
            int[] iArr2 = (int[]) this.f12251y;
            System.arraycopy(iArr2, i11, iArr2, i6, (iArr2.length - i6) - i10);
            int[] iArr3 = (int[]) this.f12251y;
            Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.f12252z;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    o1 o1Var = (o1) ((ArrayList) this.f12252z).get(size);
                    int i12 = o1Var.f13976x;
                    if (i12 >= i6) {
                        if (i12 < i11) {
                            ((ArrayList) this.f12252z).remove(size);
                        } else {
                            o1Var.f13976x = i12 - i10;
                        }
                    }
                }
            }
        }
    }

    public b2.j t(i1 i1Var, int i6) {
        r1 r1Var;
        b2.j jVar;
        v.l lVar = (v.l) this.f12251y;
        int d10 = lVar.d(i1Var);
        if (d10 >= 0 && (r1Var = (r1) lVar.i(d10)) != null) {
            int i10 = r1Var.f14000a;
            if ((i10 & i6) != 0) {
                int i11 = i10 & (~i6);
                r1Var.f14000a = i11;
                if (i6 == 4) {
                    jVar = r1Var.f14001b;
                } else if (i6 == 8) {
                    jVar = r1Var.f14002c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    lVar.g(d10);
                    r1Var.f14000a = 0;
                    r1Var.f14001b = null;
                    r1Var.f14002c = null;
                    r1.f13999d.c(r1Var);
                }
                return jVar;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f12250x) {
            case 3:
                return "Bounds{lower=" + ((l0.c) this.f12251y) + " upper=" + ((l0.c) this.f12252z) + "}";
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f12252z.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f12251y;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    sb2.append((String) arrayList.get(i6));
                    if (i6 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 29:
                String str = "[ ";
                if (((y.f) this.f12251y) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder b10 = y.e.b(str);
                        b10.append(((y.f) this.f12251y).E[i10]);
                        b10.append(" ");
                        str = b10.toString();
                    }
                }
                return str + "] " + ((y.f) this.f12251y);
            default:
                return super.toString();
        }
    }

    public void u(i1 i1Var) {
        r1 r1Var = (r1) ((v.l) this.f12251y).get(i1Var);
        if (r1Var == null) {
            return;
        }
        r1Var.f14000a &= -2;
    }

    public void v(i1 i1Var) {
        v.i iVar = (v.i) this.f12252z;
        int i6 = iVar.i() - 1;
        while (true) {
            if (i6 < 0) {
                break;
            }
            if (i1Var == iVar.j(i6)) {
                Object[] objArr = iVar.f13162z;
                Object obj = objArr[i6];
                Object obj2 = v.j.f13163a;
                if (obj != obj2) {
                    objArr[i6] = obj2;
                    iVar.f13160x = true;
                }
            } else {
                i6--;
            }
        }
        r1 r1Var = (r1) ((v.l) this.f12251y).remove(i1Var);
        if (r1Var != null) {
            r1Var.f14000a = 0;
            r1Var.f14001b = null;
            r1Var.f14002c = null;
            r1.f13999d.c(r1Var);
        }
    }

    public void w(final Object obj) {
        Handler handler = (Handler) this.f12251y;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: w2.d0
                @Override // java.lang.Runnable
                public final void run() {
                    e0 e0Var = (e0) s8.l.this.f12252z;
                    String str = u1.a0.f12750a;
                    n0 n0Var = ((k0) e0Var).f295x;
                    b2.f fVar = n0Var.Q;
                    b2.a V = fVar.V();
                    Object obj2 = obj;
                    fVar.W(V, 26, new b2.d(V, obj2, elapsedRealtime));
                    if (n0Var.f340p0 == obj2) {
                        n0Var.K.e(26, new a2.t(3));
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d A[RETURN] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object x(tg.a r13, b4.h r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.l.x(tg.a, b4.h, boolean):java.lang.Object");
    }

    public void y(int i6, int i10, int i11, int i12) {
        u.a aVar = (u.a) this.f12252z;
        aVar.A.set(i6, i10, i11, i12);
        Rect rect = aVar.f12718z;
        u.a.a(aVar, i6 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    public void z(a8.c cVar) {
        g6.j jVar = (g6.j) this.f12252z;
        ((q0) this.f12251y).g(cVar);
        if (cVar instanceof s) {
            jVar.i((s) cVar);
        } else if (cVar instanceof q) {
            jVar.j(((q) cVar).f13334a);
        }
    }

    public /* synthetic */ l(int i6, boolean z10) {
        this.f12250x = i6;
    }

    public /* synthetic */ l(Object obj, int i6) {
        this.f12250x = i6;
        this.f12252z = obj;
    }

    public /* synthetic */ l(Object obj, Object obj2, int i6, boolean z10) {
        this.f12250x = i6;
        this.f12252z = obj;
        this.f12251y = obj2;
    }

    public l(int i6) {
        this.f12250x = i6;
        switch (i6) {
            case 12:
                this.f12251y = new Rect();
                this.f12252z = new Rect();
                return;
            case 14:
                this.f12251y = new HashMap();
                return;
            case 18:
                this.f12251y = new SparseIntArray();
                this.f12252z = new SparseIntArray();
                return;
            case 21:
                this.f12251y = new v.l(0);
                this.f12252z = new v.i();
                return;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                this.f12251y = new o0();
                this.f12252z = new Object();
                z(t.f13336u);
                return;
            case 25:
                t8.e eVar = t8.e.f12638d;
                this.f12251y = new SparseIntArray();
                this.f12252z = eVar;
                return;
            case 28:
                w8.e eVar2 = new w8.e(2);
                this.f12251y = eVar2;
                this.f12252z = new w4.c(eVar2);
                return;
            default:
                this.f12251y = Collections.synchronizedMap(new WeakHashMap());
                this.f12252z = Collections.synchronizedMap(new WeakHashMap());
                return;
        }
    }

    public l(Context context) {
        this.f12250x = 24;
        x.g(context);
        Resources resources = context.getResources();
        this.f12251y = resources;
        this.f12252z = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public l(IBinder iBinder) {
        this.f12250x = 0;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f12251y = new Messenger(iBinder);
            this.f12252z = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f12252z = new g(iBinder);
            this.f12251y = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ l(Object obj) {
        this.f12250x = 23;
        this.f12252z = obj;
        this.f12251y = new ArrayList();
    }

    public l(y8.b bVar, ob.a aVar) {
        this.f12250x = 8;
        this.f12252z = "ClientTelemetry.API";
        this.f12251y = bVar;
    }

    public l(w wVar) {
        this.f12250x = 27;
        this.f12251y = wVar;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.k.d(newSetFromMap, "newSetFromMap(...)");
        this.f12252z = newSetFromMap;
    }

    public l(x4.s sVar, g5.b actual) {
        this.f12250x = 26;
        kotlin.jvm.internal.k.e(actual, "actual");
        this.f12252z = sVar;
        this.f12251y = actual;
    }

    public l(int i6, y yVar) {
        this.f12250x = 5;
        this.f12251y = yVar;
        this.f12252z = new e1(i6, this);
    }

    public l(b4.h hVar) {
        this.f12250x = 2;
        this.f12251y = hVar;
        this.f12252z = new ArrayList();
    }

    public l(PlayerActivity playerActivity) {
        this.f12250x = 13;
        d0.g gVar = new d0.g();
        this.f12251y = playerActivity.getApplicationContext();
        this.f12252z = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [s3.d, java.lang.Object] */
    public l(q1 q1Var) {
        this.f12250x = 20;
        this.f12251y = q1Var;
        ?? obj = new Object();
        obj.f12055a = 0;
        this.f12252z = obj;
    }

    public l(Handler handler, e0 e0Var) {
        this.f12250x = 16;
        if (e0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f12251y = handler;
        this.f12252z = e0Var;
    }
}
