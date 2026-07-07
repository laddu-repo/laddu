package j6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements a6.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.m f6970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6971c;

    public s(a6.m mVar, boolean z2) {
        this.f6970b = mVar;
        this.f6971c = z2;
    }

    @Override // a6.f
    public final void a(MessageDigest messageDigest) {
        this.f6970b.a(messageDigest);
    }

    @Override // a6.m
    public final c6.b0 b(Context context, c6.b0 b0Var, int i, int i10) {
        d6.a aVar = com.bumptech.glide.b.a(context).f2342v;
        Drawable drawable = (Drawable) b0Var.get();
        d dVarB = r.b(aVar, drawable, i, i10);
        if (dVarB != null) {
            c6.b0 b0VarB = this.f6970b.b(context, dVarB, i, i10);
            if (!b0VarB.equals(dVarB)) {
                return new d(context.getResources(), b0VarB);
            }
            b0VarB.e();
            return b0Var;
        }
        if (!this.f6971c) {
            return b0Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // a6.f
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f6970b.equals(((s) obj).f6970b);
        }
        return false;
    }

    @Override // a6.f
    public final int hashCode() {
        return this.f6970b.hashCode();
    }
}
