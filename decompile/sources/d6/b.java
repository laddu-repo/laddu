package d6;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import g6.j;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import n9.c1;
import n9.h0;
import n9.h3;
import n9.l4;
import n9.m2;
import n9.n1;
import n9.u0;
import n9.y1;
import s8.h;
import s8.l;
import s8.m;
import s9.n;
import t0.d1;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3821x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3822y;

    /* renamed from: z, reason: collision with root package name */
    public Object f3823z;

    public /* synthetic */ b(int i6) {
        this.f3821x = i6;
    }

    private final void a() {
        AtomicReference atomicReference;
        h3 h3Var;
        n1 n1Var;
        c1 c1Var;
        AtomicReference atomicReference2 = (AtomicReference) this.f3823z;
        synchronized (atomicReference2) {
            try {
                try {
                    h3Var = (h3) this.A;
                    n1Var = (n1) h3Var.f4301y;
                    c1Var = n1Var.B;
                    n1.e(c1Var);
                } catch (Throwable th) {
                    ((AtomicReference) this.f3823z).notify();
                    throw th;
                }
            } catch (RemoteException e10) {
                u0 u0Var = ((n1) ((h3) this.A).f4301y).C;
                n1.g(u0Var);
                u0Var.D.b(e10, "Failed to get app instance id");
                atomicReference = (AtomicReference) this.f3823z;
            }
            if (!c1Var.k1().i(y1.ANALYTICS_STORAGE)) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.I.a("Analytics storage consent denied; will not get app instance id");
                m2 m2Var = ((n1) h3Var.f4301y).J;
                n1.f(m2Var);
                m2Var.E.set(null);
                c1 c1Var2 = n1Var.B;
                n1.e(c1Var2);
                c1Var2.E.m(null);
                atomicReference2.set(null);
            } else {
                h0 h0Var = h3Var.B;
                if (h0Var == null) {
                    u0 u0Var3 = n1Var.C;
                    n1.g(u0Var3);
                    u0Var3.D.a("Failed to get app instance id");
                } else {
                    atomicReference2.set(h0Var.I((l4) this.f3822y));
                    String str = (String) atomicReference2.get();
                    if (str != null) {
                        m2 m2Var2 = ((n1) h3Var.f4301y).J;
                        n1.f(m2Var2);
                        m2Var2.E.set(str);
                        c1 c1Var3 = n1Var.B;
                        n1.e(c1Var3);
                        c1Var3.E.m(str);
                    }
                    h3Var.q1();
                    atomicReference = (AtomicReference) this.f3823z;
                    atomicReference.notify();
                    return;
                }
            }
            atomicReference2.notify();
        }
    }

    private final void b() {
        int i6;
        n k8;
        s8.a aVar = (s8.a) this.f3822y;
        Intent intent = aVar.f12224x;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        boolean isEmpty = TextUtils.isEmpty(stringExtra);
        Integer num = null;
        if (isEmpty) {
            k8 = dg.b.j(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aVar.f12224x;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aVar.f12224x;
            if (intent3.hasExtra("google.product_id")) {
                num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
            }
            if (num != null) {
                bundle.putInt("google.product_id", num.intValue());
            }
            Context context = (Context) this.f3823z;
            bundle.putBoolean("supports_message_handled", true);
            s8.n j = s8.n.j(context);
            synchronized (j) {
                i6 = j.f12259a;
                j.f12259a = i6 + 1;
            }
            k8 = j.k(new m(i6, 2, bundle, 0));
        }
        k8.i(h.f12240y, new lc.c((CountDownLatch) this.A));
    }

    private final void c() {
        String str = (String) this.f3822y;
        w5.m mVar = (w5.m) this.A;
        try {
            try {
                v5.n nVar = (v5.n) ((j) this.f3823z).get();
                if (nVar == null) {
                    o.f().e(w5.m.Q, mVar.B.f4373c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                } else {
                    o.f().b(w5.m.Q, String.format("%s returned a %s result.", mVar.B.f4373c, nVar), new Throwable[0]);
                    mVar.E = nVar;
                }
                mVar.b();
            } catch (InterruptedException e10) {
                e = e10;
                o.f().e(w5.m.Q, str + " failed because it threw an exception/error", e);
                mVar.b();
            } catch (CancellationException e11) {
                o.f().g(w5.m.Q, str + " was cancelled", e11);
                mVar.b();
            } catch (ExecutionException e12) {
                e = e12;
                o.f().e(w5.m.Q, str + " failed because it threw an exception/error", e);
                mVar.b();
            }
        } catch (Throwable th) {
            mVar.b();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.run():void");
    }

    public /* synthetic */ b(int i6, Object obj, Object obj2, Object obj3, boolean z10) {
        this.f3821x = i6;
        this.f3823z = obj;
        this.f3822y = obj2;
        this.A = obj3;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i6) {
        this.f3821x = i6;
        this.A = obj;
        this.f3823z = obj2;
        this.f3822y = obj3;
    }

    public b(h3 h3Var, AtomicReference atomicReference, l4 l4Var) {
        this.f3821x = 7;
        this.f3823z = atomicReference;
        this.f3822y = l4Var;
        Objects.requireNonNull(h3Var);
        this.A = h3Var;
    }

    public b(View view, d1 d1Var, l lVar, ValueAnimator valueAnimator) {
        this.f3821x = 13;
        this.f3823z = view;
        this.f3822y = lVar;
        this.A = valueAnimator;
    }
}
