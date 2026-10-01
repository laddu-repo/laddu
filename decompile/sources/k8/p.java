package k8;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p f = new p((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f7686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f7688e;

    public p(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(c2.class);
        this.f7688e = enumMap;
        enumMap.put(c2.f7424y, bool == null ? a2.f7373w : bool.booleanValue() ? a2.f7376z : a2.f7375y);
        this.f7684a = i;
        this.f7685b = d();
        this.f7686c = bool2;
        this.f7687d = str;
    }

    public static p b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(c2.class);
        c2[] c2VarArr = b2.DMA.f7402v;
        int length = c2VarArr.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put(c2VarArr[i11], d2.e(strArrSplit[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new p(enumMap, i, (Boolean) null, (String) null);
    }

    public static p c(int i, Bundle bundle) {
        if (bundle == null) {
            return new p((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(c2.class);
        for (c2 c2Var : b2.DMA.f7402v) {
            enumMap.put(c2Var, d2.d(bundle.getString(c2Var.f7426v)));
        }
        return new p(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final a2 a() {
        a2 a2Var = (a2) this.f7688e.get(c2.f7424y);
        return a2Var == null ? a2.f7373w : a2Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7684a);
        for (c2 c2Var : b2.DMA.f7402v) {
            sb2.append(":");
            sb2.append(d2.h((a2) this.f7688e.get(c2Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7685b.equalsIgnoreCase(pVar.f7685b) && Objects.equals(this.f7686c, pVar.f7686c)) {
            return Objects.equals(this.f7687d, pVar.f7687d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f7686c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f7687d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f7685b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(d2.a(this.f7684a));
        for (c2 c2Var : b2.DMA.f7402v) {
            sb2.append(",");
            sb2.append(c2Var.f7426v);
            sb2.append("=");
            a2 a2Var = (a2) this.f7688e.get(c2Var);
            if (a2Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = a2Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f7686c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f7687d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public p(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(c2.class);
        this.f7688e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f7684a = i;
        this.f7685b = d();
        this.f7686c = bool;
        this.f7687d = str;
    }
}
