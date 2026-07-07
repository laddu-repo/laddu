package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2507a;

    public /* synthetic */ w0(int i6) {
        this.f2507a = i6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2507a) {
            case 0:
                int z10 = s1.c.z(parcel);
                Bundle bundle = null;
                String str = null;
                long j = 0;
                long j10 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 7) {
                                    if (c10 != '\b') {
                                        s1.c.y(parcel, readInt);
                                    } else {
                                        str = s1.c.h(parcel, readInt);
                                    }
                                } else {
                                    bundle = s1.c.f(parcel, readInt);
                                }
                            } else {
                                z11 = s1.c.q(parcel, readInt);
                            }
                        } else {
                            j10 = s1.c.s(parcel, readInt);
                        }
                    } else {
                        j = s1.c.s(parcel, readInt);
                    }
                }
                s1.c.k(parcel, z10);
                return new v0(j, j10, z11, bundle, str);
            default:
                int z12 = s1.c.z(parcel);
                String str2 = null;
                Intent intent = null;
                int i6 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                s1.c.y(parcel, readInt2);
                            } else {
                                intent = (Intent) s1.c.g(parcel, readInt2, Intent.CREATOR);
                            }
                        } else {
                            str2 = s1.c.h(parcel, readInt2);
                        }
                    } else {
                        i6 = s1.c.r(parcel, readInt2);
                    }
                }
                s1.c.k(parcel, z12);
                return new x0(i6, str2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        switch (this.f2507a) {
            case 0:
                return new v0[i6];
            default:
                return new x0[i6];
        }
    }
}
