package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum ci {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);

    public static final ci[] A = new ci[26];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final char f2550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f2553y;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    static {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ci.<clinit>():void");
    }

    ci(char c10, int i, String str, boolean z2) {
        this.f2550v = c10;
        this.f2551w = i;
        di diVar = di.f2587e;
        int i10 = true != z2 ? 0 : 128;
        for (int i11 = 0; i11 < str.length(); i11++) {
            int iCharAt = ((int) ((di.f2586d >>> ((str.charAt(i11) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i10 |= 1 << iCharAt;
        }
        this.f2552x = i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 1);
        sb2.append("%");
        sb2.append(c10);
        this.f2553y = sb2.toString();
    }
}
