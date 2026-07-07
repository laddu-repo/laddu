package e1;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f4195d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f4196a;

    /* renamed from: b, reason: collision with root package name */
    public final ic.s f4197b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f4198c = 0;

    public w(ic.s sVar, int i6) {
        this.f4197b = sVar;
        this.f4196a = i6;
    }

    public final int a(int i6) {
        f1.a b10 = b();
        int a10 = b10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b10.A;
            int i10 = a10 + b10.f4630x;
            return byteBuffer.getInt((i6 * 4) + byteBuffer.getInt(i10) + i10 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, f1.c] */
    public final f1.a b() {
        ThreadLocal threadLocal = f4195d;
        f1.a aVar = (f1.a) threadLocal.get();
        f1.a aVar2 = aVar;
        if (aVar == null) {
            ?? cVar = new f1.c();
            threadLocal.set(cVar);
            aVar2 = cVar;
        }
        f1.b bVar = (f1.b) this.f4197b.f6781x;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i6 = a10 + bVar.f4630x;
            int i10 = (this.f4196a * 4) + ((ByteBuffer) bVar.A).getInt(i6) + i6 + 4;
            int i11 = ((ByteBuffer) bVar.A).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.A;
            aVar2.A = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f4630x = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar2.f4631y = i12;
                aVar2.f4632z = ((ByteBuffer) aVar2.A).getShort(i12);
                return aVar2;
            }
            aVar2.f4630x = 0;
            aVar2.f4631y = 0;
            aVar2.f4632z = 0;
        }
        return aVar2;
    }

    public final String toString() {
        int i6;
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        f1.a b10 = b();
        int a10 = b10.a(4);
        if (a10 != 0) {
            i6 = ((ByteBuffer) b10.A).getInt(a10 + b10.f4630x);
        } else {
            i6 = 0;
        }
        sb2.append(Integer.toHexString(i6));
        sb2.append(", codepoints:");
        f1.a b11 = b();
        int a11 = b11.a(16);
        if (a11 != 0) {
            int i11 = a11 + b11.f4630x;
            i10 = ((ByteBuffer) b11.A).getInt(((ByteBuffer) b11.A).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
