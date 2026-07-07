package f8;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseArray f5146x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ u[] f5147y;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Enum r02 = new Enum("MOBILE", 0);
        Enum r12 = new Enum("WIFI", 1);
        Enum r32 = new Enum("MOBILE_MMS", 2);
        Enum r52 = new Enum("MOBILE_SUPL", 3);
        Enum r72 = new Enum("MOBILE_DUN", 4);
        Enum r92 = new Enum("MOBILE_HIPRI", 5);
        Enum r11 = new Enum("WIMAX", 6);
        Enum r13 = new Enum("BLUETOOTH", 7);
        Enum r15 = new Enum("DUMMY", 8);
        Enum r14 = new Enum("ETHERNET", 9);
        Enum r122 = new Enum("MOBILE_FOTA", 10);
        Enum r10 = new Enum("MOBILE_IMS", 11);
        Enum r82 = new Enum("MOBILE_CBS", 12);
        Enum r62 = new Enum("WIFI_P2P", 13);
        Enum r42 = new Enum("MOBILE_IA", 14);
        Enum r22 = new Enum("MOBILE_EMERGENCY", 15);
        Enum r63 = new Enum("PROXY", 16);
        Enum r43 = new Enum("VPN", 17);
        Enum r23 = new Enum("NONE", 18);
        f5147y = new u[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r14, r122, r10, r82, r62, r42, r22, r63, r43, r23};
        SparseArray sparseArray = new SparseArray();
        f5146x = sparseArray;
        sparseArray.put(0, r02);
        sparseArray.put(1, r12);
        sparseArray.put(2, r32);
        sparseArray.put(3, r52);
        sparseArray.put(4, r72);
        sparseArray.put(5, r92);
        sparseArray.put(6, r11);
        sparseArray.put(7, r13);
        sparseArray.put(8, r15);
        sparseArray.put(9, r14);
        sparseArray.put(10, r122);
        sparseArray.put(11, r10);
        sparseArray.put(12, r82);
        sparseArray.put(13, r62);
        sparseArray.put(14, r42);
        sparseArray.put(15, r22);
        sparseArray.put(16, r63);
        sparseArray.put(17, r43);
        sparseArray.put(-1, r23);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f5147y.clone();
    }
}
