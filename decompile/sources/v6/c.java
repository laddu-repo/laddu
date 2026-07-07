package v6;

import android.graphics.Bitmap;
import com.google.protobuf.CodedOutputStream;
import gf.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final y f13343a;

    /* renamed from: b, reason: collision with root package name */
    public final y f13344b;

    /* renamed from: c, reason: collision with root package name */
    public final y f13345c;

    /* renamed from: d, reason: collision with root package name */
    public final y f13346d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.d f13347e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.d f13348f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f13349g;

    /* renamed from: h, reason: collision with root package name */
    public final b f13350h;

    /* renamed from: i, reason: collision with root package name */
    public final b f13351i;
    public final b j;

    public c(y yVar, y yVar2, y yVar3, y yVar4, z6.d dVar, w6.d dVar2, Bitmap.Config config, b bVar, b bVar2, b bVar3) {
        this.f13343a = yVar;
        this.f13344b = yVar2;
        this.f13345c = yVar3;
        this.f13346d = yVar4;
        this.f13347e = dVar;
        this.f13348f = dVar2;
        this.f13349g = config;
        this.f13350h = bVar;
        this.f13351i = bVar2;
        this.j = bVar3;
    }

    public static c a(c cVar, z6.d dVar, int i6) {
        b bVar;
        y yVar = cVar.f13343a;
        y yVar2 = cVar.f13344b;
        y yVar3 = cVar.f13345c;
        y yVar4 = cVar.f13346d;
        if ((i6 & 16) != 0) {
            dVar = cVar.f13347e;
        }
        z6.d dVar2 = dVar;
        w6.d dVar3 = cVar.f13348f;
        Bitmap.Config config = cVar.f13349g;
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        int i10 = i6 & CodedOutputStream.DEFAULT_BUFFER_SIZE;
        b bVar2 = b.ENABLED;
        if (i10 != 0) {
            bVar = cVar.f13350h;
        } else {
            bVar = bVar2;
        }
        if ((i6 & 8192) != 0) {
            bVar2 = cVar.f13351i;
        }
        b bVar3 = cVar.j;
        cVar.getClass();
        return new c(yVar, yVar2, yVar3, yVar4, dVar2, dVar3, config, bVar, bVar2, bVar3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.k.a(this.f13343a, cVar.f13343a) && kotlin.jvm.internal.k.a(this.f13344b, cVar.f13344b) && kotlin.jvm.internal.k.a(this.f13345c, cVar.f13345c) && kotlin.jvm.internal.k.a(this.f13346d, cVar.f13346d) && kotlin.jvm.internal.k.a(this.f13347e, cVar.f13347e) && this.f13348f == cVar.f13348f && this.f13349g == cVar.f13349g && this.f13350h == cVar.f13350h && this.f13351i == cVar.f13351i && this.j == cVar.j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f13351i.hashCode() + ((this.f13350h.hashCode() + ((((((this.f13349g.hashCode() + ((this.f13348f.hashCode() + ((this.f13347e.hashCode() + ((this.f13346d.hashCode() + ((this.f13345c.hashCode() + ((this.f13344b.hashCode() + (this.f13343a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + 1231) * 31) + 1237) * 923521)) * 31)) * 31);
    }
}
