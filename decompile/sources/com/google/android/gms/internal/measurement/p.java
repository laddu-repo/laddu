package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2385x;

    /* renamed from: y, reason: collision with root package name */
    public int f2386y = 0;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2387z;

    public /* synthetic */ p(Object obj, int i6) {
        this.f2385x = i6;
        this.f2387z = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2385x) {
            case 0:
                if (this.f2386y < ((q) this.f2387z).f2396x.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f2386y < ((q) this.f2387z).f2396x.length()) {
                    return true;
                }
                return false;
            default:
                if (this.f2386y < ((d) this.f2387z).m()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f2385x) {
            case 0:
                String str = ((q) this.f2387z).f2396x;
                int i6 = this.f2386y;
                if (i6 < str.length()) {
                    this.f2386y = i6 + 1;
                    return new q(String.valueOf(i6));
                }
                throw new NoSuchElementException();
            case 1:
                q qVar = (q) this.f2387z;
                String str2 = qVar.f2396x;
                int i10 = this.f2386y;
                if (i10 < str2.length()) {
                    this.f2386y = i10 + 1;
                    return new q(String.valueOf(qVar.f2396x.charAt(i10)));
                }
                throw new NoSuchElementException();
            default:
                d dVar = (d) this.f2387z;
                if (this.f2386y < dVar.m()) {
                    int i11 = this.f2386y;
                    this.f2386y = i11 + 1;
                    return dVar.n(i11);
                }
                int i12 = this.f2386y;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 21);
                sb2.append("Out of bounds index: ");
                sb2.append(i12);
                throw new NoSuchElementException(sb2.toString());
        }
    }
}
