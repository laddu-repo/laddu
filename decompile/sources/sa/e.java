package sa;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f11608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashMap f11609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e[] f11610x;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("X86_32", 0);
        e eVar2 = new e("X86_64", 1);
        e eVar3 = new e("ARM_UNKNOWN", 2);
        e eVar4 = new e("PPC", 3);
        e eVar5 = new e("PPC64", 4);
        e eVar6 = new e("ARMV6", 5);
        e eVar7 = new e("ARMV7", 6);
        e eVar8 = new e("UNKNOWN", 7);
        f11608v = eVar8;
        e eVar9 = new e("ARMV7S", 8);
        e eVar10 = new e("ARM64", 9);
        f11610x = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10};
        HashMap map = new HashMap(4);
        f11609w = map;
        map.put("armeabi-v7a", eVar7);
        map.put("armeabi", eVar6);
        map.put("arm64-v8a", eVar10);
        map.put("x86", eVar);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11610x.clone();
    }
}
