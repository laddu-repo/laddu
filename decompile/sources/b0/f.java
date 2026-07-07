package b0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final o f1239d;

    /* renamed from: f, reason: collision with root package name */
    public int f1241f;

    /* renamed from: g, reason: collision with root package name */
    public int f1242g;

    /* renamed from: a, reason: collision with root package name */
    public o f1236a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1237b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1238c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1240e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f1243h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f1244i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1245k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1246l = new ArrayList();

    public f(o oVar) {
        this.f1239d = oVar;
    }

    @Override // b0.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f1246l;
        int size = arrayList.size();
        int i6 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((f) obj).j) {
                return;
            }
        }
        this.f1238c = true;
        o oVar = this.f1236a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f1237b) {
            this.f1239d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.j) {
            g gVar = this.f1244i;
            if (gVar != null) {
                if (gVar.j) {
                    this.f1241f = this.f1243h * gVar.f1242g;
                } else {
                    return;
                }
            }
            d(fVar.f1242g + this.f1241f);
        }
        o oVar2 = this.f1236a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f1245k.add(oVar);
        if (this.j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f1246l.clear();
        this.f1245k.clear();
        this.j = false;
        this.f1242g = 0;
        this.f1238c = false;
        this.f1237b = false;
    }

    public void d(int i6) {
        if (!this.j) {
            this.j = true;
            this.f1242g = i6;
            ArrayList arrayList = this.f1245k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1239d.f1261b.f45h0);
        sb2.append(":");
        switch (this.f1240e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.f1242g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f1246l.size());
        sb2.append(":d=");
        sb2.append(this.f1245k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
