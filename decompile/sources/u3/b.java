package u3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f12817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12819e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12821h;

    public b(int i, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f12815a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f12816b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f12817c = sb2;
        this.f12820g = i;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f12818d = 15;
        this.f12819e = 0;
        this.f = 0;
        this.f12821h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f12817c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f12817c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f12815a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i = aVar.f12814c;
                if (i != length) {
                    return;
                }
                aVar.f12814c = i - 1;
            }
        }
    }

    public final v1.b c(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12816b;
            if (i10 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
            spannableStringBuilder.append('\n');
            i10++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i11 = this.f12819e + this.f;
        int length = (32 - i11) - spannableStringBuilder.length();
        int i12 = i11 - length;
        int i13 = i != Integer.MIN_VALUE ? i : (this.f12820g != 2 || (Math.abs(i12) >= 3 && length >= 0)) ? (this.f12820g != 2 || i12 <= 0) ? 0 : 2 : 1;
        if (i13 != 1) {
            if (i13 == 2) {
                i11 = 32 - length;
            }
            f = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        float f4 = f;
        int i14 = this.f12818d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f12820g == 1) {
            i14 -= this.f12821h - 1;
        }
        return new v1.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f4, i13, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12817c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f12815a;
            if (i13 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i13);
            boolean z10 = aVar.f12813b;
            int i15 = aVar.f12812a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = c.B[i15];
                }
                z2 = z11;
            }
            int i16 = aVar.f12814c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((a) arrayList.get(i13)).f12814c : length)) {
                if (i != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i16, 33);
                    i = -1;
                } else if (i == -1 && z10) {
                    i = i16;
                }
                if (i10 != -1 && !z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z2) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i11 = i12;
                    i14 = i16;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f12815a.isEmpty() && this.f12816b.isEmpty() && this.f12817c.length() == 0;
    }
}
