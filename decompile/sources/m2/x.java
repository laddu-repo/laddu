package m2;

import android.os.Handler;
import db.k0;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements u2.l {
    public final /* synthetic */ z A;

    /* renamed from: x, reason: collision with root package name */
    public final DataInputStream f8546x;

    /* renamed from: y, reason: collision with root package name */
    public final e8.b f8547y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f8548z;

    /* JADX WARN: Type inference failed for: r1v2, types: [e8.b, java.lang.Object] */
    public x(z zVar, InputStream inputStream) {
        this.A = zVar;
        this.f8546x = new DataInputStream(inputStream);
        ?? obj = new Object();
        obj.f4470c = new ArrayList();
        obj.f4468a = 1;
        this.f8547y = obj;
    }

    @Override // u2.l
    public final void h() {
        boolean z10;
        boolean z11;
        String str;
        while (!this.f8548z) {
            byte readByte = this.f8546x.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f8546x.readUnsignedByte();
                int readUnsignedShort = this.f8546x.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f8546x.readFully(bArr, 0, readUnsignedShort);
                h0 h0Var = (h0) this.A.f8554z.get(Integer.valueOf(readUnsignedByte));
                if (h0Var != null && !this.A.C) {
                    h0Var.B.add(bArr);
                }
            } else if (this.A.C) {
                continue;
            } else {
                j1.f0 f0Var = this.A.f8552x;
                e8.b bVar = this.f8547y;
                DataInputStream dataInputStream = this.f8546x;
                bVar.getClass();
                k0 a10 = bVar.a(e8.b.b(readByte, dataInputStream));
                while (a10 == null) {
                    if (bVar.f4468a == 3) {
                        long j = bVar.f4469b;
                        if (j > 0) {
                            int G = a8.f.G(j);
                            if (G != -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u1.c.g(z10);
                            byte[] bArr2 = new byte[G];
                            dataInputStream.readFully(bArr2, 0, G);
                            ArrayList arrayList = (ArrayList) bVar.f4470c;
                            if (bVar.f4468a == 3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            u1.c.g(z11);
                            if (G > 0) {
                                int i6 = G - 1;
                                if (bArr2[i6] == 10) {
                                    if (G > 1) {
                                        int i10 = G - 2;
                                        if (bArr2[i10] == 13) {
                                            str = new String(bArr2, 0, i10, z.D);
                                            arrayList.add(str);
                                            a10 = k0.k(arrayList);
                                            ((ArrayList) bVar.f4470c).clear();
                                            bVar.f4468a = 1;
                                            bVar.f4469b = 0L;
                                        }
                                    }
                                    str = new String(bArr2, 0, i6, z.D);
                                    arrayList.add(str);
                                    a10 = k0.k(arrayList);
                                    ((ArrayList) bVar.f4470c).clear();
                                    bVar.f4468a = 1;
                                    bVar.f4469b = 0L;
                                }
                            }
                            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                        }
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    a10 = bVar.a(e8.b.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) f0Var.f6907y).post(new a2.c0(29, f0Var, a10));
            }
        }
    }

    @Override // u2.l
    public final void p() {
        this.f8548z = true;
    }
}
