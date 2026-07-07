package jd;

import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements AutoCloseable {

    /* renamed from: x, reason: collision with root package name */
    public final q f7396x;

    /* renamed from: y, reason: collision with root package name */
    public final InputStream f7397y;

    /* renamed from: z, reason: collision with root package name */
    public final ve.a f7398z;

    public p(q qVar, InputStream inputStream, androidx.lifecycle.i iVar) {
        this.f7396x = qVar;
        this.f7397y = inputStream;
        this.f7398z = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            this.f7397y.close();
        } catch (Throwable th) {
            he.a.b(th);
        }
        ve.a aVar = this.f7398z;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7396x == pVar.f7396x && kotlin.jvm.internal.k.a(this.f7397y, pVar.f7397y) && kotlin.jvm.internal.k.a(this.f7398z, pVar.f7398z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f7397y.hashCode() + (this.f7396x.hashCode() * 31)) * 31;
        ve.a aVar = this.f7398z;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "PreparedStream(type=" + this.f7396x + ", stream=" + this.f7397y + ", cleanup=" + this.f7398z + ")";
    }
}
