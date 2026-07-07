package a4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import db.k0;
import h8.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import u1.g;
import u1.t;
import v3.d;
import v3.l;
import v3.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements m {
    public static final Pattern A = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern B = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: x, reason: collision with root package name */
    public final StringBuilder f565x = new StringBuilder();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f566y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final t f567z = new t();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r22.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r22.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0055, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005c, code lost:
    
        if (r22.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0068, code lost:
    
        if (r22.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006f, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007c, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t1.b a(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.a.a(android.text.Spanned, java.lang.String):t1.b");
    }

    public static long b(Matcher matcher, int i6) {
        long j;
        String group = matcher.group(i6 + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i6 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j;
        String group3 = matcher.group(i6 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i6 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override // v3.m
    public final int B() {
        return 1;
    }

    @Override // v3.m
    public final /* synthetic */ d g(byte[] bArr, int i6, int i10) {
        return c.a(this, bArr, i10);
    }

    @Override // v3.m
    public final void o(byte[] bArr, int i6, int i10, l lVar, g gVar) {
        ArrayList arrayList;
        String l10;
        String str;
        a aVar = this;
        long j = lVar.f13283a;
        t tVar = aVar.f567z;
        tVar.I(i6 + i10, bArr);
        tVar.K(i6);
        Charset G = tVar.G();
        if (G == null) {
            G = StandardCharsets.UTF_8;
        }
        long j10 = -9223372036854775807L;
        if (j != -9223372036854775807L && lVar.f13284b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String l11 = tVar.l(G);
            if (l11 == null) {
                break;
            }
            if (!l11.isEmpty()) {
                try {
                    Integer.parseInt(l11);
                    l10 = tVar.l(G);
                } catch (NumberFormatException unused) {
                    u1.a.p("SubripParser", "Skipping invalid index: ".concat(l11));
                }
                if (l10 == null) {
                    u1.a.p("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = A.matcher(l10);
                if (matcher.matches()) {
                    long b10 = b(matcher, 1);
                    long b11 = b(matcher, 6);
                    StringBuilder sb2 = aVar.f565x;
                    sb2.setLength(0);
                    ArrayList arrayList2 = aVar.f566y;
                    arrayList2.clear();
                    String l12 = tVar.l(G);
                    while (!TextUtils.isEmpty(l12)) {
                        long j11 = j10;
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = l12.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = B.matcher(trim);
                        int i11 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i11;
                            int length = group.length();
                            sb3.replace(start, start + length, HttpUrl.FRAGMENT_ENCODE_SET);
                            i11 += length;
                            j = j;
                        }
                        sb2.append(sb3.toString());
                        l12 = tVar.l(G);
                        j10 = j11;
                    }
                    long j12 = j;
                    long j13 = j10;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            str = (String) arrayList2.get(i12);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i12++;
                            }
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j12 != j13 && b11 < j12) {
                        if (arrayList != null) {
                            arrayList.add(new v3.a(b10, b11 - b10, k0.o(a(fromHtml, str))));
                        }
                    } else {
                        gVar.accept(new v3.a(b10, b11 - b10, k0.o(a(fromHtml, str))));
                    }
                    aVar = this;
                    j10 = j13;
                    j = j12;
                } else {
                    u1.a.p("SubripParser", "Skipping invalid timing: ".concat(l10));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                gVar.accept((v3.a) obj);
            }
        }
    }

    @Override // v3.m
    public final /* synthetic */ void reset() {
    }
}
