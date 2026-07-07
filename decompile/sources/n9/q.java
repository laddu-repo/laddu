package n9;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final q f9438f = new q((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f9439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9440b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f9441c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9442d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f9443e;

    public q(Boolean bool, int i6, Boolean bool2, String str) {
        w1 w1Var;
        EnumMap enumMap = new EnumMap(y1.class);
        this.f9443e = enumMap;
        if (bool == null) {
            w1Var = w1.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            w1Var = w1.GRANTED;
        } else {
            w1Var = w1.DENIED;
        }
        enumMap.put((EnumMap) y1.AD_USER_DATA, (y1) w1Var);
        this.f9439a = i6;
        this.f9440b = d();
        this.f9441c = bool2;
        this.f9442d = str;
    }

    public static q b(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(y1.class);
            y1[] y1VarArr = x1.DMA.f9528x;
            int length = y1VarArr.length;
            int i6 = 1;
            int i10 = 0;
            while (i10 < length) {
                enumMap.put((EnumMap) y1VarArr[i10], (y1) z1.e(split[i6].charAt(0)));
                i10++;
                i6++;
            }
            return new q(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f9438f;
    }

    public static q c(int i6, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new q((Boolean) null, i6, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(y1.class);
        for (y1 y1Var : x1.DMA.f9528x) {
            enumMap.put((EnumMap) y1Var, (y1) z1.d(bundle.getString(y1Var.f9536x)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new q(enumMap, i6, bool, bundle.getString("cps_display_str"));
    }

    public final w1 a() {
        w1 w1Var = (w1) this.f9443e.get(y1.AD_USER_DATA);
        if (w1Var == null) {
            return w1.UNINITIALIZED;
        }
        return w1Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9439a);
        for (y1 y1Var : x1.DMA.f9528x) {
            sb2.append(":");
            sb2.append(z1.h((w1) this.f9443e.get(y1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f9440b.equalsIgnoreCase(qVar.f9440b) && Objects.equals(this.f9441c, qVar.f9441c)) {
                return Objects.equals(this.f9442d, qVar.f9442d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode;
        Boolean bool = this.f9441c;
        if (bool == null) {
            i6 = 3;
        } else if (true != bool.booleanValue()) {
            i6 = 13;
        } else {
            i6 = 7;
        }
        String str = this.f9442d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + this.f9440b.hashCode() + (i6 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(z1.a(this.f9439a));
        for (y1 y1Var : x1.DMA.f9528x) {
            sb2.append(",");
            sb2.append(y1Var.f9536x);
            sb2.append("=");
            w1 w1Var = (w1) this.f9443e.get(y1Var);
            if (w1Var == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = w1Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                sb2.append("granted");
                            }
                        } else {
                            sb2.append("denied");
                        }
                    } else {
                        sb2.append("eu_consent_policy");
                    }
                } else {
                    sb2.append("uninitialized");
                }
            }
        }
        Boolean bool = this.f9441c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f9442d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public q(EnumMap enumMap, int i6, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(y1.class);
        this.f9443e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f9439a = i6;
        this.f9440b = d();
        this.f9441c = bool;
        this.f9442d = str;
    }
}
