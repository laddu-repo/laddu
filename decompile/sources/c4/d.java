package c4;

import androidx.media3.decoder.DecoderInputBuffer;
import g4.n0;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import r2.m;
import r2.p;
import r2.q;
import s2.r;
import t1.o;
import va.f0;
import va.q1;
import y9.v;
import y9.x;
import y9.y0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2079v;

    public /* synthetic */ d(int i) {
        this.f2079v = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Date date;
        switch (this.f2079v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return Integer.compare(((e) obj).f2081a.f2084b, ((e) obj2).f2081a.f2084b);
            case 1:
                return Long.compare(((c) obj).f2077b, ((c) obj2).f2077b);
            case 2:
                g2.b bVar = (g2.b) obj;
                g2.b bVar2 = (g2.b) obj2;
                int iCompare = Integer.compare(bVar.f5413c, bVar2.f5413c);
                return iCompare != 0 ? iCompare : bVar.f5412b.compareTo(bVar2.f5412b);
            case 3:
                n0 n0Var = (n0) obj;
                n0 n0Var2 = (n0) obj2;
                int iCompare2 = Integer.compare(n0Var2.f5524b, n0Var.f5524b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = n0Var.f5525c.compareTo(n0Var2.f5525c);
                return iCompareTo != 0 ? iCompareTo : n0Var.f5526d.compareTo(n0Var2.f5526d);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                n0 n0Var3 = (n0) obj;
                n0 n0Var4 = (n0) obj2;
                int iCompare3 = Integer.compare(n0Var4.f5523a, n0Var3.f5523a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = n0Var4.f5525c.compareTo(n0Var3.f5525c);
                return iCompareTo2 != 0 ? iCompareTo2 : n0Var4.f5526d.compareTo(n0Var3.f5526d);
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                return ((j2.d) obj).f6661a.compareTo(((j2.d) obj2).f6661a);
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                pc.e eVar = (pc.e) obj;
                pc.e eVar2 = (pc.e) obj2;
                eVar.getClass();
                Date date2 = null;
                try {
                    date = new SimpleDateFormat("dd/MM/yyyy|HH:mm:ss").parse(eVar.f10504j + "|" + eVar.i);
                    break;
                } catch (ParseException unused) {
                    date = null;
                }
                eVar2.getClass();
                try {
                    date2 = new SimpleDateFormat("dd/MM/yyyy|HH:mm:ss").parse(eVar2.f10504j + "|" + eVar2.i);
                    break;
                } catch (ParseException unused2) {
                }
                if (date == null && date2 == null) {
                    return 0;
                }
                if (date == null) {
                    return 1;
                }
                if (date2 == null) {
                    return -1;
                }
                return date.compareTo(date2);
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b9 = bArr[i];
                    byte b10 = bArr2[i];
                    if (b9 != b10) {
                        return b9 - b10;
                    }
                }
                return 0;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                return ((o) obj2).f12057j - ((o) obj).f12057j;
            case 9:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 10:
                return Integer.compare(((r2.g) ((List) obj).get(0)).A, ((r2.g) ((List) obj2).get(0)).A);
            case 11:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i10 = 15;
                return v.f(p.c((p) Collections.max(list, new d(14)), (p) Collections.max(list2, new d(14)))).a(list.size(), list2.size()).b((p) Collections.max(list, new d(i10)), (p) Collections.max(list2, new d(i10)), new d(i10)).e();
            case 12:
                return ((r2.f) Collections.max((List) obj)).compareTo((r2.f) Collections.max((List) obj2));
            case 13:
                return ((m) ((List) obj).get(0)).compareTo((m) ((List) obj2).get(0));
            case 14:
                return p.c((p) obj, (p) obj2);
            case 15:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                boolean z2 = pVar.f11111z;
                int i11 = pVar.E;
                y0 y0VarA = (z2 && pVar.C) ? q.f11112k : q.f11112k.a();
                boolean z10 = pVar.A.f12170s;
                x xVarB = x.f14627a;
                if (z10) {
                    xVarB = xVarB.b(Integer.valueOf(i11), Integer.valueOf(pVar2.E), q.f11112k.a());
                }
                return xVarB.b(Integer.valueOf(pVar.F), Integer.valueOf(pVar2.F), y0VarA).b(Integer.valueOf(i11), Integer.valueOf(pVar2.E), y0VarA).e();
            case 16:
                return ((r) obj).f11475a - ((r) obj2).f11475a;
            case 17:
                return Float.compare(((r) obj).f11477c, ((r) obj2).f11477c);
            case 18:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 19:
                return ((f0) ((q1) obj)).f13337a.compareTo(((f0) ((q1) obj2)).f13337a);
            case 20:
                return Integer.compare(((u3.d) obj2).f12842b, ((u3.d) obj).f12842b);
            case 21:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i12 = ya.a.f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
        }
    }
}
