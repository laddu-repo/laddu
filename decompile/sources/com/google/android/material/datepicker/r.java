package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new android.support.v4.media.a(8);
    public final int A;
    public final int B;
    public final long C;
    public String D;

    /* renamed from: x, reason: collision with root package name */
    public final Calendar f2688x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2689y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2690z;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a10 = y.a(calendar);
        this.f2688x = a10;
        this.f2689y = a10.get(2);
        this.f2690z = a10.get(1);
        this.A = a10.getMaximum(7);
        this.B = a10.getActualMaximum(5);
        this.C = a10.getTimeInMillis();
    }

    public static r a(int i6, int i10) {
        Calendar c10 = y.c(null);
        c10.set(1, i6);
        c10.set(2, i10);
        return new r(c10);
    }

    public static r b(long j) {
        Calendar c10 = y.c(null);
        c10.setTimeInMillis(j);
        return new r(c10);
    }

    public final String c() {
        String formatDateTime;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext unused;
        if (this.D == null) {
            long timeInMillis = this.f2688x.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = y.f2699a;
                instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                timeZone = TimeZone.getTimeZone("UTC");
                instanceForSkeleton.setTimeZone(timeZone);
                unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
                instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                formatDateTime = instanceForSkeleton.format(new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.D = formatDateTime;
        }
        return this.D;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2688x.compareTo(((r) obj).f2688x);
    }

    public final int d(r rVar) {
        if (this.f2688x instanceof GregorianCalendar) {
            return (rVar.f2689y - this.f2689y) + ((rVar.f2690z - this.f2690z) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f2689y == rVar.f2689y && this.f2690z == rVar.f2690z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2689y), Integer.valueOf(this.f2690z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f2690z);
        parcel.writeInt(this.f2689y);
    }
}
