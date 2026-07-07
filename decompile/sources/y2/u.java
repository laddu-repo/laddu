package y2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r1.i0;
import r1.j0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14943c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f14944a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f14945b = -1;

    public final boolean a(String str) {
        Matcher matcher = f14943c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = u1.a0.f12750a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f14944a = parseInt;
                    this.f14945b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(j0 j0Var) {
        int i6 = 0;
        while (true) {
            i0[] i0VarArr = j0Var.f11523a;
            if (i6 < i0VarArr.length) {
                i0 i0Var = i0VarArr[i6];
                if (i0Var instanceof m3.e) {
                    m3.e eVar = (m3.e) i0Var;
                    if ("iTunSMPB".equals(eVar.f8572c) && a(eVar.f8573d)) {
                        return;
                    }
                } else if (i0Var instanceof m3.l) {
                    m3.l lVar = (m3.l) i0Var;
                    if ("com.apple.iTunes".equals(lVar.f8585b) && "iTunSMPB".equals(lVar.f8586c) && a(lVar.f8587d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i6++;
            } else {
                return;
            }
        }
    }
}
