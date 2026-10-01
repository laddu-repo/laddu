package w3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13730a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13731b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f13732c;

    /* renamed from: d, reason: collision with root package name */
    public int f13733d;

    /* renamed from: e, reason: collision with root package name */
    public int f13734e;

    /* renamed from: f, reason: collision with root package name */
    public int f13735f;

    /* renamed from: g, reason: collision with root package name */
    public int f13736g;

    /* renamed from: h, reason: collision with root package name */
    public int f13737h;

    public b(int i6, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f13730a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13731b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f13732c = sb2;
        this.f13736g = i6;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f13733d = 15;
        this.f13734e = 0;
        this.f13735f = 0;
        this.f13737h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f13732c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f13732c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f13730a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i6 = aVar.f13729c;
                if (i6 == length) {
                    aVar.f13729c = i6 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final t1.b c(int i6) {
        int i10;
        float f3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f13731b;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i11));
            spannableStringBuilder.append('\n');
            i11++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i12 = this.f13734e + this.f13735f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        if (i6 != Integer.MIN_VALUE) {
            i10 = i6;
        } else if (this.f13736g == 2 && (Math.abs(i13) < 3 || length < 0)) {
            i10 = 1;
        } else if (this.f13736g == 2 && i13 > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                i12 = 32 - length;
            }
            f3 = ((i12 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f3 = 0.5f;
        }
        int i14 = this.f13733d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f13736g == 1) {
            i14 -= this.f13737h - 1;
        }
        return new t1.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f3, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    }

    public final SpannableString d() {
        int i6;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13732c);
        int length = spannableStringBuilder.length();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f13730a;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z12 = aVar.f13728b;
            int i16 = aVar.f13727a;
            if (i16 != 8) {
                if (i16 == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i16 != 7) {
                    i15 = c.B[i16];
                }
                z11 = z10;
            }
            int i17 = aVar.f13729c;
            i10++;
            if (i10 < arrayList.size()) {
                i6 = ((a) arrayList.get(i10)).f13729c;
            } else {
                i6 = length;
            }
            if (i17 != i6) {
                if (i11 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z12) {
                    i11 = i17;
                }
                if (i12 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                    i12 = -1;
                } else if (i12 == -1 && z11) {
                    i12 = i17;
                }
                if (i15 != i14) {
                    if (i14 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, i17, 33);
                    }
                    i14 = i15;
                    i13 = i17;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
        }
        if (i13 != length && i14 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f13730a.isEmpty() && this.f13731b.isEmpty() && this.f13732c.length() == 0) {
            return true;
        }
        return false;
    }
}
