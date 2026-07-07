package i3;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import r1.j0;
import u1.s;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c9.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6294d;

    public static j3.a x(t tVar) {
        String t10 = tVar.t();
        t10.getClass();
        String t11 = tVar.t();
        t11.getClass();
        return new j3.a(t10, t11, tVar.s(), tVar.s(), Arrays.copyOfRange(tVar.f12811a, tVar.f12812b, tVar.f12813c));
    }

    @Override // c9.a
    public final j0 e(h3.a aVar, ByteBuffer byteBuffer) {
        switch (this.f6294d) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                s sVar = new s(byteBuffer.limit(), byteBuffer.array());
                int i6 = 12;
                sVar.t(12);
                int f3 = (sVar.f() + sVar.i(12)) - 4;
                sVar.t(44);
                sVar.u(sVar.i(12));
                sVar.t(16);
                ArrayList arrayList = new ArrayList();
                while (sVar.f() < f3) {
                    sVar.t(48);
                    int i10 = sVar.i(8);
                    sVar.t(4);
                    int f10 = sVar.f() + sVar.i(i6);
                    String str = null;
                    String str2 = null;
                    while (sVar.f() < f10) {
                        int i11 = sVar.i(8);
                        int i12 = sVar.i(8);
                        int f11 = sVar.f() + i12;
                        if (i11 == 2) {
                            int i13 = sVar.i(16);
                            sVar.t(8);
                            if (i13 == 3) {
                                while (sVar.f() < f11) {
                                    int i14 = sVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i14];
                                    sVar.l(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = sVar.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        sVar.u(sVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i12];
                            sVar.l(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        sVar.q(f11 * 8);
                    }
                    sVar.q(f10 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                    i6 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new j0(arrayList);
            default:
                return new j0(x(new t(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
