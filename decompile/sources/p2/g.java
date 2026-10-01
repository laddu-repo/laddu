package p2;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import r1.l0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends com.unity3d.scar.adapter.common.f {

    /* renamed from: e, reason: collision with root package name */
    public final String f10494e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f10495f;

    /* renamed from: g, reason: collision with root package name */
    public int f10496g;

    /* renamed from: h, reason: collision with root package name */
    public String f10497h;

    /* renamed from: i, reason: collision with root package name */
    public long f10498i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f10499k;

    /* renamed from: l, reason: collision with root package name */
    public int f10500l;

    /* renamed from: m, reason: collision with root package name */
    public int f10501m;

    /* renamed from: n, reason: collision with root package name */
    public int f10502n;

    /* renamed from: o, reason: collision with root package name */
    public int f10503o;

    /* renamed from: p, reason: collision with root package name */
    public String f10504p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f10505q;

    /* renamed from: r, reason: collision with root package name */
    public long f10506r;

    public g(com.unity3d.scar.adapter.common.f fVar, String str) {
        super(fVar, str, "StreamIndex");
        this.f10494e = str;
        this.f10495f = new LinkedList();
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final void d(Object obj) {
        if (obj instanceof q) {
            this.f10495f.add((q) obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 p2.b, still in use, count: 2, list:
          (r3v0 p2.b) from 0x007f: MOVE (r27v0 p2.b) = (r3v0 p2.b) (LINE:128)
          (r3v0 p2.b) from 0x004c: MOVE (r27v2 p2.b) = (r3v0 p2.b) (LINE:77)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.unity3d.scar.adapter.common.f
    public final java.lang.Object e() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.g.e():java.lang.Object");
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final boolean g(String str) {
        return "c".equals(str);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final void m(XmlPullParser xmlPullParser) {
        int i6 = 1;
        if ("c".equals(xmlPullParser.getName())) {
            int size = this.f10505q.size();
            long k8 = com.unity3d.scar.adapter.common.f.k(xmlPullParser, "t", -9223372036854775807L);
            if (k8 == -9223372036854775807L) {
                if (size == 0) {
                    k8 = 0;
                } else if (this.f10506r != -1) {
                    k8 = this.f10506r + ((Long) this.f10505q.get(size - 1)).longValue();
                } else {
                    throw l0.b("Unable to infer start time", null);
                }
            }
            this.f10505q.add(Long.valueOf(k8));
            this.f10506r = com.unity3d.scar.adapter.common.f.k(xmlPullParser, "d", -9223372036854775807L);
            long k9 = com.unity3d.scar.adapter.common.f.k(xmlPullParser, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, 1L);
            if (k9 > 1 && this.f10506r == -9223372036854775807L) {
                throw l0.b("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i6;
                if (j < k9) {
                    this.f10505q.add(Long.valueOf((this.f10506r * j) + k8));
                    i6++;
                } else {
                    return;
                }
            }
        } else {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (!MimeTypes.BASE_TYPE_AUDIO.equalsIgnoreCase(attributeValue)) {
                    if (MimeTypes.BASE_TYPE_VIDEO.equalsIgnoreCase(attributeValue)) {
                        i6 = 2;
                    } else if ("text".equalsIgnoreCase(attributeValue)) {
                        i6 = 3;
                    } else {
                        throw l0.b("Invalid key value[" + attributeValue + "]", null);
                    }
                }
                this.f10496g = i6;
                o(Integer.valueOf(i6), "Type");
                if (this.f10496g == 3) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                    if (attributeValue2 != null) {
                        this.f10497h = attributeValue2;
                    } else {
                        throw new e3.d("Subtype", 1);
                    }
                } else {
                    this.f10497h = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                o(this.f10497h, "Subtype");
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
                this.j = attributeValue3;
                o(attributeValue3, "Name");
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
                if (attributeValue4 != null) {
                    this.f10499k = attributeValue4;
                    this.f10500l = com.unity3d.scar.adapter.common.f.j(xmlPullParser, "MaxWidth");
                    this.f10501m = com.unity3d.scar.adapter.common.f.j(xmlPullParser, "MaxHeight");
                    this.f10502n = com.unity3d.scar.adapter.common.f.j(xmlPullParser, "DisplayWidth");
                    this.f10503o = com.unity3d.scar.adapter.common.f.j(xmlPullParser, "DisplayHeight");
                    String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
                    this.f10504p = attributeValue5;
                    o(attributeValue5, "Language");
                    long j10 = com.unity3d.scar.adapter.common.f.j(xmlPullParser, "TimeScale");
                    this.f10498i = j10;
                    if (j10 == -1) {
                        this.f10498i = ((Long) f("TimeScale")).longValue();
                    }
                    this.f10505q = new ArrayList();
                    return;
                }
                throw new e3.d("Url", 1);
            }
            throw new e3.d("Type", 1);
        }
    }
}
