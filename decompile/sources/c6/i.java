package c6;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements da.a0, l2.w, o6.a, u0.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f2195x;

    public /* synthetic */ i(char c10, int i) {
        this.f2193v = i;
    }

    @Override // o6.a
    public b0 a(b0 b0Var, a6.i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) b0Var.get()).compress((Bitmap.CompressFormat) this.f2195x, this.f2194w, byteArrayOutputStream);
        b0Var.e();
        return new j6.a0(byteArrayOutputStream.toByteArray());
    }

    @Override // l2.w
    public MediaCodecInfo b(int i) {
        if (((MediaCodecInfo[]) this.f2195x) == null) {
            this.f2195x = new MediaCodecList(this.f2194w).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2195x)[i];
    }

    @Override // l2.w
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // da.a0
    public /* synthetic */ ListenableFuture call() {
        return ((mb) this.f2195x).A(this.f2194w);
    }

    @Override // l2.w
    public int d() {
        if (((MediaCodecInfo[]) this.f2195x) == null) {
            this.f2195x = new MediaCodecList(this.f2194w).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2195x).length;
    }

    @Override // l2.w
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // u0.m
    public boolean f(View view) {
        ((BottomSheetBehavior) this.f2195x).B(this.f2194w);
        return true;
    }

    @Override // l2.w
    public boolean g() {
        return true;
    }

    public void h(long j8) {
        int i = this.f2194w;
        long[] jArr = (long[]) this.f2195x;
        if (i == jArr.length) {
            this.f2195x = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.f2195x;
        int i10 = this.f2194w;
        this.f2194w = i10 + 1;
        jArr2[i10] = j8;
    }

    public void i(long[] jArr) {
        int length = this.f2194w + jArr.length;
        long[] jArr2 = (long[]) this.f2195x;
        if (length > jArr2.length) {
            this.f2195x = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f2195x, this.f2194w, jArr.length);
        this.f2194w = length;
    }

    public void j(int i, int i10) {
        int i11 = i10 + i;
        char[] cArr = (char[]) this.f2195x;
        if (cArr.length <= i11) {
            int i12 = i * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            de.i.d(cArrCopyOf, "copyOf(...)");
            this.f2195x = cArrCopyOf;
        }
    }

    public long k(int i) {
        if (i >= 0 && i < this.f2194w) {
            return ((long[]) this.f2195x)[i];
        }
        StringBuilder sbO = d0.d.o(i, "Invalid index ", ", size is ");
        sbO.append(this.f2194w);
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public boolean l() {
        return ((v5.a) this.f2195x) != null;
    }

    public void m(int i, vf.b bVar) {
        while (true) {
            int i10 = i >> 1;
            if (i10 == 0) {
                break;
            }
            vf.b bVar2 = ((vf.b[]) this.f2195x)[i10];
            de.i.b(bVar2);
            if (de.i.g(0L, bVar.f13601g - bVar2.f13601g) <= 0) {
                break;
            }
            bVar2.f = i;
            ((vf.b[]) this.f2195x)[i] = bVar2;
            i = i10;
        }
        ((vf.b[]) this.f2195x)[i] = bVar;
        bVar.f = i;
    }

    public long n(w2.l lVar) {
        w1.t tVar = (w1.t) this.f2195x;
        int i = 0;
        lVar.v(tVar.f13738a, 0, 1, false);
        int i10 = tVar.f13738a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        lVar.v(tVar.f13738a, 1, i12, false);
        while (i < i12) {
            i++;
            i13 = (tVar.f13738a[i] & 255) + (i13 << 8);
        }
        this.f2194w = i12 + 1 + this.f2194w;
        return i13;
    }

    public void o() {
        cf.b bVar = cf.b.f2305c;
        char[] cArr = (char[]) this.f2195x;
        bVar.getClass();
        de.i.e(cArr, "array");
        synchronized (bVar) {
            int i = bVar.f791a;
            if (cArr.length + i < cf.a.f2304a) {
                bVar.f791a = i + cArr.length;
                ((pd.h) bVar.f792b).addLast(cArr);
            }
        }
    }

    public void p(vf.b bVar) {
        vf.b bVar2;
        int i = bVar.f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = this.f2194w;
        vf.b bVar3 = ((vf.b[]) this.f2195x)[i10];
        de.i.b(bVar3);
        bVar.f = -1;
        ((vf.b[]) this.f2195x)[i10] = null;
        this.f2194w = i10 - 1;
        if (bVar == bVar3) {
            return;
        }
        int iG = de.i.g(0L, bVar3.f13601g - bVar.f13601g);
        if (iG == 0) {
            ((vf.b[]) this.f2195x)[i] = bVar3;
            bVar3.f = i;
            return;
        }
        if (iG >= 0) {
            m(i, bVar3);
            return;
        }
        while (true) {
            int i11 = i << 1;
            int i12 = i11 + 1;
            int i13 = this.f2194w;
            if (i12 > i13) {
                if (i11 > i13) {
                    break;
                }
                bVar2 = ((vf.b[]) this.f2195x)[i11];
                de.i.b(bVar2);
            } else {
                bVar2 = ((vf.b[]) this.f2195x)[i11];
                de.i.b(bVar2);
                vf.b bVar4 = ((vf.b[]) this.f2195x)[i12];
                de.i.b(bVar4);
                if (de.i.g(0L, bVar4.f13601g - bVar2.f13601g) >= 0) {
                    bVar2 = bVar4;
                }
            }
            if (de.i.g(0L, bVar2.f13601g - bVar3.f13601g) <= 0) {
                break;
            }
            int i14 = bVar2.f;
            bVar2.f = i;
            ((vf.b[]) this.f2195x)[i] = bVar2;
            i = i14;
        }
        ((vf.b[]) this.f2195x)[i] = bVar3;
        bVar3.f = i;
    }

    public void q(String str) {
        de.i.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        j(this.f2194w, length);
        str.getChars(0, str.length(), (char[]) this.f2195x, this.f2194w);
        this.f2194w += length;
    }

    public String toString() {
        switch (this.f2193v) {
            case 1:
                return new String((char[]) this.f2195x, 0, this.f2194w);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i, int i10, Object obj) {
        this.f2193v = i10;
        this.f2195x = obj;
        this.f2194w = i;
    }

    public i(q7.b bVar, int i) {
        this.f2193v = 7;
        t7.y.g(bVar);
        this.f2195x = bVar;
        this.f2194w = i;
    }

    public i(int i, String str) {
        this.f2193v = 14;
        this.f2194w = i;
        this.f2195x = str;
    }

    public i(int i) {
        this.f2193v = 13;
        this.f2195x = new long[i];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(int i, byte b9) {
        this(32);
        this.f2193v = i;
        switch (i) {
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                this.f2195x = Bitmap.CompressFormat.JPEG;
                this.f2194w = 100;
                break;
            case 10:
                this.f2194w = 255;
                this.f2195x = null;
                break;
            case 13:
                break;
            default:
                this.f2195x = new w1.t(8);
                break;
        }
    }

    public i(boolean z2, boolean z10, boolean z11) {
        this.f2193v = 3;
        this.f2194w = (z2 || z10 || z11) ? 1 : 0;
    }
}
