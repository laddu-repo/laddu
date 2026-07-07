package re;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11403b;

    public /* synthetic */ t(int i, String str) {
        this.f11402a = i;
        this.f11403b = str;
    }

    public static t c(w1.t tVar) {
        String str;
        tVar.K(2);
        int iX = tVar.x();
        int i = iX >> 1;
        int iX2 = ((tVar.x() >> 3) & 31) | ((iX & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbB = y.e.b(str);
        sbB.append(i < 10 ? ".0" : ".");
        sbB.append(i);
        return new t(1, u5.a.b(iX2, iX2 < 10 ? ".0" : ".", sbB));
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f11403b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }

    public String toString() {
        switch (this.f11402a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return "<" + this.f11403b + '>';
            default:
                return super.toString();
        }
    }

    public t(String str) {
        this.f11402a = 2;
        str.getClass();
        this.f11403b = str;
    }
}
