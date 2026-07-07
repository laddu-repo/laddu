package n6;

import bg.c0;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9062a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9063b = new long[2];

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9064c = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9065d = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    public boolean f9066e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9067f;

    /* renamed from: g, reason: collision with root package name */
    public a2.c f9068g;

    /* renamed from: h, reason: collision with root package name */
    public int f9069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f9070i;

    public a(e eVar, String str) {
        this.f9070i = eVar;
        this.f9062a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i6 = 0; i6 < 2; i6++) {
            sb2.append(i6);
            this.f9064c.add(this.f9070i.f9077x.d(sb2.toString()));
            sb2.append(".tmp");
            this.f9065d.add(this.f9070i.f9077x.d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final b a() {
        if (!this.f9066e || this.f9068g != null || this.f9067f) {
            return null;
        }
        ArrayList arrayList = this.f9064c;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            e eVar = this.f9070i;
            if (i6 < size) {
                if (!eVar.M.f((c0) arrayList.get(i6))) {
                    try {
                        eVar.b0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i6++;
            } else {
                this.f9069h++;
                return new b(eVar, this);
            }
        }
    }
}
