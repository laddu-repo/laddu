package p2;

import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import r1.l;
import r1.l0;
import r1.m;
import r1.p;
import r1.q;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends com.unity3d.scar.adapter.common.f {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f10486e;

    /* renamed from: f, reason: collision with root package name */
    public int f10487f;

    /* renamed from: g, reason: collision with root package name */
    public int f10488g;

    /* renamed from: h, reason: collision with root package name */
    public long f10489h;

    /* renamed from: i, reason: collision with root package name */
    public long f10490i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f10491k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10492l;

    /* renamed from: m, reason: collision with root package name */
    public a f10493m;

    public f(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f10491k = -1;
        this.f10493m = null;
        this.f10486e = new LinkedList();
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final void d(Object obj) {
        boolean z10;
        if (obj instanceof b) {
            this.f10486e.add((b) obj);
            return;
        }
        if (obj instanceof a) {
            if (this.f10493m == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            this.f10493m = (a) obj;
        }
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final Object e() {
        a aVar;
        long Y;
        LinkedList linkedList = this.f10486e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar2 = this.f10493m;
        if (aVar2 != null) {
            m mVar = new m(new l(aVar2.f10456a, null, "video/mp4", aVar2.f10457b));
            for (int i6 = 0; i6 < size; i6++) {
                b bVar = bVarArr[i6];
                int i10 = bVar.f10459a;
                if (i10 == 2 || i10 == 1) {
                    q[] qVarArr = bVar.j;
                    for (int i11 = 0; i11 < qVarArr.length; i11++) {
                        p a10 = qVarArr[i11].a();
                        a10.f11615q = mVar;
                        qVarArr[i11] = new q(a10);
                    }
                }
            }
        }
        int i12 = this.f10487f;
        int i13 = this.f10488g;
        long j = this.f10489h;
        long j10 = this.f10490i;
        long j11 = this.j;
        int i14 = this.f10491k;
        boolean z10 = this.f10492l;
        a aVar3 = this.f10493m;
        long j12 = -9223372036854775807L;
        if (j10 == 0) {
            aVar = aVar3;
            Y = -9223372036854775807L;
        } else {
            String str = a0.f12750a;
            aVar = aVar3;
            Y = a0.Y(j10, 1000000L, j, RoundingMode.DOWN);
        }
        if (j11 != 0) {
            String str2 = a0.f12750a;
            j12 = a0.Y(j11, 1000000L, j, RoundingMode.DOWN);
        }
        return new c(i12, i13, Y, j12, i14, z10, aVar, bVarArr);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final void m(XmlPullParser xmlPullParser) {
        boolean z10;
        this.f10487f = com.unity3d.scar.adapter.common.f.l(xmlPullParser, "MajorVersion");
        this.f10488g = com.unity3d.scar.adapter.common.f.l(xmlPullParser, "MinorVersion");
        this.f10489h = com.unity3d.scar.adapter.common.f.k(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue != null) {
            try {
                this.f10490i = Long.parseLong(attributeValue);
                this.j = com.unity3d.scar.adapter.common.f.k(xmlPullParser, "DVRWindowLength", 0L);
                this.f10491k = com.unity3d.scar.adapter.common.f.j(xmlPullParser, "LookaheadCount");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                if (attributeValue2 != null) {
                    z10 = Boolean.parseBoolean(attributeValue2);
                } else {
                    z10 = false;
                }
                this.f10492l = z10;
                o(Long.valueOf(this.f10489h), "TimeScale");
                return;
            } catch (NumberFormatException e10) {
                throw l0.b(null, e10);
            }
        }
        throw new e3.d("Duration", 1);
    }
}
