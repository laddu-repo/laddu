package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f888d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.p f890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f891c = 0;

    public b0(sb.p pVar, int i) {
        this.f890b = pVar;
        this.f889a = i;
    }

    public final int a(int i) {
        j1.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f6649y;
        int i10 = iA + aVarB.f6646v;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final j1.a b() {
        ThreadLocal threadLocal = f888d;
        j1.a aVar = (j1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new j1.a();
            threadLocal.set(aVar);
        }
        j1.b bVar = (j1.b) this.f890b.f11742w;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.f6646v;
            int i10 = (this.f889a * 4) + ((ByteBuffer) bVar.f6649y).getInt(i) + i + 4;
            int i11 = ((ByteBuffer) bVar.f6649y).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f6649y;
            aVar.f6649y = byteBuffer;
            if (byteBuffer != null) {
                aVar.f6646v = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f6647w = i12;
                aVar.f6648x = ((ByteBuffer) aVar.f6649y).getShort(i12);
                return aVar;
            }
            aVar.f6646v = 0;
            aVar.f6647w = 0;
            aVar.f6648x = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        j1.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f6649y).getInt(iA + aVarB.f6646v) : 0));
        sb2.append(", codepoints:");
        j1.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + aVarB2.f6646v;
            i = ((ByteBuffer) aVarB2.f6649y).getInt(((ByteBuffer) aVarB2.f6649y).getInt(i10) + i10);
        } else {
            i = 0;
        }
        for (int i11 = 0; i11 < i; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
