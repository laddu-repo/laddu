package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2178b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2179a;

    public d0(int i6) {
        this.f2179a = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            int i6 = ((d0) obj).f2179a;
            int i10 = this.f2179a;
            if (i10 != 0) {
                if (i10 == i6) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f2179a;
        if (i6 != 0) {
            return ((i6 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i6 = this.f2179a;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        str = "null";
                    } else {
                        str = "NO_CHECKS";
                    }
                } else {
                    str = "SKIP_SECURITY_CHECK";
                }
            } else {
                str = "SKIP_COMPLIANCE_CHECK";
            }
        } else {
            str = "ALL_CHECKS";
        }
        StringBuilder sb2 = new StringBuilder("READ_AND_WRITE".length() + str.length() + HttpUrl.FRAGMENT_ENCODE_SET.length() + 73 + 91 + 1);
        r4.a.u(sb2, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb2.append("}");
        return sb2.toString();
    }
}
