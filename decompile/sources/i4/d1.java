package i4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 implements r {

    /* renamed from: x, reason: collision with root package name */
    public final j f6339x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6340y;

    public d1(j jVar, int i6) {
        this.f6339x = jVar;
        this.f6340y = i6;
    }

    @Override // i4.r
    public final void a(int i6, s1 s1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(s1.f6547e, s1Var.f6551a);
        bundle.putBundle(s1.f6548f, s1Var.f6552b);
        bundle.putLong(s1.f6549g, s1Var.f6553c);
        q1 q1Var = s1Var.f6554d;
        if (q1Var != null) {
            bundle.putBundle(s1.f6550h, q1Var.a());
        }
        i iVar = (i) this.f6339x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i6);
            jb.b.a(obtain, bundle);
            iVar.f6397e.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // i4.r
    public final void b(int i6) {
        i iVar = (i) this.f6339x;
        iVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i6);
            iVar.f6397e.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // i4.r
    public final void c(int i6, r1 r1Var, boolean z10, boolean z11, int i10) {
        Bundle b10 = r1Var.a(z10, z11).b(i10);
        i iVar = (i) this.f6339x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i6);
            jb.b.a(obtain, b10);
            iVar.f6397e.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // i4.r
    public final void d(int i6, r1.q0 q0Var) {
        Bundle b10 = q0Var.b();
        i iVar = (i) this.f6339x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i6);
            jb.b.a(obtain, b10);
            iVar.f6397e.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // i4.r
    public final void e(int i6, m mVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(m.f6452d, mVar.f6456a);
        bundle.putLong(m.f6453e, mVar.f6457b);
        bundle.putBundle(m.f6455g, mVar.f6458c.a());
        bundle.putInt(m.f6454f, 4);
        i iVar = (i) this.f6339x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i6);
            jb.b.a(obtain, bundle);
            iVar.f6397e.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == d1.class) {
            return Objects.equals(((i) this.f6339x).asBinder(), ((i) ((d1) obj).f6339x).asBinder());
        }
        return false;
    }

    @Override // i4.r
    public final void f(int i6, o1 o1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(o1.f6489f, o1Var.f6492a);
        bundle2.putString(o1.f6490g, o1Var.f6493b);
        bundle2.putBundle(o1.f6491h, o1Var.f6494c);
        i iVar = (i) this.f6339x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i6);
            jb.b.a(obtain, bundle2);
            jb.b.a(obtain, bundle);
            iVar.f6397e.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // i4.r
    public final void g(int i6, j1 j1Var, r1.q0 q0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i10 = this.f6340y;
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        u1.c.g(z12);
        if (!z10 && q0Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z11 || !q0Var.a(30)) {
            z13 = true;
        }
        j jVar = this.f6339x;
        if (i10 >= 2) {
            Bundle f3 = j1Var.e(q0Var, z10, z11).f(i10);
            Bundle bundle = new Bundle();
            bundle.putBoolean(i1.f6401a, r32);
            bundle.putBoolean(i1.f6402b, z13);
            i iVar = (i) jVar;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i6);
                jb.b.a(obtain, f3);
                jb.b.a(obtain, bundle);
                iVar.f6397e.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f10 = j1Var.e(q0Var, z10, true).f(i10);
        i iVar2 = (i) jVar;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i6);
            jb.b.a(obtain, f10);
            obtain.writeInt(r32);
            iVar2.f6397e.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    public final int hashCode() {
        return Objects.hash(((i) this.f6339x).asBinder());
    }

    @Override // i4.r
    public final void onDisconnected() {
        cf.m.g(this.f6339x);
    }
}
