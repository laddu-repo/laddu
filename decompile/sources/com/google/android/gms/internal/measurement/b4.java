package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b4 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2155a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(g4 g4Var) {
        super(null);
        this.f2156b = g4Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f2155a) {
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Cursor cursor;
        switch (this.f2155a) {
            case 0:
                ((AtomicBoolean) ((p.q3) this.f2156b).f10362x).set(true);
                return;
            case 1:
                g4 g4Var = (g4) this.f2156b;
                synchronized (g4Var.f2222e) {
                    g4Var.f2223f = null;
                    g4Var.f2220c.run();
                }
                synchronized (g4Var) {
                    try {
                        Iterator it = g4Var.f2224g.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                p.a3 a3Var = (p.a3) this.f2156b;
                if (a3Var.f14455y && (cursor = a3Var.f14456z) != null && !cursor.isClosed()) {
                    a3Var.f14454x = a3Var.f14456z.requery();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(p.q3 q3Var) {
        super(null);
        Objects.requireNonNull(q3Var);
        this.f2156b = q3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(p.a3 a3Var) {
        super(new Handler());
        this.f2156b = a3Var;
    }
}
