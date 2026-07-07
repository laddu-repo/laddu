package z3;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u1.a0;
import u1.t;
import v3.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements m {
    public static final Pattern D = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public LinkedHashMap A;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15137x;

    /* renamed from: y, reason: collision with root package name */
    public final x3.b f15138y;
    public float B = -3.4028235E38f;
    public float C = -3.4028235E38f;

    /* renamed from: z, reason: collision with root package name */
    public final t f15139z = new t();

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f15137x = true;
            String o10 = a0.o((byte[]) list.get(0));
            u1.c.b(o10.startsWith("Format:"));
            x3.b a10 = x3.b.a(o10);
            a10.getClass();
            this.f15138y = a10;
            b(new t((byte[]) list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.f15137x = false;
        this.f15138y = null;
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i6;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i6 = size + 1;
                    break;
                }
                size--;
            } else {
                i6 = 0;
                break;
            }
        }
        arrayList.add(i6, Long.valueOf(j));
        if (i6 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i6 - 1));
        }
        arrayList2.add(i6, arrayList3);
        return i6;
    }

    public static long c(String str) {
        Matcher matcher = D.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = a0.f12750a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // v3.m
    public final int B() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(u1.t r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.b(u1.t, java.nio.charset.Charset):void");
    }

    @Override // v3.m
    public final /* synthetic */ v3.d g(byte[] bArr, int i6, int i10) {
        return h8.c.a(this, bArr, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0285, code lost:
    
        if (r8 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0289, code lost:
    
        if (r22 == (-3.4028235E38f)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028d, code lost:
    
        if (r19 == (-3.4028235E38f)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028f, code lost:
    
        r27 = r8.x / r19;
        r24 = r8.y / r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d1, code lost:
    
        r19 = new t1.b(r11, r21, null, null, r24, 0, r1, r27, r9, r29, r30, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r37);
        r1 = a(r13, r7, r6);
        r3 = a(r4, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f4, code lost:
    
        if (r1 >= r3) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f6, code lost:
    
        ((java.util.List) r6.get(r1)).add(r19);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029c, code lost:
    
        r10 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a4, code lost:
    
        if (r9 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a6, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a7, code lost:
    
        if (r9 == 1) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a9, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02aa, code lost:
    
        if (r9 == 2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ac, code lost:
    
        r16 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02bd, code lost:
    
        if (r1 == 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02bf, code lost:
    
        if (r1 == r12) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02c1, code lost:
    
        if (r1 == r15) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02c3, code lost:
    
        r10 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02cd, code lost:
    
        r24 = r10;
        r27 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c7, code lost:
    
        r10 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ca, code lost:
    
        r10 = 0.05f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b0, code lost:
    
        r16 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b4, code lost:
    
        r15 = 2;
        r16 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b8, code lost:
    
        r12 = 1;
        r15 = 2;
        r16 = 0.05f;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    @Override // v3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(byte[] r44, int r45, int r46, v3.l r47, u1.g r48) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.o(byte[], int, int, v3.l, u1.g):void");
    }

    @Override // v3.m
    public final /* synthetic */ void reset() {
    }
}
