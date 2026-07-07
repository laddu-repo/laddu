package s2;

import java.nio.ByteBuffer;
import v3.i;
import v3.j;
import v3.m;
import y1.f;
import y1.h;
import y1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends k implements v3.e {

    /* renamed from: o, reason: collision with root package name */
    public final String f12029o;

    /* renamed from: p, reason: collision with root package name */
    public final m f12030p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.f12029o = str;
        p(1024);
        this.f12030p = mVar;
    }

    @Override // y1.k
    public final h g() {
        return new i();
    }

    @Override // y1.e
    public final String getName() {
        return this.f12029o;
    }

    @Override // y1.k
    public final y1.j h() {
        return new v3.c(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y1.f, java.lang.Exception] */
    @Override // y1.k
    public final f i(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override // y1.k
    public final f j(h hVar, y1.j jVar, boolean z10) {
        i iVar = (i) hVar;
        j jVar2 = (j) jVar;
        try {
            ByteBuffer byteBuffer = iVar.f14812z;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f12030p;
            if (z10) {
                mVar.reset();
            }
            v3.d g10 = mVar.g(array, 0, limit);
            long j = iVar.B;
            long j10 = iVar.F;
            jVar2.timeUs = j;
            jVar2.f13280x = g10;
            if (j10 != Long.MAX_VALUE) {
                j = j10;
            }
            jVar2.f13281y = j;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (v3.f e10) {
            return e10;
        }
    }

    @Override // v3.e
    public final void c(long j) {
    }
}
